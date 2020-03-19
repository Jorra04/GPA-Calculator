package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Scene promptWindow ;
	public static Scene york;
	
	public static Scene carleton;
	public static Scene Guelph;
	public static Scene Lakehead;
	public static Scene McGill;
	public static Scene McMaster;
	public static Scene Ottawa;
	public static Scene Queens;
	public static Scene Ryerson;
	public static Scene Western;
	public static Scene Waterloo;
	public static Scene UofT;
	public static Scene Laurier;
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception{ 
		stage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/FXMLDocs/York.fxml"));
		Parent root2 = FXMLLoader.load(getClass().getResource("/FXMLDocs/startPage.fxml"));
		Parent root3 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Carleton.fxml")); 
		Parent root4 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Guelph.fxml")); 
		Parent root5 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Lakehead.fxml")); 
		Parent root6 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Laurier.fxml")); 
		Parent root7 = FXMLLoader.load(getClass().getResource("/FXMLDocs/McGill.fxml")); 
		Parent root8 = FXMLLoader.load(getClass().getResource("/FXMLDocs/McMaster.fxml")); 
		Parent root9 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Ottawa.fxml")); 
		Parent root10 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Queens.fxml"));
		Parent root11 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Sheriden.fxml"));
		Parent root12 = FXMLLoader.load(getClass().getResource("/FXMLDocs/UofT.fxml"));
		Parent root13 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Waterloo.fxml"));
		Parent root14 = FXMLLoader.load(getClass().getResource("/FXMLDocs/Western.fxml"));
	    york = new Scene(root, 581, 610);
	    carleton= new Scene(root3, 581, 610);
	    Guelph = new Scene(root4, 581, 610);
	    Lakehead = new Scene(root5, 581, 610);
	    McGill = new Scene(root7, 581, 610);
	    McMaster = new Scene(root8, 581, 610);
	    Ottawa = new Scene(root9, 581, 610);
	    Queens = new Scene(root10, 581, 610);
	    Ryerson = new Scene(root11, 581, 610);
	    Western = new Scene(root14, 581, 610);
	    Waterloo = new Scene(root13, 581, 610);
	    UofT = new Scene(root12, 581, 610);
	    Laurier = new Scene(root6, 581, 610);
		
	    promptWindow = new Scene(root2,460,290);
	    Image icon = new Image(getClass().getResourceAsStream("/images/schoolIcon.png"));
	    stage.getIcons().add(0,icon);
	    primaryStage.setTitle("GPA Calculator");
	    primaryStage.setScene(promptWindow);
	    primaryStage.setResizable(true);
	    primaryStage.show();
	
	    
	   
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}