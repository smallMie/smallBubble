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
	// �û�����
	@Required
	@Column(name="user_name",nullable=false,length=64)
    public String userName;
	
	@Required
	@Column(name="user_type",nullable=false)
    public Integer userType;
	
	@Required
	@Column(name="password",nullable=false,length=64)
    public String password;

	//ɾ����־λ
	@Required
	public long flag;

	//ע��ʱ��
	@Required
	@Column(name="user_time",nullable=true)
	public String userTime;

	//�û�ͷ��
	@Required
	@Column(name="user_image",nullable=true)
	public String userImage;
	
	//�û�����
	@Required
	public String mail;
}
