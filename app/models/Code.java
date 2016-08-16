package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "code")
public class Code extends Model {
	// 标题
	@Required
	@Column(name = "code_title", nullable = false)
	public String codeTitle;
	// 展示图
	@Required
	@Column(name = "code_image", nullable = false)
	public String codeImage;
	// 简介
	@Required
	@Column(name = "code_introduction", nullable = false)
	public String codeIntroduction;
	// 详情
	@Required
	@Column(name = "code_detail", nullable = true)
	public String codeDetail;
	// 下载量
	@Required
	@Column(name = "download_num", nullable = true)
	public String downloadNum;
	// 状态
	@Required
	@Column(name = "code_status", nullable = true)
	public String codeStatus;
	// 上传者
	@ManyToOne(cascade = { CascadeType.DETACH })
	public User user;
	// 标识
	@Required
	public long flag;
}
