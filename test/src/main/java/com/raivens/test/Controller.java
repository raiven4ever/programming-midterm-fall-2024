package com.raivens.test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.raivens.test.model.Client;
import com.raivens.test.model.ClientHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller implements Initializable {
	
	@FXML
	Text textClientID;
	
	@FXML
	Text textClientName;
	
	@FXML
	Text textEmail;

	@FXML
	TextField fieldID;
	
	@FXML
	TextField fieldName;
	
	@FXML
	Text noClientText;
	
	ClientHandler database;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		textClientID.setText(" ");
		textClientName.setText(" ");
		textEmail.setText(" ");
		noClientText.setOpacity(0);
		
		database = new ClientHandler(new ArrayList<Client>(
				List.of(
						new Client("raiven", 1, "raiven@gmail.com"),
						new Client("wolfe", 2, "wolfesteinkeller@gmail.com"),
						new Client("shorbo", 3, "shorbo@mrbeast.com"),
						new Client("vinith", 4, "shakespeare@yahoo.com"),
						new Client("pain", 5, "akatsuki+leader@konoha.com"))));
		
	}
	
	@FXML
	public void getInput() {
		noClientText.setOpacity(0);
		String clientID = fieldID.getText();
		String clientName = fieldName.getText();
		if (clientID.isEmpty() && clientName.isEmpty())
			return;
		Client client = null;
		try {
			if (!clientID.isEmpty() && !clientName.isEmpty())
				client = database.getByBoth(Integer.valueOf(clientID), clientName);
			else if (!clientID.isEmpty())
				client = database.getByID(Integer.valueOf(clientID));
			else if (!clientName.isEmpty()) {
				client = database.getByName(clientName);
			}
			
			textClientID.setText(client.getId()+"");
			textClientName.setText(client.getName());
			textEmail.setText(client.getEmail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println("no match is found");
			noClientText.setOpacity(1);
		}
		
	}

}
