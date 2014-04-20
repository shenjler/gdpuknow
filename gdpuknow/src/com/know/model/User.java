package com.know.model;



/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String name, String password, String phone, String email) {
        super(name, password, phone, email);        
    }
   
}
