package com.cst_tst.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cst_tst.util.ValidEmail;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="spb_users")
@Access (AccessType.FIELD)
@Data
public class CST_UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false)
    @Getter @Setter
    public int ID;

    @Getter @Setter
    @Column(name="username", nullable=false, length=20)
    public  String username;
    
    @Getter @Setter
    @Column(name="password", nullable=false, length=100)
    public String password;
    
    @ValidEmail
    @Getter @Setter
    @Column(name="email", nullable=false, length=100)
    public String email;
    
    @Getter @Setter
    @Column(name="first_name", nullable=false, length=50)
    public String firstName;
    
    @Getter @Setter
    @Column(name="last_name", nullable=false, length=50)
    public String lastName;
    
    @Getter @Setter
    @Column(name="phone1", nullable=false, length=15)
    public String phone1;
    
    @Getter @Setter
    @Column(name="date_added", nullable=false)    
    public Date dateAdded;
    
    @Getter @Setter
    @Column(name="date_modified", nullable=false)
    public Date dateModified;	
    
}