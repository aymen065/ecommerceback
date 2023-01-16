/**
 * @author Aymen Chaabani
 * @date 27 nov. 2022
 * @fileName type.java
 *
 */
package com.eCommerce.app.Entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@ManyToOne(fetch = FetchType.EAGER , targetEntity = Category.class)
	private Category category;
}
