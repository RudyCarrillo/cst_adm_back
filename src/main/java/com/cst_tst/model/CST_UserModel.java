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
}