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
		application.Main.stage.setTitle("Tester");
		application.Main.stage.setScene(application.Main.scene);
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
}
