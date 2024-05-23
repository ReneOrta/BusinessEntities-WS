package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class VendorDtoResponse extends VendorDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int businessEntityID;
	
	public VendorDtoResponse(String accountNumber, String name, Integer id ) {
		super(accountNumber, name);
		this.businessEntityID=id;
	}
	
	public VendorDtoResponse() {
		super();
	}

	public int getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(int businessEntityID) {
		this.businessEntityID = businessEntityID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
