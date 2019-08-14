package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
@Entity
@Table(name = "Technology")
public class Technology implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
//link to MentorSkill.java
    
    
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 65)
    @Column(name = "Technology_Name")
    private String technologyName ;
    
    @Size(max = 65)
    @Column(name = "TOC")
    private String toc ;
    
    @Size(max = 65)
    @Column(name = "Fees")
    private int fees ;
    
    @Size(max = 65)
    @Column(name = "Duration")
    private int duration ;
    
    @Size(max = 65)
    @Column(name = "Prerequites")
    private String prerequites ;
    
    
    

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public Technology() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
