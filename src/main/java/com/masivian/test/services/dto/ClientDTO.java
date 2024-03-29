/**
 * 
 */
package com.masivian.test.services.dto;

import java.io.Serializable;

/**
 * @author Miguel Osorio
 *
 */
public class ClientDTO implements Serializable {

    private static final long serialVersionUID = 7170139046857106503L;
    
    private Long id;

    private String name;

    private String username;

    private String email;

    private AddressDTO address;

    private String phone;

    private String website;

    private CompanyDTO company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
}
