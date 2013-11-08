package net.gplatform.server.user.model.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProfile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String postPerPage;
	private String postThreadPerPage;
	private String orderThreadBy;
	private String saveCookie;
	private String cookieExpireTime;

	public String getOrderThreadBy() {
		return orderThreadBy;
	}

	public void setOrderThreadBy(String orderThreadBy) {
		this.orderThreadBy = orderThreadBy;
	}

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

	public String getPostPerPage() {
		return postPerPage;
	}

	public void setPostPerPage(String postPerPage) {
		this.postPerPage = postPerPage;
	}

	public String getPostThreadPerPage() {
		return postThreadPerPage;
	}

	public void setPostThreadPerPage(String postThreadPerPage) {
		this.postThreadPerPage = postThreadPerPage;
	}

	public String getSaveCookie() {
		return saveCookie;
	}

	public void setSaveCookie(String saveCookie) {
		this.saveCookie = saveCookie;
	}

	public String getCookieExpireTime() {
		return cookieExpireTime;
	}

	public void setCookieExpireTime(String cookieExpireTime) {
		this.cookieExpireTime = cookieExpireTime;
	}

}
