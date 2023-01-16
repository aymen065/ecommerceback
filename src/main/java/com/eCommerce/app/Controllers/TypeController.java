/**
 * @author Aymen Chaabani
 * @date 27 nov. 2022
 * @fileName TypeController.java
 *
 */
package com.eCommerce.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.app.Entities.Type;
import com.eCommerce.app.Repositories.TypeRepository;

/**
 * 
 */
@RestController
@RequestMapping(name = "/")
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

public class TypeController {
	@Autowired
	private TypeRepository typeRepo;

	@GetMapping("types")
	public List<Type> getAllTypes(){
		return typeRepo.findAll();
	}
	
}
