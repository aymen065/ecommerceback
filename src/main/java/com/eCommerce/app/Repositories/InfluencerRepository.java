/**
 * @author Aymen Chaabani
 * @date 16 nov. 2022
 * @fileName InfluencerRepository.java
 *
 */
package com.eCommerce.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eCommerce.app.Entities.Influencer;

/**
 * 
 */
@RepositoryRestResource
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

public interface InfluencerRepository extends JpaRepository<Influencer, Long> {
	Influencer getByEmail(String email);
	Influencer getByEmailAndPassword(String email , String password);
	Influencer getByFirstName(String firstName);

}
