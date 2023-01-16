/**
 * @author Aymen Chaabani
 * @date 19 nov. 2022
 * @fileName CampaignRepository.java
 *
 */
package com.eCommerce.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eCommerce.app.Entities.Campaign;

/**
 * 
 */
@RepositoryRestResource
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

public interface CampaignRepository extends JpaRepository<Campaign, Long>{

}
