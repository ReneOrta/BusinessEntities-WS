package mx.edu.itcm.businessentities.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	Integer BusinessEntityID;
	
	@Column
	private String PersonType;
	
	@Column
	private String FirstName;
	
	@Column
	private String LastName;
	
	public Person() {
		this.PersonType = "";
		this.FirstName ="";
		this.LastName ="";
	}

	public Integer getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.BusinessEntityID = businessEntityID;
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
		return "Person [BusinessEntityID=" + BusinessEntityID + ", PersonType=" + PersonType + ", FirstName="
				+ FirstName + ", LastName=" + LastName + "]";
	}
		
}
