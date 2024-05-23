package mx.edu.itcm.businessentities.service;

import java.util.List;
import org.springframework.stereotype.Service;
import mx.edu.itcm.businessentities.dto.PersonDto;
import mx.edu.itcm.businessentities.dto.PersonDtoResponse;

@Service
public interface PersonService {
	public PersonDtoResponse create(PersonDto person) throws Exception;
	public PersonDtoResponse findOneById(int businessEntityID);
	public List<PersonDtoResponse> findByFirstName(String personFrsName);
	public List<PersonDtoResponse> findByLastName(String personLsName);
	public List<PersonDtoResponse> findByPersonType(String personType);
	public PersonDtoResponse save(PersonDto newPerson);
	public List<PersonDtoResponse> getAll();
	public PersonDtoResponse update(PersonDtoResponse newPerson);
}
