package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class PersonDto implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String PersonType;
	protected String FirstName;
	protected  String LastName;
	
	public PersonDto(String personType, String firstName, String lastName) {
		super();
		this.PersonType = personType;
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	
	public PersonDto() {
		super();
		this.PersonType="";
		this.FirstName="";
		this.LastName="";
	}

	public String getPersonType() {
		return PersonType;
	}
	public void setPersonType(String personType) {
		this.PersonType = personType;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PersonDto [PersonType=" + PersonType + ", FirstName=" + FirstName + ", LastName=" + LastName+ "]";
	}

}
