package mx.edu.itcm.businessentities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	public Person findOneById(Integer businessEntityID);
	public Person finOneByFrsName(String personFrsName);
	public Person finOneByLsName(String personLsName);
	public Person findOneByPerType(String personType);
}