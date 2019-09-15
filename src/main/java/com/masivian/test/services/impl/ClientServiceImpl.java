package com.masivian.test.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masivian.test.model.Client;
import com.masivian.test.repository.ClientRepository;
import com.masivian.test.services.ClientService;
import com.masivian.test.services.dto.ClientDTO;
import com.masivian.test.services.mapper.ClientMapper;

@Service
public class ClientServiceImpl implements ClientService {

	private Logger log = LoggerFactory.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientMapper clientMapper;
	
	@Override
	public ClientDTO save(ClientDTO clientDTO) {
		log.info("saving client details");
		Client client = clientMapper.toEntity(clientDTO);
		client = clientRepository.save(client);
		return clientMapper.toDto(client);
	}

}
