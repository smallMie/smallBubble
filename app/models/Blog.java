package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "blog")
public class Blog extends Model {
	// 内容
	@Required
	@Column(name = "blog_content", nullable = true)
	public String blogContent;
	// 时间
	@Required
	@Column(name = "create_time", nullable = false)
	public String createTime;
	// 作者
	@ManyToOne(cascade = { CascadeType.DETACH })
	public User user;
	// 标题
	@Required
	@Column(name = "blog_title", nullable = true)
	public String blogTitle;
	// 标识
	@Required
	public long flag;
}
