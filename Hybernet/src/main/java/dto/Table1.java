package dto;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name="JEHA9")
public class Table1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(nullable=false,length=50)
	String name;
	@Lob
	
	byte[] video;
	@Column(nullable=false)
	String address;
	@Column(unique = true,nullable=false)
	long phonenumber;
	@CreationTimestamp
	Timestamp iTime;
	@CreationTimestamp
	Timestamp uTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getVideo() {
		return video;
	}
	public void setVideo(byte[] video) {
		this.video = video;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Timestamp getiTime() {
		return iTime;
	}
	public void setiTime(Timestamp iTime) {
		this.iTime = iTime;
	}
	public Timestamp getuTime() {
		return uTime;
	}
	public void setuTime(Timestamp uTime) {
		this.uTime = uTime;
	}

}
