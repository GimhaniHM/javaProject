package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class StylesControllerPart1 implements Initializable {
	@FXML
	private Button nextButton,backButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"stylesPart2-view.fxml","HTML Styles");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"attributesPart3-view.fxml","HTML Attributes");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}); 
		
	}

}
