package in.soft.bind;

import java.util.Arrays;

public class Student {
	
	private Integer id;
	private String name;
	private String mail;
	private String gender;
	private String courses;
	private String[] timing;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String[] getTiming() {
		return timing;
	}
	public void setTiming(String[] timing) {
		this.timing = timing;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mail=" + mail + ", gender=" + gender + ", courses=" + courses
				+ ", timing=" + Arrays.toString(timing) + "]";
	}
	public Student() {
		super();
	}
	
	
	
	

}
