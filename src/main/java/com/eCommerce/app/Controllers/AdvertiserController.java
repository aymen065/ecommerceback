/**
 * @author Aymen Chaabani
 * @date 16 nov. 2022
 * @fileName AdvertiserController.java
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

import com.eCommerce.app.Entities.Advertiser;
import com.eCommerce.app.Repositories.AdvertiserRepository;

/**
 * 
 */
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

@RestController
@RequestMapping("/advertiser")

public class AdvertiserController {

	@Autowired
	private AdvertiserRepository advertiserRepo;
	

	@PostMapping("/signup")
	@Transactional
	public Advertiser signup(@RequestBody Advertiser advertiser) {

		Advertiser adv = advertiserRepo.getByEmail(advertiser.getEmail());
		if (adv != null) {
			return null;
		}	
		return advertiserRepo.save(advertiser);

	}
	
	
	@PostMapping("/signin")
	@Transactional
	public Advertiser signin(@RequestBody Advertiser advertiser) {

		Advertiser adv = advertiserRepo.getByEmailAndPassword(advertiser.getEmail(),advertiser.getPassword());
		if (adv == null) {
			return null;
		}	
		return adv;

	}
}
