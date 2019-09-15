/**
 * 
 */
package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * @author Miguel Osorio
 *
 */
public class GeoDTO implements Serializable {

	private static final long serialVersionUID = 5338576650164260073L;

	private Long id;

	private Double lat;
	
    private Double lng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLgn() {
		return lng;
	}

	public void setLgn(Double lng) {
		this.lng = lng;
	}

}
