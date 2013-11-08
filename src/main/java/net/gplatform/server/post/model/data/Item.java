package net.gplatform.server.post.model.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	//change column name as desc is keyword in PostgreSQL DB
	@Column(name="description")
	private String desc;
	
//	@OneToMany
//	private List<Image> images;
	private String images;
	
	@Temporal(TemporalType.TIME)
	private Date createDate;
	@Temporal(TemporalType.TIME)
	private Date lastModified;
	
//	@ManyToOne
//	private User owner;
	private String owner;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

//	public List<Image> getImages() {
//		return images;
//	}
//
//	public void setImages(List<Image> images) {
//		this.images = images;
//	}
	
	

	public Date getCreateDate() {
		return createDate;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}



}
