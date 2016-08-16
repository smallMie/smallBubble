package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "follow")
public class Follow extends Model {
	// 作者
		@ManyToOne(cascade = { CascadeType.DETACH })
		public User follower;
		// 作者
		@ManyToOne(cascade = { CascadeType.DETACH })
		public User idle;
		
		@Required
		public long flag;
}
