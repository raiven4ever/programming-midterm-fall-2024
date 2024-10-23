package com.raivens.test.model;

public class Client {
	
	private final String name;
	private final int id;
	private final String email;

	public Client(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	
}
