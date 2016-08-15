package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "collection")
public class Collection extends Model{
	// 作者
	@ManyToOne(cascade = { CascadeType.DETACH })
	public User user;
	// 回复类型
	@Required
	public String type;
	// 回复对象id
	@Required
	@Column(name = "col_id", nullable = true)
	public String collectId;
	// 回复对象id
	@Required
	@Column(name = "col_time", nullable = true)
	public String collectTime;
	// 标识
	@Required
	public long flag;
}
