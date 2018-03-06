package models;

import javax.persistence.Id;

import com.avaje.ebean.Model.Finder;

import play.data.validation.Constraints;

public class UserLogin {

	@Id
	private Integer id;
	@Constraints.Email
	@Constraints.Required
	private String email;
	@Constraints.Required
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Finder<Integer, UserLogin> login=new Finder<>(UserLogin.class);
	
	
	
}
