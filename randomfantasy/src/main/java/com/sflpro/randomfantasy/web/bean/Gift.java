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
@Table(appliesTo = "gift")
public class Gift extends Product {

	@Columns(columns = { @Column(name = "weight") })
	private String weight;

	@Columns(columns = { @Column(name = "width") })
	private String width;

	@Columns(columns = { @Column(name = "length") })
	private String length;

	@Columns(columns = { @Column(name = "height") })
	private String height;

	public Gift() {
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
