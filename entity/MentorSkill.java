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
@Table(name = "Mentor Skill")
public class MentorSkill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//link to Mentor.java
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
 //unique courses must have unique mid and folowing all the entity
    @Size(max = 10)
    @Column(name = "Self_Rating")
    private long selfRating;
    
    @Size(max = 10)
    @Column(name = "Year_Of_Experience")
    private long yoe;

    @Size(max = 65)
    @Column(name = "Training_Delivered")
    private int trainingDelivered ;
    
    
    //import sid from technology.java
    
    
	/*
	 * @NotNull
	 * 
	 * @Size(max = 65)
	 * 
	 * @Column(name = "courses") private String course;
	 */ //must be list //unique 

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "user") private UserProfile userProfile;
	 */
    // Hibernate requires a no-arg constructor
    public MentorSkill() {

    }

	
	

    


	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */
}
