/**
 * 
 */
package com.example.dem;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Duban Camilo Bedoya - Jhonatan Orozco 
 * @version 1.0.0
 */
@Repository("userDAO")
public interface UserDAO extends CrudRepository<User,Long>{

	public User findByEmail(String email);
}
