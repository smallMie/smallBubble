package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends Model {
	// 用户姓名
	@Required
	@Column(name="user_name",nullable=false,length=64)
    public String userName;
	
	@Required
	@Column(name="user_type",nullable=false)
    public Integer userType;
	
	@Required
	@Column(name="password",nullable=false,length=64)
    public String password;

	//删除标志位
	@Required
	public long flag;

	//注册时间
	@Required
	@Column(name="user_time",nullable=true)
	public String userTime;

	//用户头像
	@Required
	@Column(name="user_image",nullable=true)
	public String userImage;
	
	//用户邮箱
	@Required
	public String mail;
}
