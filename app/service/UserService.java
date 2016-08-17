package service;

import java.io.File;

import models.ResultInfo;
import models.User;
import play.mvc.Http.Request;
import play.mvc.Scope.Session;

public class UserService {
	
	public static ResultInfo login(String username,String password,Session session){
		ResultInfo info = new ResultInfo();
		info.setCodeAndMsg(1001);
		if (!username.isEmpty() && !password.isEmpty()) {
		    User user = User
			    .find("userName = ? and password = ?", username, password)
			    .first();
		    if(user!=null){
		    	session.put("username", user.userName);
		    	info.setCodeAndMsg(200);
		    	user.password=user.mail=null;	  	    	
		    	info.setInfo(user);
		    }else{
		    	info.setCodeAndMsg(1001);
		    }
		}
		return info;
	}
	
	public static ResultInfo changePassword(String oldpsw, String newpsw){
		ResultInfo info = new ResultInfo();
		Session user = Session.current();
		int userId = Integer.parseInt(user.get("user_id"));
		User jpa = User.find("user_id=?", userId).first();
		if(jpa.password.equals(oldpsw)){
			jpa.password = newpsw;
			jpa.save();
			info.setCode(200);
		} else{
			info.setCode(105010);
		}
		return info;
	}
	
	public static ResultInfo activeUser(String active_token, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultInfo doResetActiveEmail(String email, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultInfo setNewPassword(String token, String password,
			Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultInfo resetPassword(String email, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultInfo userRegister(String email, String password,
			Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ResultInfo reSendEmail(String email, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

//	public static CheckInfo userSelect(String param, Request request) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static User getCurrentUser() {
		Session user=Session.current();
		if(user!=null && user.get("user_id")!=null && user.get("user_id")!=""){
			User u=User.findById(Integer.parseInt(user.get("user_id")));
			if(u!=null){
				return u;
			}
			return null;
		}
		return null;
	}

	public static ResultInfo userVerifyInfoAdd(File file, String filePath,
			Integer noValidateType, String companyName, String licenseId,
			String contact, User user, Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
