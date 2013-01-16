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
public class Card extends Product {

	@Columns(columns = { @Column(name = "width") })
	private String width;

	@Columns(columns = { @Column(name = "height") })
	private String height;

	@Columns(columns = { @Column(name = "color") })
	private String color;

	public Card() {
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
