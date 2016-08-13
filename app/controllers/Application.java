package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void demo() {
    	int id = 10;
    	List<User> users = User.findAll();
        render(id,users);
    }
}