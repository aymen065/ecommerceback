/**
 * @author Aymen Chaabani
 * @date 17 nov. 2022
 * @fileName UserAppController.java
 *
 */
package com.eCommerce.app.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@CrossOrigin(origins = {"http://internal-LBA-1495990277.us-east-1.elb.amazonaws.com","*"})

@RequestMapping("/User")
public class UserAppController {

}
