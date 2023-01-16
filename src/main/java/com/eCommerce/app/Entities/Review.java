/**
 * @author Aymen Chaabani
 * @date 22 nov. 2022
 * @fileName Review.java
 *
 */
package com.eCommerce.app.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long profile_id;
	private String reviewer;
	private String review_title;
	private long rating;
	private String review_date;
	private String summary;
	private String rating_values;
	
	
}


