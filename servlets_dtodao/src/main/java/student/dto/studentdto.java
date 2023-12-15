package student.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class studentdto {
	@Id
	private int id;
	private String name;
	private long phno;
	private String email;
	private String gender;
	private String place;
	private String terms;
	{
	
	

}
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	@Override
	public String toString() {
		return "studentdto [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + ", gender=" + gender
				+ ", place=" + place + ", terms=" + terms + "]";
	}
	
}
