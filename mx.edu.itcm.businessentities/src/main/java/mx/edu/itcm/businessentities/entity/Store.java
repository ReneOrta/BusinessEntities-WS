package mx.edu.itcm.businessentities.entity;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table
public class Store implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	Integer BusinessEntityID;
	
	@Column 
	String Name;
	
	public Store() {
		this.Name="";
	}

	public Integer getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.BusinessEntityID = businessEntityID;
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
		return "Store [BusinessEntityID=" + BusinessEntityID + ", Name=" + Name + "]";
	}

}
