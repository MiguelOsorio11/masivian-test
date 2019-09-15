package com.masivian.test.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.test.model.Address;
import com.masivian.test.repository.AddressRepository;
import com.masivian.test.services.AddressService;
import com.masivian.test.services.dto.AddressDTO;
import com.masivian.test.services.mapper.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService{
	
	private Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	@Autowired
	private AddressRepository  addressRepository;
	
	@Autowired
	private AddressMapper addressMapper;

	@Override
	public AddressDTO save(AddressDTO addressDTO) {
		log.info("saving address details");
		Address address = addressMapper.toEntity(addressDTO);
		address = addressRepository.save(address);
		return addressMapper.toDto(address);
	}

}
