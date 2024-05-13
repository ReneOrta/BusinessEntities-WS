package mx.edu.itcm.businessentities.dto;

import java.io.Serializable;

public class StoreDto implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String name;
	
	
	public StoreDto(String Name) {
		super();
		this.name = Name;
	}

	public StoreDto() {
		super();
		this.name="";
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
		return "StoreDto [name=" + name + "]";
	}
	
}