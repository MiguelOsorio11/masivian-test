/**
 * 
 */
package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * @author Miguel Osorio
 *
 */
public class CityDTO implements Serializable {

	private static final long serialVersionUID = -2385589018493864645L;

	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
