package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class PersonDtoResponse extends PersonDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int businessEntityID;
				
	public PersonDtoResponse(String personType, String firstName, String lastName,
			int businessEntityID) {
		super(personType, firstName, lastName);
		businessEntityID = businessEntityID;
	}

	public PersonDtoResponse() {
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
