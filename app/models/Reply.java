package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "reply")
public class Reply extends Model {
	// 内容
	@Required
	@Column(name = "reply_content", nullable = true)
	public String replyContent;
	// 时间
	@Required
	@Column(name = "reply_time", nullable = false)
	public String replyTime;
	// 作者
	@ManyToOne(cascade = { CascadeType.DETACH })
	public User user;
	// 回复类型
	@Required
	@Column(name = "reply_type", nullable = true)
	public String replyType;
	// 回复对象id
	@Required
	@Column(name = "reply_to_id", nullable = true)
	public String replyToId;
	// 标识
	@Required
	public long flag;
}
