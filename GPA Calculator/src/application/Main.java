package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Scene promptWindow ;
	public static Scene scene;
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception{ 
		stage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/FXMLDocs/GPACalculator.fxml"));
		Parent root2 = FXMLLoader.load(getClass().getResource("/FXMLDocs/startPage.fxml")); 
	     scene = new Scene(root, 581, 610);
		
	   promptWindow = new Scene(root2,581,610);
	
	    primaryStage.setTitle("GPA Calculator");
	    primaryStage.setScene(promptWindow);
	    primaryStage.setResizable(true);
	    primaryStage.show();
	
	    
	   
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}