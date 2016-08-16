package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void signin() {
        render();
    }
    public static void signup() {
        render();
    }
    
    public static void single() {
        render();
    }
    
    public static void signinAction(String username, String pwd) {
		List<User> list = User.findAll();
		if (username == null || pwd == null) {
			return;
		}
			for (User user : list) {
				// user.u_pwd = BCrypt.hashpw("123456",BCrypt.gensalt());
				// user.save();
				if (username.equals(User.userName)&&pwd.equals(User.password)) {
					if (user.flag == 1) {
						session.put("userName", User.userName);
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