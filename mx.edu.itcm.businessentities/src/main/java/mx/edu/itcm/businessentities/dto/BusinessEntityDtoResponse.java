package mx.edu.itcm.businessentities.dto;
import java.io.Serializable;

public class BusinessEntityDtoResponse extends BusinessEntityDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int businessEntityID;
	
	public BusinessEntityDtoResponse(int BusinessEntityID) {
		super();
		this.businessEntityID=BusinessEntityID;
	}

	public BusinessEntityDtoResponse() {
		super();
	}

	public int getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(int businessEntityID) {
		this.businessEntityID = businessEntityID;
	}

	@Override
	public String toString() {
		return "BusinessEntityDtoResponse [businessEntityID=" + businessEntityID + "]";
	}
	
}
