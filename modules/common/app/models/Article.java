package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity
@Table(name = "articles")
public class Article extends Model {
	@Id
	private Long id;

	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	@Lob
	private String content;
	
	@ManyToOne
	@Column(nullable=true)
	private Category category;
	
	@ManyToOne
	private Account author;
	
	private Date created = new Date();
	
	private Date published;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Account getAuthor() {
		return author;
	}

	public void setAuthor(Account author) {
		this.author = author;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}
	
	public String toString() {
		return getTitle();
	}
}