package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class GPACalcController {

    @FXML
    private TextField courseCode1;

    @FXML
    private TextField creditWeight1;

    @FXML
    private SplitMenuButton grades1;

    @FXML
    private TextField courseCode2;

    @FXML
    private TextField creditWeight2;

    @FXML
    private TextField courseCode3;

    @FXML
    private TextField creditWeight3;

    @FXML
    private TextField courseCode4;

    @FXML
    private TextField creditWeight4;

    @FXML
    private TextField courseCode5;

    @FXML
    private TextField creditWeight5;

    @FXML
    private TextField courseCode6;

    @FXML
    private TextField creditWeight6;

    @FXML
    private TextField courseCode7;

    @FXML
    private TextField courseCode8;

    @FXML
    private TextField creditWeight7;

    @FXML
    private TextField courseCode9;

    @FXML
    private TextField creditWeight8;

    @FXML
    private TextField courseCode10;

    @FXML
    private TextField creditWeight9;

    @FXML
    private TextField courseCode11;

    @FXML
    private TextField creditWeight10;

    @FXML
    private TextField courseCode12;

    @FXML
    private TextField creditWeight11;

    @FXML
    private TextField courseCode13;

    @FXML
    private TextField creditWeight12;

    @FXML
    private TextField courseCode14;

    @FXML
    private TextField creditWeight13;

    @FXML
    private TextField courseCode15;

    @FXML
    private TextField creditWeight14;

    @FXML
    private TextField courseCode16;

    @FXML
    private TextField creditWeight15;

    @FXML
    private TextField courseCode17;

    @FXML
    private TextField creditWeight16;

    @FXML
    private TextField creditWeight17;

    @FXML
    private SplitMenuButton grades2;

    @FXML
    private SplitMenuButton grades17;

    @FXML
    private SplitMenuButton grades16;

    @FXML
    private SplitMenuButton grades15;

    @FXML
    private SplitMenuButton grades14;

    @FXML
    private SplitMenuButton grades13;

    @FXML
    private SplitMenuButton grades12;

    @FXML
    private SplitMenuButton grades11;

    @FXML
    private SplitMenuButton grades10;

    @FXML
    private SplitMenuButton grades9;

    @FXML
    private SplitMenuButton grades8;

    @FXML
    private SplitMenuButton grades7;

    @FXML
    private SplitMenuButton grades6;

    @FXML
    private SplitMenuButton grades5;

    @FXML
    private SplitMenuButton grades4;

    @FXML
    private SplitMenuButton grades3;

    @FXML
    private Button computeGpa;

    @FXML
    private TextField finalVal;
    
    int totalCreds = 0;
    
    int GradePoint = 0;
    
    double GPA = 0;
    
    
    public void initialize() {
    	finalVal.setEditable(false);
    }
    
    
    @FXML
    protected void setFistGrade(ActionEvent event) {
//    	this.GradePoint += Integer.parseInt(creditWeight1.getText());
    	System.out.println(grades1.getText());
    }
    
}
