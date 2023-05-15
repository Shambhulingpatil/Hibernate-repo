package Bidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adharcard {
	@Id
	private int adharno;
	private String name;
	private String address;
	private long mobno;
	
	@OneToOne
	Personadhar personadhar;

	public int getAdharno() {
		return adharno;
	}

	public void setAdharno(int adharno) {
		this.adharno = adharno;
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

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public Personadhar getPersonadhar() {
		return personadhar;
	}

	public void setPersonadhar(Personadhar personadhar) {
		this.personadhar = personadhar;
	}

}
