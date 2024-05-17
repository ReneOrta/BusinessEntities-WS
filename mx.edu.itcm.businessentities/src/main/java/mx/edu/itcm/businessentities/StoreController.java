package mx.edu.itcm.businessentities;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import mx.edu.itcm.businessentities.dto.StoreDto;
import mx.edu.itcm.businessentities.dto.StoreDtoResponse;
import mx.edu.itcm.businessentities.service.StoreService;

@RestController
@RequestMapping(path="/stores")
public class StoreController {
	
	String prueba="hola store";
	
	 @GetMapping("/prueba")
		public String getPrueba() {
			return prueba;
		}	
	
	@Autowired
	StoreService storeService;
	
	 @PostMapping("")
	 StoreDtoResponse newStore(@RequestBody StoreDto newStore) {
		 try {
			 return storeService.create(newStore);
		 }catch(Exception e) {
			 System.out.println(e.toString());
			 throw new ResponseStatusException( 
			          HttpStatus.BAD_REQUEST, "No pudo registrarse la tienda debido a información incorrecta", e);
		 }
	 }
	
	 @PutMapping("")
		StoreDtoResponse updateStore(@RequestBody StoreDtoResponse newStore) {
			System.out.println(newStore.toString());
			try {
				 return storeService.update(newStore);
			 }catch(Exception e) {
				 throw new ResponseStatusException(
				          HttpStatus.BAD_REQUEST, "No se pudieron actualizar los datos de la tienda debido a información incorrecta", e);
			 }
		}
	
	
	 @GetMapping("")
		public List<StoreDtoResponse> getStore() {
		 try {
			return storeService.getAll();
		 }catch(Exception e) {
			 System.out.println(e.toString());
			 e.printStackTrace();
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No se pudieron actualizar los datos de la tienda debido a información incorrecta", e);
		 }
		}
	
	 @GetMapping("/name")
		public StoreDtoResponse getStoreName(@RequestParam String storeName) {
			return storeService.findOneByName(storeName);
		}//*/
	 
}