package com.masivian.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivian.test.model.Calculator;

/**
 * 
 * @author Miguel Osorio
 *
 */
@Repository
public interface CalculatorRepository extends CrudRepository<Calculator, Long> {

}
