package mx.edu.itcm.businessentities.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Vendor {

	private static final long serialVersionUID = 1L;

	@Id
	Integer BusinessEntityID;
	
	@Column
	String AccountNumber;
	
	@Column 
	String Name;

	public Vendor() {
		AccountNumber = "";
		Name = "";
	}

	public Integer getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.BusinessEntityID = businessEntityID;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Vendor [BusinessEntityID=" + BusinessEntityID + ", AccountNumber=" + AccountNumber + ", Name=" + Name
				+ "]";
	}
	
	
}
