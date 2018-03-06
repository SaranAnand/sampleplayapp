package implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import models.User;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;

public class Userimplementation {

	public static Map<String, Object> createUser(User user) {

		Map<String, Object> response = new HashMap<String, Object>();

		if (user != null) {
			Ebean.beginTransaction();

			try {
				user.save();
				Ebean.commitTransaction();
				response.put("status", "success");
				response.put("message", "User "+user.id+" Created Sucessfully.!!");
				response.put("id", user.id);
				response.put("name", user.name);
				response.put("num", user.number);	
				response.put("location", user.location);
				response.put("emali", user.email);
				
				
				
//				System.out.println(response.get("status"));

			}catch (Exception ex) {
				Ebean.rollbackTransaction();

				response.put("status", "failure");

			} finally {
				Ebean.endTransaction();
			}

			}
		return response;
	}
	
	public static Map<String, Object> viewUser() {
		

		List<User> user = User.find.all();

		List<Map<String, Object>> result = new ArrayList<>();

		for (User users : user) {
			Map<String, Object> response = new HashMap<>();
			response.put("userId", users.id);
			response.put("name", users.name);
			response.put("location", users.location);
			response.put("number", users.number);

			result.add(response);
		}

		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", "success");
		response.put("userList", result);

		
		return response;
	}
	
	public static Map<String,Object> updateUser(User update, Integer id){
		
//		Integer id=jsonNode.get("id").asInt();
		
		User use=User.find.byId(id);
		
		Map<String, Object> response = new HashMap<String, Object>();

//		use.setName(jsonNode.get("name").toString());
//		use.setLocation(jsonNode.get("location").toString());
//		use.setNumber(jsonNode.get("number").asInt());
//		use.setId(jsonNode.get("id").asInt());
		use.setId(use.getId());
		use.setNumber(update.getNumber());
		use.setLocation(update.getLocation());
		use.setName(update.getName());
		
//		play.Logger.debug("Json="+jsonNode.get("number").asInt());
		
		
//		use.update();
		
		Ebean.beginTransaction();

		try {
			use.update();
			
			response.put("status", "success");
			response.put("User Updated", use);
			
			response.put("message", "updated successfully");
			Ebean.commitTransaction();
		} catch (Exception ex) {
		
			Ebean.rollbackTransaction();
			response.put("status", "Failed inside");
		} finally {
			Ebean.endTransaction();
		}
	 
		
		
	
		response.put("status", "success");
		response.put("message", "match status changed successfully!");
//		response.putAll(response);
		
		return response;
	}
}
