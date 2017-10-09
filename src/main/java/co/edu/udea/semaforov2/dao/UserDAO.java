/**
 * 
 */
package co.edu.udea.semaforov2.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.udea.semaforov2.dto.User;

/**
 * @author Duban Camilo Bedoya - Jhonatan Orozco 
 * @version 1.0.0
 */
@Repository("userDAO")
public interface UserDAO extends CrudRepository<User,Long>{

	public User findByEmail(String email);
}
