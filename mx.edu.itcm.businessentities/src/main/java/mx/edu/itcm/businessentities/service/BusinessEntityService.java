package mx.edu.itcm.businessentities.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import mx.edu.itcm.businessentities.dto.BusinessEntityDto;
import mx.edu.itcm.businessentities.dto.BusinessEntityDtoResponse;

@Service
public interface BusinessEntityService {
	public BusinessEntityDtoResponse create(BusinessEntityDto BusinessEntity);
	public BusinessEntityDtoResponse findOneById(int BusinessEntityID);
	public List<BusinessEntityDtoResponse> getAll();
}
