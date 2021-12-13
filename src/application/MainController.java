package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	public static void changeScene(ActionEvent event, String fxmlFile, String title) throws IOException {
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource(fxmlFile));
       	root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root,1000,600));
        stage.show();


    }
	
	public static void changeShape(ActionEvent event) throws IOException{
		
	}

}
