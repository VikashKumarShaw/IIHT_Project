package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "User Details")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//import sid from Technology.java  for registration of any course.
    @NotNull
    @Size(max = 65)
    @Column(name = "First_Name")
    private String firstName;

    @Size(max = 65)
    @Column(name = "Last_Name")
    private String lastName;

    @NotNull
    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(max = 128)
    private String password;
    
    @Size(max = 10)
    @Column(name = "Contact")
    private long conatct;

    @Size(max = 65)
    @Column(name = "Reg_Date_Time")
    private Date regDateTime ;

    @Column(name = "active")
	private boolean active;
    
    @NotNull
    @Size(max = 65)
    @Column(name = "Reg_Code")
    private String regCode;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getConatct() {
		return conatct;
	}

	public void setConatct(long conatct) {
		this.conatct = conatct;
	}

	public Date getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(Date regDateTime) {
		this.regDateTime = regDateTime;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public User() {

    }
    
    public User(Long id, @NotNull @Size(max = 65) String firstName, @Size(max = 65) String lastName,
			@NotNull @Email @Size(max = 100) String email, @NotNull @Size(max = 128) String password,
			@Size(max = 10) long conatct, @Size(max = 65) Date regDateTime, boolean active,
			@NotNull @Size(max = 65) String regCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.conatct = conatct;
		this.regDateTime = regDateTime;
		this.active = active;
		this.regCode = regCode;
	}


	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
