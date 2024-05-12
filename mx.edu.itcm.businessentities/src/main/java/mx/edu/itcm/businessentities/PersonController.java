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

import mx.edu.itcm.businessentities.dto.PersonDto;
import mx.edu.itcm.businessentities.dto.PersonDtoResponse;
import mx.edu.itcm.businessentities.service.PersonService;

@RestController
@RequestMapping(path="/persons")
public class PersonController {
	@Autowired
	PersonService personService;
	
	@PostMapping("")
	PersonDtoResponse newPerson(@RequestBody PersonDto newPerson) {
		System.out.println(newPerson.toString());
		try {
			 return personService.create(newPerson);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo ingresarse la persona debido a información incorrecta", e);
		 }
	 }
	
	@PutMapping("")
	PersonDtoResponse updatePerson(@RequestBody PersonDtoResponse newPerson) {
		System.out.println(newPerson.toString());
		try {
			 return personService.update(newPerson);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No se pudieron actualizar los datos la persona debido a información incorrecta", e);
		 }
	}
	
	@GetMapping("")
	public List <PersonDtoResponse> getPerson() {
		return personService.getAll();
	}
	
	 @GetMapping("/person-frs-name")
		public PersonDtoResponse getPersonByFrsName(@RequestParam String personFsNm) {
			return personService.finOneByFrsName(personFsNm);
		}
	 
	 @GetMapping("/person-lst-name")
		public PersonDtoResponse getPersonByLstName(@RequestParam String personLstNm) {
			return personService.finOneByLsName(personLstNm);
		}
	 
	 @GetMapping("/person-type")
		public PersonDtoResponse getPersonByTyper(@RequestParam String personType) {
			return personService.findOneByPerType(personType);
		}
}
