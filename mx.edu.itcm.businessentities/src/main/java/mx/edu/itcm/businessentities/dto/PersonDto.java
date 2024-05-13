package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class PersonDto implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String personType;
	protected String firstName;
	protected  String lastName;
	
	public PersonDto(String personType, String firstName, String lastName) {
		super();
		this.personType = personType;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public PersonDto() {
		super();
		this.personType="";
		this.firstName="";
		this.lastName="";
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PersonDto [personType=" + personType + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
