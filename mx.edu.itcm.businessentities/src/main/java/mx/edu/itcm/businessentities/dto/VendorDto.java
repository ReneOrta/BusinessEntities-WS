package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class VendorDto implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String accountNumber;
	protected String name;
	
	public VendorDto(String accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public VendorDto() {
		super();
		this.accountNumber = "";
		this.name = "";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VendorDto [accountNumber=" + accountNumber + ", name=" + name + "]";
	}

	

}
