package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="jdbc")
public class Jdbcmocktable {
		@Id
		private long aadharno;
		@Column(length=20)
		private String name;
		@Column(nullable=false)
		private String address;
		@Lob
		private byte[] selfie;
		@Column(length=10)
		private String jdbc_mock_rating;
		public long getAadharno() {
			return aadharno;
		}
		public void setAadharno(long aadharno) {
			this.aadharno = aadharno;
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
		public byte[] getSelfie() {
			return selfie;
		}
		public void setSelfie(byte[] selfie) {
			this.selfie = selfie;
		}
		public String getJdbc_mock_rating() {
			return jdbc_mock_rating;
		}
		public void setJdbc_mock_rating(String jdbc_mock_rating) {
			this.jdbc_mock_rating = jdbc_mock_rating;
		}
		

	

	
		
}
