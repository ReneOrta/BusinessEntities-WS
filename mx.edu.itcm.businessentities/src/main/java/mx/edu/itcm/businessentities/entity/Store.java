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
@Table(name = "Store")
public class Store implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	Integer businessEntityID;
	
	@Column//(name = "Name") 
	String name;
	
	public Store() {
		this.businessEntityID=0;
		this.name="";
	}

	public Integer getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.businessEntityID = businessEntityID;
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
		return "Store [businessEntityID=" + businessEntityID + ", name=" + name + "]";
	}
}
