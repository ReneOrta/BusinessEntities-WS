package mx.edu.itcm.businessentities.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(schema = "person",name = "businessentity")
public class BusinessEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "businessentityid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int businessEntityID;
	
	public BusinessEntity() {
		this.businessEntityID=0;
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

	@Override
	public String toString() {
		return "BusinessEntityAddress [BusinessEntityID=" + businessEntityID + "]";
	}
	
}
