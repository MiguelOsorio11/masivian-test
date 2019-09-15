/**
 * 
 */
package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * @author Miguel Osorio
 *
 */
public class CompanyDTO implements Serializable {

	private static final long serialVersionUID = -5011255479495130027L;

	private Long id;

	private String name;

	private String catchPhrase;

	private String bs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
