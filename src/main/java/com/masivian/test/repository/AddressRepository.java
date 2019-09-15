/**
 * 
 */
package com.masivian.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivian.test.model.Address;

/**
 * @author mosorio
 *
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
