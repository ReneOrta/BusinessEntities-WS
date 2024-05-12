package mx.edu.itcm.businessentities.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.itcm.businessentities.dto.PersonDto;
import mx.edu.itcm.businessentities.dto.PersonDtoResponse;

@Service
public interface PersonService {
	public PersonDtoResponse create(PersonDto person) throws Exception;
	public PersonDtoResponse findOneById(int businessEntityID);
	public PersonDtoResponse finOneByFrsName(String personFrsName);
	public PersonDtoResponse finOneByLsName(String personLsName);
	public PersonDtoResponse findOneByPerType(String personType);
	public PersonDtoResponse save(PersonDto newPerson);
	public List<PersonDtoResponse> getAll();
	public PersonDtoResponse update(PersonDtoResponse newPerson);
}