package Bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Personadhar {
	@Id
	private int adharid;
	private String name;
	private String address;
	
	@OneToOne
	Adharcard adharcard;

	public int getAdharid() {
		return adharid;
	}

	public void setAdharid(int adharid) {
		this.adharid = adharid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Adharcard getAdharcard() {
		return adharcard;
	}

	public void setAdharcard(Adharcard adharcard) {
		this.adharcard = adharcard;
	}

}
