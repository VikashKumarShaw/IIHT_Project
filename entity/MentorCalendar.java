package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
@Entity
@Table(name = "Mentor Calendar")
public class MentorCalendar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//link to Mentor.java
    
//link to mentorSkill.java Mid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 65)
    @Column(name = "Start Time")
    private String startTime ;
    
    @Size(max = 65)
    @Column(name = "End Time")
    private String endtime ;
    
    @Size(max = 65)
    @Column(name = "Start Date")
    private Date startdate ;
    
    @Size(max = 65)
    @Column(name = "End Date")
    private Date enddate ;
    
    
    

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public MentorCalendar() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
