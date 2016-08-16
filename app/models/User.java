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
	// 
	@Required
	@Column(name="user_name",nullable=false,length=64)
    public static String userName;
	
	@Required
	@Column(name="user_type",nullable=false)
	public static Integer userType;
	
	@Required
	@Column(name="password",nullable=false,length=64)
	public static String password;

	//
	@Required
	public static long flag;

	//
	@Required
	@Column(name="user_time",nullable=true)
	public static String userTime;

	//
	@Required
	@Column(name="user_image",nullable=true)
	public static String userImage;
	
	//
	@Required
	public static String mail;
}
