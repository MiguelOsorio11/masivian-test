/**
 * 
 */
package com.masivian.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivian.test.model.Client;

/**
 * @author mosorio
 *
 */
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
