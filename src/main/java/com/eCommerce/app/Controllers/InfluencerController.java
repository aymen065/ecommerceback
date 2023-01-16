/**
 * @author Aymen Chaabani
 * @date 16 nov. 2022
 * @fileName InfluencerController.java
 *
 */
package com.eCommerce.app.Controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.app.Entities.Influencer;
import com.eCommerce.app.Repositories.InfluencerRepository;

/**
 * 
 */
@RestController
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

@RequestMapping("/influencer")
public class InfluencerController {
	@Autowired
	private InfluencerRepository influencerRepo;
	

	@PostMapping("/signin")
	@Transactional
	public Influencer signin(@RequestBody Influencer influencer) {

		Influencer infl = influencerRepo.getByEmailAndPassword(influencer.getEmail(),influencer.getPassword());
		if (infl == null) {
			return null;
		}	
		return infl;

	}
	
	
	@PostMapping("/signup")
	@Transactional
	public Influencer signup(@RequestBody Influencer influencer) {

		Influencer infl = influencerRepo.getByEmail(influencer.getEmail());
		if (infl != null) {
			return null;
		}	
		return influencerRepo.save(influencer);

	}
}
