package controllers.admin;

import play.*;
import play.mvc.*;

import views.html.*;

public class Admin extends Controller {

    public static Result index() {
        return ok("Your new application is ready.");
    }

}
