package com.raivens.test.model;

import java.util.ArrayList;

public class ClientHandler {
	
	private ArrayList<Client> clients;

	public ClientHandler(ArrayList<Client> clients) {
		this.clients = clients;

	}
	
	public Client getByID (int id) {
		return clients.stream().filter(client -> client.getId() == id).findFirst().get();
	}
	
	public Client getByName (String name) {
		return clients.stream().filter(client -> client.getName().equalsIgnoreCase(name)).findFirst().get();
	}
	
	public Client getByBoth (int id, String name) {
		Client byID = getByID(id);
		return byID.equals(getByName(name)) ? byID : null;
	}

}
