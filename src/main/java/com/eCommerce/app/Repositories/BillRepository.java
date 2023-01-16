/**
 * @author Aymen Chaabani
 * @date 28 nov. 2022
 * @fileName BillRepository.java
 *
 */
package com.eCommerce.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eCommerce.app.Entities.Bill;

/**
 * 
 */

@RepositoryRestResource
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

public interface BillRepository extends JpaRepository<Bill, Long> {

}
