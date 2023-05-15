package Sample;

import java.sql.Time;

import javax.persistence.*;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class UpdatedObjectCount {
	
@Id
private int id;
@Column(length=50)
private String name;
@Version
Integer count;
@CreationTimestamp
Time itime;     //TimeStamp itime(Displays both Time and Date)
@UpdateTimestamp
Time uTime;
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
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
public Time getItime() {
	return itime;
}
public void setItime(Time itime) {
	this.itime = itime;
}
public Time getuTime() {
	return uTime;
}
public void setuTime(Time uTime) {
	this.uTime = uTime;
}

}
