/**
 * @author Aymen Chaabani
 * @date 17 nov. 2022
 * @fileName UserApp.java
 *
 */
package com.eCommerce.app.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


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
@Inheritance(strategy = InheritanceType.JOINED)
public class UserApp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4024468627363911599L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private String avatar;
	private String email;
	private String phone;
	private String fullName;
	private String gender;
	private String birthDay;
	private String city;
	private String state;
	private String bio;
	private String brandsite;
	private long profileid;
	

}