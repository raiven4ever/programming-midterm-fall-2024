package com.raivens.test2;

import java.io.IOException;

import javafx.fxml.FXML;

public class MainController {
	
	@FXML
	public void goToCircleScene() throws IOException {
		App.setRoot("circle");
	}
	
	@FXML
	public void goToRectangleScene() throws IOException {
		App.setRoot("rectangle");
	}
}
