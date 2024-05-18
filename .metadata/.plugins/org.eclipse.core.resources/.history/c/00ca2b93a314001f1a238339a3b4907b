package mx.edu.itcm.businessentities.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.itcm.businessentities.dto.VendorDto;
import mx.edu.itcm.businessentities.dto.VendorDtoResponse;
import mx.edu.itcm.businessentities.entity.Vendor;

@Service
public interface VendorService {
	public VendorDtoResponse create(VendorDto vendor)throws Exception;
	public VendorDtoResponse findOneById(Integer id);
	public VendorDtoResponse findOneByAccountNumber(String accNumber);
	public VendorDtoResponse findOneByName(String name);
	public VendorDtoResponse save(VendorDto newVendor);
	public List<VendorDtoResponse> getAll();
	public VendorDtoResponse update(VendorDtoResponse newVendor);
}
