/**
 * @author Aymen Chaabani
 * @date 27 nov. 2022
 * @fileName Product.java
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
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private double price;
	private String imgUrl;
	private int quantity;
	private double saleAmount;
	private String categoryName;
	private String typeName;
}
