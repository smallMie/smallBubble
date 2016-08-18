package controllers;

import models.ResultInfo;
import play.data.validation.Required;
import play.mvc.Controller;
import service.UserService;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void posts() {
        render();
    }
    
    public static void code() {
        render();
    }
    
    public static void personal() {
        render();
    }
    
    public static void signin() {
        render();
    }
    public static void signup() {
        render();
    }
    
    public static void blog_single() {
        render();
    }
    
    public static void posts_single() {
        render();
    }
    
    public static void code_single() {
        render();
    }
    
    public static void settings() {
        render();
    }
    
    public static void signinAction(@Required String username, @Required String pwd) {
    	ResultInfo info = UserService.login(username, pwd, session);
    	renderJSON(info);
	}
    
    public static void signupAction(String username, String pwd, String email){
    	if (username == null||pwd == null||email == null){
    		return;
    	}
    }
}