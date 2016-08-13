package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name="posts")
public class Posts extends Model {
	//标题
	@Required
	@Column(name="post_title",nullable=false)
    public String postTitle;
	//内容
	@Required
	@Column(name="post_content",nullable=false)
    public String postContent;
	//作者
	@Required
	@Column(name="post_owner_id",nullable=false)
    public String postOwnerId;
	//日期
	@Required
	@Column(name="post_creat_time",nullable=true)
    public String postCreatTime;
	//状态
	@Required
	@Column(name="post_status",nullable=true)
    public String postStatus;
	//标识
	@Required
	public long flag;
}
