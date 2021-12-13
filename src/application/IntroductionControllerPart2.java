package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class IntroductionControllerPart2 implements Initializable{
	@FXML
	private Button backButton,nextButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"structure-view.fxml","HTML Structure");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"introductionPart1-view.fxml","HTML Introduction");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}); 
		
	}
	

}
