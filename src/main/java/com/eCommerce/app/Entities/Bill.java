/**
 * @author Aymen Chaabani
 * @date 28 nov. 2022
 * @fileName Bill.java
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
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String placementDate;
	private int productQuantity;
	private double price;
	private String settlementDate;
	private String status;
	private String phone;
	private String detailAddress;
	private long productId;
	
}
