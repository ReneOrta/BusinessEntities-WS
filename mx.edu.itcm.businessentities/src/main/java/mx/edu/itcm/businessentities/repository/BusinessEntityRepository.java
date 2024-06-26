package mx.edu.itcm.businessentities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.BusinessEntity;

@Repository
public interface BusinessEntityRepository extends JpaRepository<BusinessEntity, Integer> {
	
}
