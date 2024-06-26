package mx.edu.itcm.businessentities.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "Purchasing",name = "Vendor")
public class Vendor {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "businessentityid")
	Integer businessEntityID;
	
	@Column(name = "accountnumber")
	String accountNumber;
	
	@Column//(name = "Name") 
	String name;
	
	@Column(name="creditrating")
	Integer CreditRating;
	
	public Vendor() {
		this.businessEntityID = 0;
		this.accountNumber = "";
		this.name = "";
		this.CreditRating=4;//4 is for average
	}

	public Integer getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.businessEntityID = businessEntityID;
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
	
	public Integer getCreditRating() {
		return CreditRating;
	}

	public void setCreditRating(Integer creditRating) {
		CreditRating = creditRating;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Vendor [businessEntityID=" + businessEntityID + ", accountNumber=" + accountNumber + ", name=" + name
				+ ", CreditRating=" + CreditRating + "]";
	}	
}
