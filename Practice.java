/**
*author:Ziyi
*Date:3/15
*/
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.util.Optional;

import javafx.application.*;

public class Practice extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
		
		int groupSize = 0; int remain = 0;
		
		TextInputDialog myInput = new TextInputDialog();
		myInput.setTitle("Group Szie Calculator");
		myInput.setHeaderText("");
		myInput.setContentText("Enter the number of people here: ");
		Optional<String> result = myInput.showAndWait();
		int numPeople = Integer.parseInt(result.get());
		
		if (numPeople>10){
             groupSize = numPeople/2;	
             remain = numPeople%2;
             
              Alert myAlert = new Alert(AlertType.CONFIRMATION);
		      myAlert.setTitle("Result of group size");
		      myAlert.setContentText("The number of people is: "+ numPeople+ ".\n and can divided to "+ groupSize + "groups. \nand remain: "+ remain +"People.");
			  myAlert.showAndWait();
             
		}else if(numPeople>3){
		     groupSize = numPeople/3;
		     remain = numPeople%3;
		     
		      Alert myAlert = new Alert(AlertType.CONFIRMATION);
		      myAlert.setTitle("Result of group size");
		      myAlert.setContentText("The number of people is: "+ numPeople+ ".\n and can divided to "+ groupSize + "groups. \nand remain: "+ remain +"People.");
			  myAlert.showAndWait();
		}else
		{
			 Alert myAlert = new Alert(AlertType.CONFIRMATION);
		     myAlert.setTitle("Result of group size"); 
			 myAlert.setContentText("Please enter at least need 3 people.");
			myAlert.showAndWait();
		} 
		
		
		
	}
	
	
}
