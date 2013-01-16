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
@Table(appliesTo = "user")
public class User {

	@Columns(columns = { @Column(name = "id") })
	private long id;

	@Columns(columns = { @Column(name = "first_name") })
	private String firstName;

	@Columns(columns = { @Column(name = "last_name") })
	private String lastName;

	@Columns(columns = { @Column(name = "mail") })
	private String mail;

	@Columns(columns = { @Column(name = "password") })
	private String password;

	// TODO add join type annotation
	@Columns(columns = { @Column(name = "role_Id") })
	private Role role;

	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
