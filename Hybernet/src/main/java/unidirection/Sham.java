package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sham {
	@Id
	private int pan_id; 
	private String name;
	private String addres;
	private long phone;

	@OneToOne
	Person person;

	public int getPan_id() {
		return pan_id;
	}                 

	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
