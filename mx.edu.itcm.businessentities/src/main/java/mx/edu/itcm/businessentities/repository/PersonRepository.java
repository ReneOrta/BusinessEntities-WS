package mx.edu.itcm.businessentities.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	//public Person findOneById(Integer businessEntityID);
	public List<Person> findByFirstName(String personFrsName);
	public List<Person> findByLastName(String personLsName);
	public List<Person> findByPersonType(String personType);
}