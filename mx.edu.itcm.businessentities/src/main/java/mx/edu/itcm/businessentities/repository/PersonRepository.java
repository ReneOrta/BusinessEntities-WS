package mx.edu.itcm.businessentities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	//public Person findOneById(Integer businessEntityID);
	public Person findOneByFirstName(String personFrsName);
	public Person findOneByLastName(String personLsName);
	public Person findOneByPersonType(String personType);
}