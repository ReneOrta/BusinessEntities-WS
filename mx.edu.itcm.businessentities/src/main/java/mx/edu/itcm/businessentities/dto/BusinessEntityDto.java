package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class BusinessEntityDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BusinessEntityDto(String BusinessEntityID) {
		super();
	}
	public BusinessEntityDto() {
		super();
	}

	@Override
	public String toString() {
		return "BusinessEntityDto []";
	}
	
}