package com.raivens.test2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Scale;

public class CircleController implements Initializable{
	
	@FXML
	TextField x;
	
	@FXML
	TextField y;
	
	@FXML
	TextField pivotX;
	
	@FXML
	TextField pivotY;
	
	@FXML
	Circle circle;

	private Affine affine;
	
	@FXML
	public void goBack() throws IOException {
		App.setRoot("main");
	}
	
	@FXML
	public void scale() {
		try {
			affine.append(new Scale(
					Double.valueOf(x.getText()), 
					Double.valueOf(y.getText()), 
					Double.valueOf(pivotX.getText()), 
					Double.valueOf(pivotY.getText())));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("one of the inputs is invalid");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		affine = new Affine();
		circle.getTransforms().add(affine);
	}
}
