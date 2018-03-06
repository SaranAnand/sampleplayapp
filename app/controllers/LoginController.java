package controllers;

import models.User;
import models.UserLogin;
import akka.stream.actor.ActorPublisherMessage.Request;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;
import play.mvc.*;

public class LoginController extends Controller {

	public Result login(){
		 
		 JsonNode body = request().body().asJson();
//	
		    UserLogin user1 = Json.fromJson(body, UserLogin.class);
		    
		    return null;
	}
	
	
}
