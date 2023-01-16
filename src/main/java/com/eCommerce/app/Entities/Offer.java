/**
 * @author Aymen Chaabani
 * @date 22 nov. 2022
 * @fileName Offer.java
 *
 */
package com.eCommerce.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

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
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String chatId;
	private String campId;
	private String accept_date;
	private String status;
	@OneToOne(fetch = FetchType.EAGER, targetEntity = Review.class)
	private Review adv_review;
	private String arrv_date;
	private String track_no;
	private String change_note;
	private String profile_id;
	@Lob
	@Column(length = 40000)
	private String post_img;
	private String caption;
	private String locationtags;
	private String tags;
	private String tags2;
	private boolean editable;
	private String offer_progress;
	private String platform;
	private String placement;
	private String requirement;
	private String type;
	private String camp_name;
	private String budget;

}
