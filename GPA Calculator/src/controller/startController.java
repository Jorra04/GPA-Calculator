package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class startController {

	@FXML
	private SplitMenuButton schools;
	@FXML
	private Button select;

	@FXML
	private MenuItem york;

	@FXML
	private MenuItem western;

	@FXML
	private MenuItem guelph;

	@FXML
	private MenuItem waterloo;

	@FXML
	private MenuItem carleton;

	@FXML
	private MenuItem uOfT;

	@FXML
	private MenuItem ottawa;

	@FXML
	private MenuItem lakehead;

	@FXML
	private MenuItem mcMaster;

	@FXML
	private MenuItem Laurier;

	@FXML
	private MenuItem mcGill;

	@FXML
	private MenuItem Queens;

	@FXML
	private MenuItem sheriden;

	public void initialize() {
		Image image1 = new Image(getClass().getResourceAsStream("/images/york.jpg"));
		ImageView iv1 = new ImageView(image1);
		iv1.setFitWidth(15);
		iv1.setFitHeight(15);
		york.setGraphic(iv1);
		
		Image image2 = new Image(getClass().getResourceAsStream("/images/carleton.png"));
		ImageView iv2 = new ImageView(image2);
		iv2.setFitWidth(15);
		iv2.setFitHeight(15);
		carleton.setGraphic(iv2);
		Image image3 = new Image(getClass().getResourceAsStream("/images/guelph.png"));
		ImageView iv3 = new ImageView(image3);
		iv3.setFitWidth(15);
		iv3.setFitHeight(15);
		guelph.setGraphic(iv3);
		Image image4 = new Image(getClass().getResourceAsStream("/images/Lakehead.png"));
		ImageView iv4 = new ImageView(image4);
		iv4.setFitWidth(15);
		iv4.setFitHeight(15);
		lakehead.setGraphic(iv4);
		Image image5 = new Image(getClass().getResourceAsStream("/images/laurier.png"));
		ImageView iv5 = new ImageView(image5);
		iv5.setFitWidth(15);
		iv5.setFitHeight(15);
		Laurier.setGraphic(iv5);
		Image image6 = new Image(getClass().getResourceAsStream("/images/mcgill.png"));
		ImageView iv6 = new ImageView(image6);
		iv6.setFitWidth(15);
		iv6.setFitHeight(15);
		mcGill.setGraphic(iv6);
		Image image7 = new Image(getClass().getResourceAsStream("/images/mcmaster.jpg"));
		ImageView iv7 = new ImageView(image7);
		iv7.setFitWidth(15);
		iv7.setFitHeight(15);
		mcMaster.setGraphic(iv7);
		Image image8 = new Image(getClass().getResourceAsStream("/images/ottawa.jpeg"));
		ImageView iv8 = new ImageView(image8);
		iv8.setFitWidth(15);
		iv8.setFitHeight(15);
		ottawa.setGraphic(iv8);
		Image image9 = new Image(getClass().getResourceAsStream("/images/sheridan.png"));
		ImageView iv9 = new ImageView(image9);
		iv9.setFitWidth(15);
		iv9.setFitHeight(15);
		sheriden.setGraphic(iv9);
		Image image10 = new Image(getClass().getResourceAsStream("/images/uoft.png"));
		ImageView iv10 = new ImageView(image10);
		iv10.setFitWidth(15);
		iv10.setFitHeight(15);
		uOfT.setGraphic(iv10);
		Image image11 = new Image(getClass().getResourceAsStream("/images/waterloo.png"));
		ImageView iv11 = new ImageView(image11);
		iv11.setFitWidth(15);
		iv11.setFitHeight(15);
		waterloo.setGraphic(iv11);
		Image image12 = new Image(getClass().getResourceAsStream("/images/western.png"));
		ImageView iv12 = new ImageView(image12);
		iv12.setFitWidth(15);
		iv12.setFitHeight(15);
		western.setGraphic(iv12);
		Image image13 = new Image(getClass().getResourceAsStream("/images/queens.png"));
		ImageView iv13 = new ImageView(image13);
		iv13.setFitWidth(15);
		iv13.setFitHeight(15);
		Queens.setGraphic(iv13);
		
	}

	@FXML
	protected void schoolEntered(ActionEvent event) {
		schoolChooser(schools.getText());
	}

	@FXML
	protected void york(ActionEvent event) {
		schools.setText("York");
	}

	@FXML
	protected void Waterloo(ActionEvent event) {
		schools.setText("Waterloo");
	}

	@FXML
	protected void Western(ActionEvent event) {
		schools.setText("Western");
	}

	@FXML
	protected void Guelph(ActionEvent event) {
		schools.setText("Guelph");
	}

	@FXML
	protected void sheriden(ActionEvent event) {
		schools.setText("Sheriden");
	}

	@FXML
	protected void ottawa(ActionEvent event) {
		schools.setText("Ottawa");
	}

	@FXML
	protected void carleton(ActionEvent event) {
		schools.setText("Carleton");
	}

	@FXML
	protected void laurier(ActionEvent event) {
		schools.setText("Laurier");
	}

	@FXML
	protected void mcMaster(ActionEvent event) {
		schools.setText("McMaster");
	}

	@FXML
	protected void mcGill(ActionEvent event) {
		schools.setText("McGill");
	}

	@FXML
	protected void lakehead(ActionEvent event) {
		schools.setText("Lakehead");
	}

	@FXML
	protected void uofT(ActionEvent event) {
		schools.setText("UofT");
	}

	@FXML
	protected void queens(ActionEvent event) {
		schools.setText("Queens");
	}

	protected void schoolChooser(String text) {
		if (text.equals("York")) {
			application.Main.stage.setTitle("York GPA Calculator");
			application.Main.stage.setScene(application.Main.york);
		} else if (text.equals("Waterloo")) {
			application.Main.stage.setTitle("Waterloo GPA Calculator");
			application.Main.stage.setScene(application.Main.Waterloo);
		} else if (text.equals("Western")) {
			application.Main.stage.setTitle("Western GPA Calculator");
			application.Main.stage.setScene(application.Main.Western);
		} else if (text.equals("Guelph")) {
			application.Main.stage.setTitle("Guelph GPA Calculator");
			application.Main.stage.setScene(application.Main.Guelph);
		} else if (text.equals("Sheriden")) {
			application.Main.stage.setTitle("Sheriden GPA Calculator");
			application.Main.stage.setScene(application.Main.Sheriden);
		} else if (text.equals("Ottawa")) {
			application.Main.stage.setTitle("Ottawa GPA Calculator");
			application.Main.stage.setScene(application.Main.Ottawa);
		} else if (text.equals("McMaster")) {
			application.Main.stage.setTitle("McMaster GPA Calculator");
			application.Main.stage.setScene(application.Main.McMaster);
		} else if (text.equals("Carleton")) {
			application.Main.stage.setTitle("Carleton GPA Calculator");
			application.Main.stage.setScene(application.Main.carleton);
		} else if (text.equals("Laurier")) {
			application.Main.stage.setTitle("Laurier GPA Calculator");
			application.Main.stage.setScene(application.Main.Laurier);
		} else if (text.equals("McGill")) {
			application.Main.stage.setTitle("McGill GPA Calculator");
			application.Main.stage.setScene(application.Main.McGill);
		} else if (text.equals("Lakehead")) {
			application.Main.stage.setTitle("Lakehead GPA Calculator");
			application.Main.stage.setScene(application.Main.Lakehead);
		} else if (text.equals("UofT")) {
			application.Main.stage.setTitle("UofT GPA Calculator");
			application.Main.stage.setScene(application.Main.UofT);
		} else if (text.equals("Queens")) {
			application.Main.stage.setTitle("Queens GPA Calculator");
			application.Main.stage.setScene(application.Main.Queens);
		}
		else {
			application.Main.stage.setTitle("random");
			application.Main.stage.setScene(application.Main.york);
		}
	}
}
