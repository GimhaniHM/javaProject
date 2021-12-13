package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class StructureControllerPart1 implements Initializable{
	@FXML
	private Button backButton,nextButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"elementsPart1-view.fxml","HTML Elements");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"introductionPart2-view.fxml","HTML Introduction");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}); 
		
	}
	

}
