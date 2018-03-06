package controllers;

import play.mvc.*;
import views.html.*;
import play.Logger;
//import views.html.play20.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	
    	int i=10;
		String s="Saran";
		System.out.println(i+s);
		Logger.debug("debug="+i);
        return ok(views.html.index.render());
    }
    
    public Result welcomee(String name){
    	
    	Logger.debug("name="+name);
    	
    	return ok(welcome.render(name));
    }

}
