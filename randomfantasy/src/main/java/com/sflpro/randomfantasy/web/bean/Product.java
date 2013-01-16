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
@Table(appliesTo = "product")
public class Product {

	@Columns(columns = { @Column(name = "id") })
	private long id;

	@Columns(columns = { @Column(name = "code") })
	private int code;

	@Columns(columns = { @Column(name = "description") })
	private String description;

	@Columns(columns = { @Column(name = "cathegory") })
	private String cathegory;

	public Product() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCathegory() {
		return cathegory;
	}

	public void setCathegory(String cathegory) {
		this.cathegory = cathegory;
	}

}
