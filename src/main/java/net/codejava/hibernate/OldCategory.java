package net.codejava.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "OLD_CATEGORY")
public class OldCategory {

	private long id;
	private String name;

	public OldCategory() {
	}
	
	public OldCategory(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue
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

}