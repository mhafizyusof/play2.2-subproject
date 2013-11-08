package controllers.html;

import play.mvc.Controller;
import play.mvc.Result;
import utils.ExampleLogger;

public class StaticPages extends Controller {

    public static Result index() {
    	ExampleLogger.log("Log from the manager using the Common logger");
        return ok("Hi from the manager.");
    }

}
