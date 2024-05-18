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

import mx.edu.itcm.businessentities.dto.VendorDto;
import mx.edu.itcm.businessentities.dto.VendorDtoResponse;
import mx.edu.itcm.businessentities.service.VendorService;

@RestController
@RequestMapping(path="/vendors")
public class VendorController {
	@Autowired
	VendorService vendorService;
	
	@PostMapping("")
	 VendorDtoResponse newVendor(@RequestBody VendorDto newVendor) {
		 try {
			 return vendorService.create(newVendor);
		 }catch(Exception e) {
			 System.out.println(e.toString());
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo registrarse el proveedor debido a información incorrecta", e);
		 }
	 }
	
	@PutMapping("")
	VendorDtoResponse updateVendor(@RequestBody VendorDtoResponse newVendor) {
		System.out.println(newVendor.toString());
		try {
			 return vendorService.update(newVendor);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No se pudieron actualizar los datos del proveedor  debido a información incorrecta", e);
		 }
	}
	
	 @GetMapping("")
		public List<VendorDtoResponse> getVendor() {
			return vendorService.getAll();
		}
	 
	 @GetMapping("/vendor-account-number")
	 public VendorDtoResponse getVendorAccount(@RequestParam String vendorAccountNumber) {
		 return vendorService.findOneByAccountNumber(vendorAccountNumber);
	 }
	 
	 @GetMapping("/vendor-name")
		public VendorDtoResponse getVendorName(@RequestParam String vendorName) {
			return vendorService.findOneByName(vendorName);
		}
	
}