package com.cst_tst.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="spb_users")
@Access (AccessType.FIELD)
public class CST_UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
    public int ID;

    @Column(name="username", nullable=false, length=20)
    public String username;
    
    @Column(name="password", nullable=false, length=100)
    public String password;
    
    @Column(name="email", nullable=false, length=100)
    public String email;
    
    @Column(name="first_name", nullable=false, length=50)
    public String first_name;
    
    @Column(name="last_name", nullable=false, length=50)
    public String last_name;
    
    @Column(name="phone1", nullable=false, length=15)
    public String phone1;
    
    @Column(name="date_added", nullable=false)    
    public Date date_added;
    
    @Column(name="date_modified", nullable=false)
    public Date date_modified;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}


    
}