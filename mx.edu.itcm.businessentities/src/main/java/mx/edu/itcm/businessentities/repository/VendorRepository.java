package mx.edu.itcm.businessentities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.itcm.businessentities.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Integer>{
	//public Vendor findOneById(Integer id);
	public Vendor findOneByAccountNumber(String accNumber);
	public Vendor findOneByName(String name);
}
