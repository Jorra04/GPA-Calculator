package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;

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
