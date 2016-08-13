package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class User extends Model {

	// 用户名
	@Required
	public String u_name;

	// 用户密码
	@Required
	public String u_pwd;

	// 用户身份
	@Required
	public String type;

	// 删除标志
	@Required
	public long flag;

	// 用户注册时间
	@Required
	public String time;

	// 用户邮箱
	@Required
	public String mail;
}
