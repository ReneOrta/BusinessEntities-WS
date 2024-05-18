package mx.edu.itcm.businessentities.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.edu.itcm.businessentities.dto.StoreDto;
import mx.edu.itcm.businessentities.dto.StoreDtoResponse;

@Service 
public interface StoreService {
	public StoreDtoResponse create (StoreDto store)throws Exception;
	public StoreDtoResponse findOneById(int businessEntityID);
	public List<StoreDtoResponse> findByName(String name);
	public StoreDtoResponse save(StoreDto newStore);
	public List<StoreDtoResponse> getAll();
	public StoreDtoResponse update(StoreDtoResponse newStore);
}