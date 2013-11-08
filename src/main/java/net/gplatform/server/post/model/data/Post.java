package net.gplatform.server.post.model.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.gplatform.server.user.model.data.User;


@Entity
public class Post implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String content;
	@Temporal(TemporalType.TIME)
	private Date createDate;
	@Temporal(TemporalType.TIME)
	private Date lastModified;
	@ManyToOne
	private User creator;
	@ManyToOne
	private Post replyTo;
	@OneToMany(mappedBy="replyTo")
	private List<Post> replyBy;
	@ManyToOne
	private PostThread thread;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Post getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(Post replyTo) {
		this.replyTo = replyTo;
	}

	public List<Post> getReplyBy() {
		return replyBy;
	}

	public void setReplyBy(List<Post> replyBy) {
		this.replyBy = replyBy;
	}

	public PostThread getThread() {
		return thread;
	}

	public void setThread(PostThread thread) {
		this.thread = thread;
	}

}
