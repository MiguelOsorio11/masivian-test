/**
 * 
 */
package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * @author Miguel Osorio
 *
 */
public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 2443730245153116288L;

	private Long id;

	private String street;

	private String suite;

	private String city;

	private String zipcode;

	private GeoDTO geo;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public GeoDTO getGeo() {
		return geo;
	}

	public void setGeo(GeoDTO geo) {
		this.geo = geo;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
