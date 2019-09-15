/**
 * 
 */
package com.masivian.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivian.test.model.Geolocation;

/**
 * @author mosorio
 *
 */
@Repository
public interface GeolocationRepository extends CrudRepository<Geolocation, Long>{

}
