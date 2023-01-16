/**
 * @author Aymen Chaabani
 * @date 16 nov. 2022
 * @fileName Influencer.java
 *
 */
package com.eCommerce.app.Entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("user_app")
public class Influencer extends UserApp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -542454965026622660L;
	private String password;
	private String firstName;
	private String lastName;
}
