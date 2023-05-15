package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Users {
	@Id
	private String user_id;
	private String username;
	private String uaddress;
	private long phoneno;
	
	@ManyToOne
	Instagram instagram;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public Instagram getInstagram() {
		return instagram;
	}

	public void setInstagram(Instagram instagram) {
		this.instagram = instagram;
	}

	

}
