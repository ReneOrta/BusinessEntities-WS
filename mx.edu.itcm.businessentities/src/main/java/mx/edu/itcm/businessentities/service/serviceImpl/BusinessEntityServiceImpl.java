package mx.edu.itcm.businessentities.service.serviceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import mx.edu.itcm.businessentities.dto.BusinessEntityDto;
import mx.edu.itcm.businessentities.dto.BusinessEntityDtoResponse;
import mx.edu.itcm.businessentities.entity.BusinessEntity;
import mx.edu.itcm.businessentities.repository.BusinessEntityRepository;
import mx.edu.itcm.businessentities.service.BusinessEntityService;

@Component
public class BusinessEntityServiceImpl implements BusinessEntityService{
	
	@Autowired BusinessEntityRepository businessEntityRepository;
	@Autowired ModelMapper modelMapper;
	
	@Override
	public BusinessEntityDtoResponse create(BusinessEntityDto businessEntityDto) {
		BusinessEntity businessEntity=modelMapper.map(businessEntityDto, BusinessEntity.class);
		BusinessEntity newBusinessEntity= businessEntityRepository.save(businessEntity);
		return modelMapper.map(newBusinessEntity,BusinessEntityDtoResponse.class);
	}

	@Override
	public BusinessEntityDtoResponse findOneById(int BusinessEntityID) {
		return null;
	}

	@Override
	public List<BusinessEntityDtoResponse> getAll() {
		List<BusinessEntity> businessEntities = businessEntityRepository.findAll();
		List<BusinessEntityDtoResponse> businessEntityDtos= new ArrayList<>();
		for(BusinessEntity businessEntity:businessEntities) {
			BusinessEntityDtoResponse businessEntityDto = modelMapper.map(businessEntity, BusinessEntityDtoResponse.class);
			businessEntityDtos.add(businessEntityDto);
		}
		return businessEntityDtos;
	}

}