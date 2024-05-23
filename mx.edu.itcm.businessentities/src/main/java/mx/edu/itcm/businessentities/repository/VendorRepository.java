package mx.edu.itcm.businessentities.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.edu.itcm.businessentities.entity.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Integer>{
	//public Vendor findOneById(Integer id);
	public List<Vendor> findOneByAccountNumber(String accNumber);
	public List<Vendor> findByName(String name);
}
