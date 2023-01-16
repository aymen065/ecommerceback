/**
 * @author Aymen Chaabani
 * @date 22 nov. 2022
 * @fileName OfferRepository.java
 *
 */
package com.eCommerce.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eCommerce.app.Entities.Offer;

/**
 * 
 */
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

@RepositoryRestResource
public interface OfferRepository extends JpaRepository<Offer, Long>{

}
