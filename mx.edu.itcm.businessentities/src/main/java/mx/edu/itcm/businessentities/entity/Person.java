package mx.edu.itcm.businessentities.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	Integer businessEntityID;
	
	@Column//(name = "PersonType")
	private String personType;
	
	@Column//(name = "FirstName")
	private String firstName;
	
	@Column//(name = "LastName")
	private String lastName;
	
	public Person() {
		this.businessEntityID=0;
		this.personType = "";
		this.firstName ="";
		this.lastName ="";
	}

	public Integer getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.businessEntityID = businessEntityID;
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
		return "Person [businessEntityID=" + businessEntityID + ", personType=" + personType + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
		
}
