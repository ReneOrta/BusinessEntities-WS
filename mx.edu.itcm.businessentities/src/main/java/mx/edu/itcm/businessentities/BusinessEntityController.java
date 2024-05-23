package mx.edu.itcm.businessentities;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.edu.itcm.businessentities.dto.BusinessEntityDtoResponse;
import mx.edu.itcm.businessentities.dto.BusinessEntityDto;
import mx.edu.itcm.businessentities.service.BusinessEntityService;

@RestController
@RequestMapping(path="/businessentities")
public class BusinessEntityController {
	
	String prueba="hola business";
	
	 @GetMapping("/prueba")
		public String getprueba() {
			return prueba;
		}
	
	@Autowired
	BusinessEntityService businessEntityService;
	
	 @PostMapping("")
	 BusinessEntityDtoResponse newBusinessEntity(@RequestBody BusinessEntityDto newBusinessEntity) {
		return businessEntityService.create(newBusinessEntity);
	 }
	 
	 @GetMapping("")
		public List<BusinessEntityDtoResponse> getBusinessEntity(){
		 return businessEntityService.getAll();
	 }//*/
}
