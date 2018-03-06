package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;

import play.data.validation.Constraints;
import play.data.validation.Constraints.*;

import com.avaje.ebean.*;

@Entity
public class User extends Model {

	@Id
	@Constraints.Required
	public Integer id;
	@Constraints.Required
	public String name;
	@Constraints.Required
	public String location;
	@Constraints.Required
	@Constraints.Email
	public String email;
	@Constraints.Required
	public Integer number;
	
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}



	public static Finder<Integer, User> find = new Finder<>(User.class);

	

	 public User(){
	
	 }
	
	
	 public User(Integer id,String name,String location,Integer number) {
	 this.id=id;
	 this.name=name;
	 this.location=location;
	 this.number=number;
	 }
	
	// private static Set<User> users;
	//
	// static{
	// users =new HashSet<>();
	// users.add(new User(1,"Saran","madurai",12345));
	// users.add(new User(2,"Surya","Salem",543221));
	// users.add(new User(3,"Nikitha","Mysore",65432));
	// }
	//
	// public static Set<User> allUsers() {
	// return users;
	// }
	//
	// public static User findById(Integer id) {
	// for(User user : users){
	// if(id.equals(user.id)){
	// return user;
	// }
	// }
	// return null;
	// }
	//
	// public static void add(User user){
	// users.add(user);
	// }
	//
	// public static boolean remove(User user){
	// return users.remove(user);
	// }

}
