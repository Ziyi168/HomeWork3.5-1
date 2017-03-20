import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.application.*;

import java.util.Optional;


public class Review extends Application{
	public void start (Stage primaryStage){
		
		TextInputDialog myInput = new TextInputDialog ();
		myInput.setContentText("Enter your name");
		Optional<String> name = myInput.showAndWait();
		myInput.setContentText("Enter your password");
		Optional<String> pw = myInput.showAndWait();
		Alert myAlert = new Alert(AlertType.CONFIRMATION);
		   
				
			    if((name.get().equals("ziyi"))&&(pw.get().equals("123"))){
				   myAlert.setContentText("Welcome, "+ name.get());
				   myAlert.showAndWait();
			    }else 
			      myAlert.setContentText("Invalid enter. Try again.");	
			      myAlert.showAndWait();
		
		
	}
}
