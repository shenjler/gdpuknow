package com.know.model;



/**
 * AbstractUser entity provides the base persistence definition of the User entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;
     private String phone;
     private String email;


    // Constructors

    /** default constructor */
    public AbstractUser() {
    }

    
    /** full constructor */
    public AbstractUser(String name, String password, String phone, String email) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
   








}