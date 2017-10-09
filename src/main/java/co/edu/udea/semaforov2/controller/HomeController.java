/**
 * 
 */
package co.edu.udea.semaforov2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.semaforov2.dao.UserDAO;
import co.edu.udea.semaforov2.dto.User;

/**
 * @author Duban Camilo Bedoya - dcamilobj@gmail.com
 * @version 1.0.0
 */
@RestController
public class HomeController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/")
	public String index(){
		return "Welcome to 'Semáforo' project papo!";
	}
	
	 @RequestMapping("/create")
	  @ResponseBody
	  public String create() {
	    String userId = "";
	    try {
	      User user = new User();
	      user.setEmail("drai2@gmail.com");
	      user.setRole(1);
	      userDAO.save(user);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created with id = " + userId;
	  }
}
