package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instagram {

	private String insta_id;
	private String profile_name;
	@Id
	private long phone_no;
	private String e_id;
	public String getInsta_id() {
		return insta_id;
	}
	public void setInsta_id(String insta_id) {
		this.insta_id = insta_id;
	}
	public String getProfile_name() {
		return profile_name;
	}
	public void setProfile_name(String profile_name) {
		this.profile_name = profile_name;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

}
