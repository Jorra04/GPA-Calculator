package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{ 
		
		Parent root = FXMLLoader.load(getClass().getResource("/FXMLDocs/GPACalculator.fxml"));
		   
	    Scene scene = new Scene(root, 650, 980);
		
	   
	
	    primaryStage.setTitle("GPA Calculator");
	    primaryStage.setScene(scene);
	    primaryStage.setResizable(true);
	    primaryStage.show();
	
	    
	   
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}