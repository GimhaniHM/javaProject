package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ContentController implements Initializable {
	@FXML
    private Button nextButton,backButton,introButton,structButton,elemButton,headButton,paraButton,attriButton,styleButton,cssButton,linkButton,imageButton,tableButton,listButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"introductionPart1-view.fxml","HTML Introduction");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
	/*	backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,null,null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});		*/
		
		introButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"introductionPart1-view.fxml","HTML Introduction");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		structButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"structure-view.fxml","HTML Structure");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		elemButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"elementsPart1-view.fxml","HTML Elements");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		headButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"headings-view.fxml","HTML Headings");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		paraButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"paragraphsPart1-view.fxml","HTML Paragraphs");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		attriButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"attributesPart1-view.fxml","HTML Attributes");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		styleButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"stylesPart1-view.fxml","HTML Styles");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		cssButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"css-view.fxml","HTML Styles-CSS");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		linkButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"linksPart1-view.fxml","HTML Links");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		imageButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"imagesPart1-view.fxml","HTML Images");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		tableButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"tablesPart1-view.fxml","HTML Tables");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		listButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					MainController.changeScene(event,"listPart1-view.fxml","HTML Lists");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		
		
	}
	
	

}
