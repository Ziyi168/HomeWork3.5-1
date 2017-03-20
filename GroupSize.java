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

public class Review extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
		boolean isCorrect; 
		int count =0;
		
		isCorrect = false;
		do{
			TextInputDialog myDialog = new TextInputDialog();
			myDialog.setTitle("Player Number");
			myDialog.setContentText("Enter the number of players: ");
			Optional<String> result = myDialog.showAndWait();
			int numPlayer = Integer.parseInt(result.get());
				
			
			if ((numPlayer >=11)&&(numPlayer<=55)){
				int numTeam = numPlayer/11;
				Alert myAlert = new Alert(AlertType.CONFIRMATION);
				myAlert.setContentText("There are " + numPlayer + "players, \ncan be divided to"+ numTeam +"teams.");
				myAlert.showAndWait();
				isCorrect = true;
			}else{
				
				Alert myAlert = new Alert(AlertType.CONFIRMATION);
			    myAlert.setContentText("There is only 1 team");
			    myAlert.showAndWait();
			    
			}
			count += 1;
		}while(count<3);
	
	}
}

// 3.4 group size , javaFx, if stamen
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
