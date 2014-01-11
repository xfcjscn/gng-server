package net.gplatform.server.user.model.data;

import net.gplatform.server.post.model.data.Item;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
	private List<Item> ownedItems;


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

	public List<Item> getOwnedItems() {
		return ownedItems;
	}

	public void setOwnedItems(List<Item> ownedItems) {
		this.ownedItems = ownedItems;
	}


}
