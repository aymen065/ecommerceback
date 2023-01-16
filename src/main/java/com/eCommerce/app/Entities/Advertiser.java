/**
 * @author Aymen Chaabani
 * @date 16 nov. 2022
 * @fileName Advertiser.java
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
@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("user_app")
public class Advertiser extends UserApp implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7161042646497091227L;
	private String password;
	private String companyName;
	
	
}
