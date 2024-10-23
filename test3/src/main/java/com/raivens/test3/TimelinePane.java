package com.raivens.test3;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class TimelinePane extends Pane {
	
	private Circle circle;

	public TimelinePane() {
		// TODO Auto-generated constructor stub
//		System.out.println("you know what scope means?");
		circle = new Circle(40, Color.BLACK);
		circle.setOpacity(0.2);
		circle.setLayoutX(600/3);
		circle.setLayoutY(600/3);
		getChildren().add(circle);
	}
	
	public void animate() {
		//start
		KeyValue startOpacityKeyValue = new KeyValue(circle.opacityProperty(), 0.2);
		KeyValue startXKeyValue = new KeyValue(circle.translateXProperty(), 0);
		KeyValue startYKeyValue = new KeyValue(circle.translateYProperty(), 0);
		KeyFrame startFrame = new KeyFrame(Duration.ZERO, startOpacityKeyValue, startXKeyValue, startYKeyValue);
		
		//end
		KeyValue endOpacityKeyValue = new KeyValue(circle.opacityProperty(), 1);
		KeyValue endXKeyValue = new KeyValue(circle.translateXProperty(), 200);
		KeyValue endYKeyValue = new KeyValue(circle.translateYProperty(), 200);
		KeyFrame endFrame = new KeyFrame(Duration.seconds(5), endOpacityKeyValue, endXKeyValue, endYKeyValue);
		
		Timeline timeline = new Timeline(startFrame, endFrame);
		timeline.setAutoReverse(true);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}
}
