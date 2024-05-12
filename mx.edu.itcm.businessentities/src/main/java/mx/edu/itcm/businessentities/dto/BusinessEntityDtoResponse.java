package mx.edu.itcm.businessentities.dto;
import java.io.Serializable;

public class BusinessEntityDtoResponse extends BusinessEntityDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int BusinessEntityID;
	
	public BusinessEntityDtoResponse(int BusinessEntityID) {
		super();
		this.BusinessEntityID=BusinessEntityID;
	}

	public BusinessEntityDtoResponse() {
		super();
	}

	public int getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(int businessEntityID) {
		this.BusinessEntityID = businessEntityID;
	}

	@Override
	public String toString() {
		return "CategoryDtoResponse [BusinessEntityID=" + BusinessEntityID + "]";
	}
	
}
