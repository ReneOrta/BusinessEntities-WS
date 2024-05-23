package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class PersonDtoResponse extends PersonDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int businessEntityID;
				
	public PersonDtoResponse(String personType, String firstName, String lastName,
			int id) {
		super(personType, firstName, lastName);
		businessEntityID = id;
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
