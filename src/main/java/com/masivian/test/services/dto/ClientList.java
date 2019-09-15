package com.masivian.test.services.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClientList implements Serializable{

	private List<ClientDTO> clients;

	public ClientList() {
		clients = new ArrayList<>();
	}

	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}

}
