package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;

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
    
    public static void signinAction(String username, String pwd) {
		List<User> list = User.findAll();
		if (username == null || pwd == null) {
			return;
		}
			for (User user : list) {
				if (username.equals(user.userName)&&pwd.equals(user.password)) {
					if (user.flag == 1) {
						session.put("userName", user.userName);
						redirect("/");
					} else if (user.flag == -1) {
						flash.error("您的账号已锁定，请与管理员联系~");
						redirect("/login");
					}
				}
			}
			flash.error("账号或密码错误");
			redirect("/login");
	}
    
    public static void signupAction(String username, String pwd, String email){
    	if (username == null||pwd == null||email == null){
    		return;
    	}
    }
}