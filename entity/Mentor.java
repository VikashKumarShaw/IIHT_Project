package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
@Entity
@Table(name = "Mentors_Details")
public class Mentor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 65)
    private String userName;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String linkedinUrl;

    @NotNull
    @Size(max = 128)
    private String password;
    
    @Size(max = 10)
    private long conatct;
    
    @Size(max = 10)
    @Column(name = "Year_of_Experience")
    private long yoe;

    @Size(max = 65)
    @Column(name = "Reg_Date_Time")
    private Date regDateTime ;

    @Column(name = "Active")
	private boolean active;
    
    @NotNull
    @Size(max = 65)
    @Column(name = "Reg_Code")
    private String regCode;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public Mentor() {

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
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

	public long getYoe() {
		return yoe;
	}

	public void setYoe(long yoe) {
		this.yoe = yoe;
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

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public Mentor(Long id, @NotNull @Size(max = 65) String userName, @NotNull @Size(max = 100) String linkedinUrl,
			@NotNull @Size(max = 128) String password, @Size(max = 10) long conatct, @Size(max = 10) long yoe,
			@Size(max = 65) Date regDateTime, boolean active, @NotNull @Size(max = 65) String regCode) {
		super();
		this.id = id;
		this.userName = userName;
		this.linkedinUrl = linkedinUrl;
		this.password = password;
		this.conatct = conatct;
		this.yoe = yoe;
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
