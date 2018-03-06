package controllers;
import play.Logger;
import implementations.Userimplementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http.RequestBody;
import play.mvc.Result;
//import views.users.*;
import views.html.*;

public class UserController extends Controller {

	@Inject
	FormFactory formFactory;
//@Inject
//private BodyParser<Json> body;

	// Show all users
	public Result index() {

		
		List<User> users = User.find.all();
//		return ok(userapp.render(users));
		 return ok(Json.toJson(users));
	}

	// to create user
	public Result create() {

		 JsonNode json = request().body().asJson();
		Form<User> userform = formFactory.form(User.class);
//		return ok(create.render(userform));
		return ok(Json.toJson(userform));
	}

	// to save user
//	@BodyParser.Of(User.class)
	public Result save() {
//		Form<User> userForm = formFactory.form(User.class).bindFromRequest();
//		User user = userForm.get();
		 JsonNode body = request().body().asJson();
		    User user1 = Json.fromJson(body, User.class);
//			Map<String, Object> response = user1.insert();;
			Userimplementation use=new Userimplementation();
		    use.createUser(user1);
		    Map<String, Object> response=use.createUser(user1);
			try{
		
		    response.put("Sucess", response);
			}catch(Exception e){
//				response.pu
			}
		
		user1.save();
		
		    
		return ok(Json.toJson(response));
	}

	// to edit user
	public Result edit(Integer id) {

		User user = User.find.byId(id);
		// System.out.println(user);
		if (user == null) {
			
			return notFound("User not found");
		}
		Form<User> userForm = formFactory.form(User.class).fill(user);
		System.out.println();
		return ok(/*edit.render(userForm)*/);
	}

	@BodyParser.Of(BodyParser.Json.class)
	public Result update() {
		/*User user = formFactory.form(User.class).bindFromRequest().get();
		User exisitingUser = user.find.byId(user.id);

		if (exisitingUser == null) {
			
			return notFound("User not found");
		}
		exisitingUser.id=user.id;
		exisitingUser.name = user.name;
		exisitingUser.location = user.location;
		exisitingUser.number = user.number;
		exisitingUser.update();
*/
		
		JsonNode userJson = request().body().asJson();

		User userObj = Json.fromJson(userJson, User.class);

		Map<String, Object> response = new HashMap<String, Object>();
		Map<String,Object> userUpdate = new HashMap<String,Object>();
		try {
			userUpdate = Userimplementation.updateUser(userObj, userObj.getId());
			response.put("state", userUpdate);
		} catch (Exception e) {
			
			response.put("status", "failed");
			response.put("message", "Exception occured ="+e.getCause());
		}
		return ok(Json.toJson(response));
	}

	// to delete
	public Result destroy(Integer id) {
		User user = User.find.byId(id);
		Map<String, Object> resMap=new HashMap<String, Object>();
		
		if(user !=null){
		
		resMap.put("meessage","User "+id+" Deleted Sucessfully..!!!!");
		resMap.put("status", "success");
		}
//		if (user == null)
		else{
			resMap.put("status", "failure");
			resMap.put("meessage","User doesn't exist!!!!!");
		}
		user.delete();
		

		return ok(Json.toJson(resMap));
	}

	// to display single user
	public Result show(Integer id) {
		User user = User.find.byId(id);

		if (user == null) {
			return notFound("User not found");
		}
		return ok(Json.toJson(user));
	}
	
	public Result debug(){
		
		int i=10;
		String s="sd";
		System.out.println(i+s);
		return ok("Debug");
	}

}
