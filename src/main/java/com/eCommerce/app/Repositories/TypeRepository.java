/**
 * @author Aymen Chaabani
 * @date 27 nov. 2022
 * @fileName TypeRepository.java
 *
 */
package com.eCommerce.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eCommerce.app.Entities.Type;

/**
 * 
 */
@RepositoryRestResource
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})
public interface TypeRepository extends JpaRepository<Type, Long>{

}
