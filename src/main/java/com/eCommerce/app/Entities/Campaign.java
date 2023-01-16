/**
 * @author Aymen Chaabani
 * @date 19 nov. 2022
 * @fileName Campaign.java
 *
 */
package com.eCommerce.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Campaign {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	private String name;
	private String category;
	private double budget;
	@Lob 
	@Column(length = 50000)
	private String coverImg;
	private String description;
	private String platform;
	private String placement;
	private String periodStart;
	private String periodEnd;
	private String caption;
	private String locationtags;
	private String tags;
	private String tags2;
	private String quests;
	private String contents;
	private String gallery;
	private String ages;
	private String followers;
	private String gender;
	private String city;
	private String country;
	private String langs;
	private String billingName;
	private String billingAddress1;
	private String billingAddress2;
	private String billingState;
	private String billingCity;
	private String billingZipcode;
	private boolean favorite;
	private boolean in_queue;
	
	
	
}




