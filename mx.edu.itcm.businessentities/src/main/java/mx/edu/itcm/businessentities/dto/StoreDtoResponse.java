package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class StoreDtoResponse extends StoreDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer businessEntityID;

	public StoreDtoResponse(String Name,Integer id) {
		super(Name);
		this.businessEntityID=id;
	}
	
	public StoreDtoResponse() {
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