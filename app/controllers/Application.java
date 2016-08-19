package controllers;

import java.io.File;
import java.util.List;

import models.Blog;
import models.ResultInfo;
import models.User;
import play.data.validation.Required;
import play.mvc.Before;
import play.mvc.Controller;
import service.UserService;

public class Application extends Controller {

	@Before(unless={"Application.index","Application.blog","Application.posts","Application.code","Application.blog_single","Application.posts_single","Application.code_single","Application.personal","Application.signin","Application.signinAction", "Application.signup","Application.signupAction","Application.logout"}, priority = 1)
	public static void checkLogin() {
		if (!isLogin()) {
			Application.logout();
		}
	}

	private static boolean isLogin() {
		if (session.contains("user_id")) {
			return true;
		} else {
			return false;
		}
	}
	
    public static void index() {
    	List<Blog> blogs = Blog.findAll();	
        render(blogs);
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
    
    public static void blog_single(long id) {
    	if(id==0){
    		return;
    	}
    	Blog blog = Blog.findById(id);
    	render(blog);
    }
    
    public static void posts_single() {
        render();
    }
    
    public static void code_single() {
        render();
    }
    
    public static void settings() {
    	String id = session.get("user_id");
    	User user = User.findById(Long.parseLong(id));
        render(user);
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
    
    public static void logout(){
    	session.clear();
    	Application.signin();
    }
    
    public static void changeImage(@Required File image) {
    	boolean result = UserService.changeImage(image);
    	if(!result){
    		flash.error("上传失败");
    	}
	}
}