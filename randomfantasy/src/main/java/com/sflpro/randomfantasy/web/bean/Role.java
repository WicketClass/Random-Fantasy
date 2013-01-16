/**
 * 
 */
package com.sflpro.randomfantasy.web.bean;

import javax.persistence.Column;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

/**
 * @author Mher Baghinyan
 * 
 */
@DynamicUpdate
@Table(appliesTo = "role")
public class Role {

	@Columns(columns = { @Column(name = "id") })
	private long id;

	@Columns(columns = { @Column(name = "name") })
	private String name;

	public Role() {
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

}
