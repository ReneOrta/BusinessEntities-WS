package mx.edu.itcm.businessentities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
	public Store findOneByName(String Name);
}