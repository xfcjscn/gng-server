package net.gplatform.server.user.model.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.gplatform.server.post.model.data.Item;
import net.gplatform.server.post.model.data.Post;
import net.gplatform.server.post.model.data.PostThread;

@Entity
// User table is already used in Oracle, so change to Customer
@Table(name = "Customer")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	@OneToMany
	private List<Post> ownedPosts;
	@OneToMany
	private List<PostThread> ownedPostThreads;
	@OneToMany
	private List<Item> ownedItems;
	@OneToOne
	private UserProfile userProfile;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Post> getOwnedPosts() {
		return ownedPosts;
	}

	public void setOwnedPosts(List<Post> ownedPosts) {
		this.ownedPosts = ownedPosts;
	}

	public List<PostThread> getOwnedPostThreads() {
		return ownedPostThreads;
	}

	public void setOwnedPostThreads(List<PostThread> ownedPostThreads) {
		this.ownedPostThreads = ownedPostThreads;
	}

	public List<Item> getOwnedItems() {
		return ownedItems;
	}

	public void setOwnedItems(List<Item> ownedItems) {
		this.ownedItems = ownedItems;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
