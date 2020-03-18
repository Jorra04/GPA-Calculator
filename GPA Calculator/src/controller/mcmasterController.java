package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.text.DecimalFormat;
import java.util.*;

public class mcmasterController {
	@FXML
    private AnchorPane mainPane;

    @FXML
    private Menu file;

    @FXML
    private MenuItem open;

    @FXML
    private MenuItem save;

    @FXML
    private MenuItem back;

    @FXML
    private MenuItem close;

    @FXML
    private Menu edit;

    @FXML
    private MenuItem clearAll;

    @FXML
    private Menu help;

    @FXML
    private MenuItem about;

    @FXML
    private TextField course1;

    @FXML
    private TextField gradePoint1;

    @FXML
    private TextField course2;

    @FXML
    private TextField gradePoint2;

    @FXML
    private TextField course3;

    @FXML
    private TextField gradePoint3;

    @FXML
    private TextField course4;

    @FXML
    private TextField gradePoint4;

    @FXML
    private TextField course5;

    @FXML
    private TextField gradePoint5;

    @FXML
    private TextField course6;

    @FXML
    private TextField gradePoint6;

    @FXML
    private TextField course7;

    @FXML
    private TextField gradePoint7;

    @FXML
    private TextField course8;

    @FXML
    private TextField gradePoint8;

    @FXML
    private TextField course9;

    @FXML
    private TextField gradePoint9;

    @FXML
    private TextField course10;

    @FXML
    private TextField gradePoint10;

    @FXML
    private TextField course11;

    @FXML
    private TextField gradePoint11;

    @FXML
    private TextField course12;

    @FXML
    private TextField gradePoint12;

    @FXML
    private TextField course13;

    @FXML
    private TextField gradePoint13;

    @FXML
    private TextField course14;

    @FXML
    private TextField gradePoint14;

    @FXML
    private TextField course15;

    @FXML
    private TextField gradePoint15;

    @FXML
    private TextField course16;

    @FXML
    private TextField gradePoint16;

    @FXML
    private TextField course17;

    @FXML
    private TextField gradePoint17;

    @FXML
    private SplitMenuButton grade1;

    @FXML
    private SplitMenuButton grade2;

    @FXML
    private SplitMenuButton grade3;

    @FXML
    private SplitMenuButton grade5;

    @FXML
    private SplitMenuButton grade6;

    @FXML
    private SplitMenuButton grade8;

    @FXML
    private SplitMenuButton grade9;

    @FXML
    private SplitMenuButton grade12;

    @FXML
    private SplitMenuButton grade13;

    @FXML
    private SplitMenuButton grade14;

    @FXML
    private SplitMenuButton grade15;

    @FXML
    private SplitMenuButton grade16;

    @FXML
    private SplitMenuButton grade17;

    @FXML
    private SplitMenuButton grade4;

    @FXML
    private SplitMenuButton grade7;

    @FXML
    private SplitMenuButton grade10;

    @FXML
    private SplitMenuButton grade11;

    @FXML
    private TextField course18;

    @FXML
    private TextField gradePoint18;

    @FXML
    private TextField course19;

    @FXML
    private TextField gradePoint19;

    @FXML
    private TextField course20;

    @FXML
    private TextField gradePoint20;

    @FXML
    private TextField course21;

    @FXML
    private TextField gradePoint21;

    @FXML
    private TextField course22;

    @FXML
    private TextField gradePoint22;

    @FXML
    private TextField course23;

    @FXML
    private TextField gradePoint23;

    @FXML
    private SplitMenuButton grade18;

    @FXML
    private SplitMenuButton grade19;

    @FXML
    private SplitMenuButton grade20;

    @FXML
    private SplitMenuButton grade21;

    @FXML
    private SplitMenuButton grade22;

    @FXML
    private SplitMenuButton grade23;

    @FXML
    private TextField finalGpa;

    @FXML
    private Button compute;

    @FXML
    private TextField course24;

    @FXML
    private TextField gradePoint24;

    @FXML
    private TextField course25;

    @FXML
    private TextField gradePoint25;

    @FXML
    private TextField course26;

    @FXML
    private TextField gradePoint26;

    @FXML
    private TextField course27;

    @FXML
    private TextField gradePoint27;

    @FXML
    private TextField course28;

    @FXML
    private TextField gradePoint28;

    @FXML
    private TextField course29;

    @FXML
    private TextField gradePoint29;

    @FXML
    private SplitMenuButton grade24;

    @FXML
    private SplitMenuButton grade25;

    @FXML
    private SplitMenuButton grade26;

    @FXML
    private SplitMenuButton grade27;

    @FXML
    private SplitMenuButton grade28;

    @FXML
    private SplitMenuButton grade29;


    @FXML
    private TextField course30;

    @FXML
    private TextField gradePoint30;

    @FXML
    private TextField course31;

    @FXML
    private TextField gradePoint31;

    @FXML
    private TextField course32;

    @FXML
    private TextField gradePoint32;

    @FXML
    private TextField course33;

    @FXML
    private TextField gradePoint33;

    @FXML
    private TextField course34;

    @FXML
    private TextField gradePoint34;

    @FXML
    private TextField course35;

    @FXML
    private TextField gradePoint35;

    @FXML
    private SplitMenuButton grade30;

    @FXML
    private SplitMenuButton grade31;

    @FXML
    private SplitMenuButton grade32;

    @FXML
    private SplitMenuButton grade33;

    @FXML
    private SplitMenuButton grade34;

    @FXML
    private SplitMenuButton grade35;

    @FXML
    private TextField course36;

    @FXML
    private TextField gradePoint36;

    @FXML
    private TextField course37;

    @FXML
    private TextField gradePoint37;

    @FXML
    private TextField course38;

    @FXML
    private TextField gradePoint38;

    @FXML
    private TextField course39;

    @FXML
    private TextField gradePoint39;

    @FXML
    private SplitMenuButton grade36;

    @FXML
    private SplitMenuButton grade37;

    @FXML
    private SplitMenuButton grade38;

    @FXML
    private SplitMenuButton grade39;

    @FXML
    private TextField course40;

    @FXML
    private TextField gradePoint40;

    @FXML
    private SplitMenuButton grade40;

	double totalCreds = 0;

	double GradePoint = 0;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	

	double GPA = 0;

	double[] gradePointArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int[] gradeArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

	public void initialize() {
		finalGpa.setEditable(false);
		
	}

	@FXML
	protected void setAP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,12,"A+");
	}
	@FXML
	protected void setA1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,11,"A");
	}
	@FXML
	protected void setAM1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,10,"A-");
	}
	@FXML
	protected void setBP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,9,"B+");
	}
	@FXML
	protected void setB1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,8,"B");
	}
	@FXML
	protected void setBM1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,7,"B-");
	}
	@FXML
	protected void setCP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,6,"C+");
	}
	@FXML
	protected void setC1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,5,"C");
	}
	@FXML
	protected void setCM1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,4,"C-");
	}
	@FXML
	protected void setDP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,3,"D+");
	}
	@FXML
	protected void setD1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,2,"D");
	}
	@FXML
	protected void setDM1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,1,"D-");
	}
	@FXML
	protected void setF1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,0,"F");
	}
	@FXML
	protected void setAP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,12,"A+");
	}
	@FXML
	protected void setA2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,11,"A");
	}
	@FXML
	protected void setAM2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,10,"A-");
	}
	@FXML
	protected void setBP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,9,"B+");
	}
	@FXML
	protected void setB2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,8,"B");
	}
	@FXML
	protected void setBM2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,7,"B-");
	}
	@FXML
	protected void setCP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,6,"C+");
	}
	@FXML
	protected void setC2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,5,"C");
	}
	@FXML
	protected void setCM2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,4,"C-");
	}
	@FXML
	protected void setDP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,3,"D+");
	}
	@FXML
	protected void setD2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,2,"D");
	}
	@FXML
	protected void setDM2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,1,"D-");
	}
	@FXML
	protected void setF2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,0,"F");
	}
	@FXML
	protected void setAP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,12,"A+");
	}
	@FXML
	protected void setA3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,11,"A");
	}
	@FXML
	protected void setAM3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,10,"A-");
	}
	@FXML
	protected void setBP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,9,"B+");
	}
	@FXML
	protected void setB3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,8,"B");
	}
	@FXML
	protected void setBM3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,7,"B-");
	}
	@FXML
	protected void setCP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,6,"C+");
	}
	@FXML
	protected void setC3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,5,"C");
	}
	@FXML
	protected void setCM3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,4,"C-");
	}
	@FXML
	protected void setDP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,3,"D+");
	}
	@FXML
	protected void setD3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,2,"D");
	}
	@FXML
	protected void setDM3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,1,"D-");
	}
	@FXML
	protected void setF3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,0,"F");
	}
	@FXML
	protected void setAP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,12,"A+");
	}
	@FXML
	protected void setA4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,11,"A");
	}
	@FXML
	protected void setAM4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,10,"A-");
	}
	@FXML
	protected void setBP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,9,"B+");
	}
	@FXML
	protected void setB4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,8,"B");
	}
	@FXML
	protected void setBM4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,7,"B-");
	}
	@FXML
	protected void setCP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,6,"C+");
	}
	@FXML
	protected void setC4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,5,"C");
	}
	@FXML
	protected void setCM4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,4,"C-");
	}
	@FXML
	protected void setDP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,3,"D+");
	}
	@FXML
	protected void setD4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,2,"D");
	}
	@FXML
	protected void setDM4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,1,"D-");
	}
	@FXML
	protected void setF4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,0,"F");
	}
	@FXML
	protected void setAP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,12,"A+");
	}
	@FXML
	protected void setA5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,11,"A");
	}
	@FXML
	protected void setAM5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,10,"A-");
	}
	@FXML
	protected void setBP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,9,"B+");
	}
	@FXML
	protected void setB5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,8,"B");
	}
	@FXML
	protected void setBM5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,7,"B-");
	}
	@FXML
	protected void setCP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,6,"C+");
	}
	@FXML
	protected void setC5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,5,"C");
	}
	@FXML
	protected void setCM5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,4,"C-");
	}
	@FXML
	protected void setDP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,3,"D+");
	}
	@FXML
	protected void setD5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,2,"D");
	}
	@FXML
	protected void setDM5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,1,"D-");
	}
	@FXML
	protected void setF5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,0,"F");
	}
	@FXML
	protected void setAP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,12,"A+");
	}
	@FXML
	protected void setA6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,11,"A");
	}
	@FXML
	protected void setAM6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,10,"A-");
	}
	@FXML
	protected void setBP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,9,"B+");
	}
	@FXML
	protected void setB6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,8,"B");
	}
	@FXML
	protected void setBM6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,7,"B-");
	}
	@FXML
	protected void setCP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,6,"C+");
	}
	@FXML
	protected void setC6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,5,"C");
	}
	@FXML
	protected void setCM6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,4,"C-");
	}
	@FXML
	protected void setDP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,3,"D+");
	}
	@FXML
	protected void setD6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,2,"D");
	}
	@FXML
	protected void setDM6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,1,"D-");
	}
	@FXML
	protected void setF6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,0,"F");
	}
	@FXML
	protected void setAP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,12,"A+");
	}
	@FXML
	protected void setA7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,11,"A");
	}
	@FXML
	protected void setAM7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,10,"A-");
	}
	@FXML
	protected void setBP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,9,"B+");
	}
	@FXML
	protected void setB7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,8,"B");
	}
	@FXML
	protected void setBM7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,7,"B-");
	}
	@FXML
	protected void setCP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,6,"C+");
	}
	@FXML
	protected void setC7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,5,"C");
	}
	@FXML
	protected void setCM7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,4,"C-");
	}
	@FXML
	protected void setDP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,3,"D+");
	}
	@FXML
	protected void setD7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,2,"D");
	}
	@FXML
	protected void setDM7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,1,"D-");
	}
	@FXML
	protected void setF7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,0,"F");
	}
	@FXML
	protected void setAP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,12,"A+");
	}
	@FXML
	protected void setA8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,11,"A");
	}
	@FXML
	protected void setAM8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,10,"A-");
	}
	@FXML
	protected void setBP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,9,"B+");
	}
	@FXML
	protected void setB8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,8,"B");
	}
	@FXML
	protected void setBM8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,7,"B-");
	}
	@FXML
	protected void setCP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,6,"C+");
	}
	@FXML
	protected void setC8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,5,"C");
	}
	@FXML
	protected void setCM8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,4,"C-");
	}
	@FXML
	protected void setDP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,3,"D+");
	}
	@FXML
	protected void setD8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,2,"D");
	}
	@FXML
	protected void setDM8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,1,"D-");
	}
	@FXML
	protected void setF8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,0,"F");
	}
	@FXML
	protected void setAP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,12,"A+");
	}
	@FXML
	protected void setA9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,11,"A");
	}
	@FXML
	protected void setAM9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,10,"A-");
	}
	@FXML
	protected void setBP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,9,"B+");
	}
	@FXML
	protected void setB9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,8,"B");
	}
	@FXML
	protected void setBM9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,7,"B-");
	}
	@FXML
	protected void setCP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,6,"C+");
	}
	@FXML
	protected void setC9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,5,"C");
	}
	@FXML
	protected void setCM9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,4,"C-");
	}
	@FXML
	protected void setDP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,3,"D+");
	}
	@FXML
	protected void setD9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,2,"D");
	}
	@FXML
	protected void setDM9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,1,"D-");
	}
	@FXML
	protected void setF9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,0,"F");
	}
	@FXML
	protected void setAP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,12,"A+");
	}
	@FXML
	protected void setA10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,11,"A");
	}
	@FXML
	protected void setAM10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,10,"A-");
	}
	@FXML
	protected void setBP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,9,"B+");
	}
	@FXML
	protected void setB10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,8,"B");
	}
	@FXML
	protected void setBM10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,7,"B-");
	}
	@FXML
	protected void setCP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,6,"C+");
	}
	@FXML
	protected void setC10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,5,"C");
	}
	@FXML
	protected void setCM10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,4,"C-");
	}
	@FXML
	protected void setDP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,3,"D+");
	}
	@FXML
	protected void setD10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,2,"D");
	}
	@FXML
	protected void setDM10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,1,"D-");
	}
	@FXML
	protected void setF10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,0,"F");
	}
	@FXML
	protected void setAP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,12,"A+");
	}
	@FXML
	protected void setA11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,11,"A");
	}
	@FXML
	protected void setAM11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,10,"A-");
	}
	@FXML
	protected void setBP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,9,"B+");
	}
	@FXML
	protected void setB11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,8,"B");
	}
	@FXML
	protected void setBM11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,7,"B-");
	}
	@FXML
	protected void setCP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,6,"C+");
	}
	@FXML
	protected void setC11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,5,"C");
	}
	@FXML
	protected void setCM11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,4,"C-");
	}
	@FXML
	protected void setDP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,3,"D+");
	}
	@FXML
	protected void setD11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,2,"D");
	}
	@FXML
	protected void setDM11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,1,"D-");
	}
	@FXML
	protected void setF11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,0,"F");
	}
	@FXML
	protected void setAP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,12,"A+");
	}
	@FXML
	protected void setA12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,11,"A");
	}
	@FXML
	protected void setAM12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,10,"A-");
	}
	@FXML
	protected void setBP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,9,"B+");
	}
	@FXML
	protected void setB12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,8,"B");
	}
	@FXML
	protected void setBM12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,7,"B-");
	}
	@FXML
	protected void setCP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,6,"C+");
	}
	@FXML
	protected void setC12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,5,"C");
	}
	@FXML
	protected void setCM12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,4,"C-");
	}
	@FXML
	protected void setDP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,3,"D+");
	}
	@FXML
	protected void setD12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,2,"D");
	}
	@FXML
	protected void setDM12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,1,"D-");
	}
	@FXML
	protected void setF12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,0,"F");
	}
	@FXML
	protected void setAP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,12,"A+");
	}
	@FXML
	protected void setA13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,11,"A");
	}
	@FXML
	protected void setAM13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,10,"A-");
	}
	@FXML
	protected void setBP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,9,"B+");
	}
	@FXML
	protected void setB13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,8,"B");
	}
	@FXML
	protected void setBM13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,7,"B-");
	}
	@FXML
	protected void setCP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,6,"C+");
	}
	@FXML
	protected void setC13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,5,"C");
	}
	@FXML
	protected void setCM13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,4,"C-");
	}
	@FXML
	protected void setDP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,3,"D+");
	}
	@FXML
	protected void setD13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,2,"D");
	}
	@FXML
	protected void setDM13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,1,"D-");
	}
	@FXML
	protected void setF13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,0,"F");
	}
	@FXML
	protected void setAP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,12,"A+");
	}
	@FXML
	protected void setA14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,11,"A");
	}
	@FXML
	protected void setAM14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,10,"A-");
	}
	@FXML
	protected void setBP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,9,"B+");
	}
	@FXML
	protected void setB14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,8,"B");
	}
	@FXML
	protected void setBM14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,7,"B-");
	}
	@FXML
	protected void setCP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,6,"C+");
	}
	@FXML
	protected void setC14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,5,"C");
	}
	@FXML
	protected void setCM14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,4,"C-");
	}
	@FXML
	protected void setDP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,3,"D+");
	}
	@FXML
	protected void setD14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,2,"D");
	}
	@FXML
	protected void setDM14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,1,"D-");
	}
	@FXML
	protected void setF14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,0,"F");
	}
	@FXML
	protected void setAP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,12,"A+");
	}
	@FXML
	protected void setA15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,11,"A");
	}
	@FXML
	protected void setAM15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,10,"A-");
	}
	@FXML
	protected void setBP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,9,"B+");
	}
	@FXML
	protected void setB15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,8,"B");
	}
	@FXML
	protected void setBM15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,7,"B-");
	}
	@FXML
	protected void setCP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,6,"C+");
	}
	@FXML
	protected void setC15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,5,"C");
	}
	@FXML
	protected void setCM15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,4,"C-");
	}
	@FXML
	protected void setDP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,3,"D+");
	}
	@FXML
	protected void setD15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,2,"D");
	}
	@FXML
	protected void setDM15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,1,"D-");
	}
	@FXML
	protected void setF15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,0,"F");
	}
	@FXML
	protected void setAP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,12,"A+");
	}
	@FXML
	protected void setA16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,11,"A");
	}
	@FXML
	protected void setAM16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,10,"A-");
	}
	@FXML
	protected void setBP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,9,"B+");
	}
	@FXML
	protected void setB16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,8,"B");
	}
	@FXML
	protected void setBM16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,7,"B-");
	}
	@FXML
	protected void setCP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,6,"C+");
	}
	@FXML
	protected void setC16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,5,"C");
	}
	@FXML
	protected void setCM16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,4,"C-");
	}
	@FXML
	protected void setDP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,3,"D+");
	}
	@FXML
	protected void setD16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,2,"D");
	}
	@FXML
	protected void setDM16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,1,"D-");
	}
	@FXML
	protected void setF16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,0,"F");
	}
	@FXML
	protected void setAP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,12,"A+");
	}
	@FXML
	protected void setA17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,11,"A");
	}
	@FXML
	protected void setAM17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,10,"A-");
	}
	@FXML
	protected void setBP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,9,"B+");
	}
	@FXML
	protected void setB17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,8,"B");
	}
	@FXML
	protected void setBM17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,7,"B-");
	}
	@FXML
	protected void setCP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,6,"C+");
	}
	@FXML
	protected void setC17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,5,"C");
	}
	@FXML
	protected void setCM17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,4,"C-");
	}
	@FXML
	protected void setDP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,3,"D+");
	}
	@FXML
	protected void setD17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,2,"D");
	}
	@FXML
	protected void setDM17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,1,"D-");
	}
	@FXML
	protected void setF17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,0,"F");
	}
	@FXML
	protected void setAP18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,12,"A+");
	}
	@FXML
	protected void setA18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,11,"A");
	}
	@FXML
	protected void setAM18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,10,"A-");
	}
	@FXML
	protected void setBP18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,9,"B+");
	}
	@FXML
	protected void setB18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,8,"B");
	}
	@FXML
	protected void setBM18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,7,"B-");
	}
	@FXML
	protected void setCP18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,6,"C+");
	}
	@FXML
	protected void setC18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,5,"C");
	}
	@FXML
	protected void setCM18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,4,"C-");
	}
	@FXML
	protected void setDP18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,3,"D+");
	}
	@FXML
	protected void setD18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,2,"D");
	}
	@FXML
	protected void setDM18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,1,"D-");
	}
	@FXML
	protected void setF18Grade(ActionEvent event) {
		caller(gradePoint18,grade18,17,0,"F");
	}
	@FXML
	protected void setAP19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,12,"A+");
	}
	@FXML
	protected void setA19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,11,"A");
	}
	@FXML
	protected void setAM19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,10,"A-");
	}
	@FXML
	protected void setBP19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,9,"B+");
	}
	@FXML
	protected void setB19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,8,"B");
	}
	@FXML
	protected void setBM19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,7,"B-");
	}
	@FXML
	protected void setCP19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,6,"C+");
	}
	@FXML
	protected void setC19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,5,"C");
	}
	@FXML
	protected void setCM19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,4,"C-");
	}
	@FXML
	protected void setDP19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,3,"D+");
	}
	@FXML
	protected void setD19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,2,"D");
	}
	@FXML
	protected void setDM19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,18,1,"D-");
	}
	@FXML
	protected void setF19Grade(ActionEvent event) {
		caller(gradePoint19,grade19,19,0,"F");
	}
	@FXML
	protected void setAP20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,12,"A+");
	}
	@FXML
	protected void setA20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,11,"A");
	}
	@FXML
	protected void setAM20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,10,"A-");
	}
	@FXML
	protected void setBP20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,9,"B+");
	}
	@FXML
	protected void setB20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,8,"B");
	}
	@FXML
	protected void setBM20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,7,"B-");
	}
	@FXML
	protected void setCP20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,6,"C+");
	}
	@FXML
	protected void setC20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,5,"C");
	}
	@FXML
	protected void setCM20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,4,"C-");
	}
	@FXML
	protected void setDP20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,3,"D+");
	}
	@FXML
	protected void setD20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,2,"D");
	}
	@FXML
	protected void setDM20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,1,"D-");
	}
	@FXML
	protected void setF20Grade(ActionEvent event) {
		caller(gradePoint20,grade20,19,0,"F");
	}
	@FXML
	protected void setAP21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,12,"A+");
	}
	@FXML
	protected void setA21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,11,"A");
	}
	@FXML
	protected void setAM21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,10,"A-");
	}
	@FXML
	protected void setBP21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,9,"B+");
	}
	@FXML
	protected void setB21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,8,"B");
	}
	@FXML
	protected void setBM21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,7,"B-");
	}
	@FXML
	protected void setCP21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,6,"C+");
	}
	@FXML
	protected void setC21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,5,"C");
	}
	@FXML
	protected void setCM21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,4,"C-");
	}
	@FXML
	protected void setDP21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,3,"D+");
	}
	@FXML
	protected void setD21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,2,"D");
	}
	@FXML
	protected void setDM21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,1,"D-");
	}
	@FXML
	protected void setF21Grade(ActionEvent event) {
		caller(gradePoint21,grade21,20,0,"F");
	}
	@FXML
	protected void setAP22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,12,"A+");
	}
	@FXML
	protected void setA22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,11,"A");
	}
	@FXML
	protected void setAM22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,10,"A-");
	}
	@FXML
	protected void setBP22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,9,"B+");
	}
	@FXML
	protected void setB22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,8,"B");
	}
	@FXML
	protected void setBM22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,7,"B-");
	}
	@FXML
	protected void setCP22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,6,"C+");
	}
	@FXML
	protected void setC22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,5,"C");
	}
	@FXML
	protected void setCM22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,4,"C-");
	}
	@FXML
	protected void setDP22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,3,"D+");
	}
	@FXML
	protected void setD22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,2,"D");
	}
	@FXML
	protected void setDM22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,1,"D-");
	}
	@FXML
	protected void setF22Grade(ActionEvent event) {
		caller(gradePoint22,grade22,21,0,"F");
	}
	@FXML
	protected void setAP23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,12,"A+");
	}
	@FXML
	protected void setA23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,11,"A");
	}
	@FXML
	protected void setAM23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,10,"A-");
	}
	@FXML
	protected void setBP23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,9,"B+");
	}
	@FXML
	protected void setB23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,8,"B");
	}
	@FXML
	protected void setBM23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,7,"B-");
	}
	@FXML
	protected void setCP23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,6,"C+");
	}
	@FXML
	protected void setC23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,5,"C");
	}
	@FXML
	protected void setCM23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,4,"C-");
	}
	@FXML
	protected void setDP23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,3,"D+");
	}
	@FXML
	protected void setD23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,2,"D");
	}
	@FXML
	protected void setDM23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,1,"D-");
	}
	@FXML
	protected void setF23Grade(ActionEvent event) {
		caller(gradePoint23,grade23,22,0,"F");
	}
	@FXML
	protected void setAP24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,12,"A+");
	}
	@FXML
	protected void setA24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,11,"A");
	}
	@FXML
	protected void setAM24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,10,"A-");
	}
	@FXML
	protected void setBP24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,9,"B+");
	}
	@FXML
	protected void setB24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,8,"B");
	}
	@FXML
	protected void setBM24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,7,"B-");
	}
	@FXML
	protected void setCP24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,6,"C+");
	}
	@FXML
	protected void setC24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,5,"C");
	}
	@FXML
	protected void setCM24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,4,"C-");
	}
	@FXML
	protected void setDP24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,3,"D+");
	}
	@FXML
	protected void setD24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,2,"D");
	}
	@FXML
	protected void setDM24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,1,"D-");
	}
	@FXML
	protected void setF24Grade(ActionEvent event) {
		caller(gradePoint24,grade24,23,0,"F");
	}
	@FXML
	protected void setAP25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,12,"A+");
	}
	@FXML
	protected void setA25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,11,"A");
	}
	@FXML
	protected void setAM25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,10,"A-");
	}
	@FXML
	protected void setBP25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,9,"B+");
	}
	@FXML
	protected void setB25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,8,"B");
	}
	@FXML
	protected void setBM25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,7,"B-");
	}
	@FXML
	protected void setCP25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,6,"C+");
	}
	@FXML
	protected void setC25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,5,"C");
	}
	@FXML
	protected void setCM25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,4,"C-");
	}
	@FXML
	protected void setDP25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,3,"D+");
	}
	@FXML
	protected void setD25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,2,"D");
	}
	@FXML
	protected void setDM25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,1,"D-");
	}
	@FXML
	protected void setF25Grade(ActionEvent event) {
		caller(gradePoint25,grade25,24,0,"F");
	}
	@FXML
	protected void setAP26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,12,"A+");
	}
	@FXML
	protected void setA26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,11,"A");
	}
	@FXML
	protected void setAM26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,10,"A-");
	}
	@FXML
	protected void setBP26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,9,"B+");
	}
	@FXML
	protected void setB26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,8,"B");
	}
	@FXML
	protected void setBM26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,7,"B-");
	}
	@FXML
	protected void setCP26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,6,"C+");
	}
	@FXML
	protected void setC26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,5,"C");
	}
	@FXML
	protected void setCM26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,4,"C-");
	}
	@FXML
	protected void setDP26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,3,"D+");
	}
	@FXML
	protected void setD26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,2,"D");
	}
	@FXML
	protected void setDM26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,1,"D-");
	}
	@FXML
	protected void setF26Grade(ActionEvent event) {
		caller(gradePoint26,grade26,25,0,"F");
	}
	@FXML
	protected void setAP27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,12,"A+");
	}
	@FXML
	protected void setA27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,11,"A");
	}
	@FXML
	protected void setAM27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,10,"A-");
	}
	@FXML
	protected void setBP27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,9,"B+");
	}
	@FXML
	protected void setB27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,8,"B");
	}
	@FXML
	protected void setBM27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,7,"B-");
	}
	@FXML
	protected void setCP27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,6,"C+");
	}
	@FXML
	protected void setC27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,5,"C");
	}
	@FXML
	protected void setCM27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,4,"C-");
	}
	@FXML
	protected void setDP27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,3,"D+");
	}
	@FXML
	protected void setD27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,2,"D");
	}
	@FXML
	protected void setDM27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,1,"D-");
	}
	@FXML
	protected void setF27Grade(ActionEvent event) {
		caller(gradePoint27,grade27,26,0,"F");
	}
	@FXML
	protected void setAP28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,12,"A+");
	}
	@FXML
	protected void setA28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,11,"A");
	}
	@FXML
	protected void setAM28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,10,"A-");
	}
	@FXML
	protected void setBP28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,9,"B+");
	}
	@FXML
	protected void setB28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,8,"B");
	}
	@FXML
	protected void setBM28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,7,"B-");
	}
	@FXML
	protected void setCP28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,6,"C+");
	}
	@FXML
	protected void setC28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,5,"C");
	}
	@FXML
	protected void setCM28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,4,"C-");
	}
	@FXML
	protected void setDP28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,3,"D+");
	}
	@FXML
	protected void setD28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,2,"D");
	}
	@FXML
	protected void setDM28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,1,"D-");
	}
	@FXML
	protected void setF28Grade(ActionEvent event) {
		caller(gradePoint28,grade28,27,0,"F");
	}
	@FXML
	protected void setAP29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,12,"A+");
	}
	@FXML
	protected void setA29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,11,"A");
	}
	@FXML
	protected void setAM29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,10,"A-");
	}
	@FXML
	protected void setBP29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,9,"B+");
	}
	@FXML
	protected void setB29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,8,"B");
	}
	@FXML
	protected void setBM29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,7,"B-");
	}
	@FXML
	protected void setCP29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,6,"C+");
	}
	@FXML
	protected void setC29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,5,"C");
	}
	@FXML
	protected void setCM29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,4,"C-");
	}
	@FXML
	protected void setDP29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,3,"D+");
	}
	@FXML
	protected void setD29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,2,"D");
	}
	@FXML
	protected void setDM29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,1,"D-");
	}
	@FXML
	protected void setF29Grade(ActionEvent event) {
		caller(gradePoint29,grade29,28,0,"F");
	}
	@FXML
	protected void setAP30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,12,"A+");
	}
	@FXML
	protected void setA30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,11,"A");
	}
	@FXML
	protected void setAM30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,10,"A-");
	}
	@FXML
	protected void setBP30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,9,"B+");
	}
	@FXML
	protected void setB30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,8,"B");
	}
	@FXML
	protected void setBM30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,7,"B-");
	}
	@FXML
	protected void setCP30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,6,"C+");
	}
	@FXML
	protected void setC30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,5,"C");
	}
	@FXML
	protected void setCM30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,4,"C-");
	}
	@FXML
	protected void setDP30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,3,"D+");
	}
	@FXML
	protected void setD30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,2,"D");
	}
	@FXML
	protected void setDM30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,1,"D-");
	}
	@FXML
	protected void setF30Grade(ActionEvent event) {
		caller(gradePoint30,grade30,29,0,"F");
	}
	@FXML
	protected void setAP31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,12,"A+");
	}
	@FXML
	protected void setA31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,11,"A");
	}
	@FXML
	protected void setAM31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,10,"A-");
	}
	@FXML
	protected void setBP31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,9,"B+");
	}
	@FXML
	protected void setB31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,8,"B");
	}
	@FXML
	protected void setBM31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,7,"B-");
	}
	@FXML
	protected void setCP31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,6,"C+");
	}
	@FXML
	protected void setC31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,5,"C");
	}
	@FXML
	protected void setCM31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,4,"C-");
	}
	@FXML
	protected void setDP31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,3,"D+");
	}
	@FXML
	protected void setD31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,2,"D");
	}
	@FXML
	protected void setDM31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,1,"D-");
	}
	@FXML
	protected void setF31Grade(ActionEvent event) {
		caller(gradePoint31,grade31,30,0,"F");
	}
	@FXML
	protected void setAP32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,12,"A+");
	}
	@FXML
	protected void setA32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,11,"A");
	}
	@FXML
	protected void setAM32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,10,"A-");
	}
	@FXML
	protected void setBP32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,9,"B+");
	}
	@FXML
	protected void setB32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,8,"B");
	}
	@FXML
	protected void setBM32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,7,"B-");
	}
	@FXML
	protected void setCP32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,6,"C+");
	}
	@FXML
	protected void setC32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,5,"C");
	}
	@FXML
	protected void setCM32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,4,"C-");
	}
	@FXML
	protected void setDP32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,3,"D+");
	}
	@FXML
	protected void setD32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,2,"D");
	}
	@FXML
	protected void setDM32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,1,"D-");
	}
	@FXML
	protected void setF32Grade(ActionEvent event) {
		caller(gradePoint32,grade32,31,0,"F");
	}
	@FXML
	protected void setAP33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,12,"A+");
	}
	@FXML
	protected void setA33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,11,"A");
	}
	@FXML
	protected void setAM33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,10,"A-");
	}
	@FXML
	protected void setBP33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,9,"B+");
	}
	@FXML
	protected void setB33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,8,"B");
	}
	@FXML
	protected void setBM33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,7,"B-");
	}
	@FXML
	protected void setCP33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,6,"C+");
	}
	@FXML
	protected void setC33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,5,"C");
	}
	@FXML
	protected void setCM33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,4,"C-");
	}
	@FXML
	protected void setDP33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,3,"D+");
	}
	@FXML
	protected void setD33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,16,2,"D");
	}
	@FXML
	protected void setDM33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,1,"D-");
	}
	@FXML
	protected void setF33Grade(ActionEvent event) {
		caller(gradePoint33,grade33,32,0,"F");
	}
	@FXML
	protected void setAP34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,12,"A+");
	}
	@FXML
	protected void setA34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,11,"A");
	}
	@FXML
	protected void setAM34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,10,"A-");
	}
	@FXML
	protected void setBP34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,9,"B+");
	}
	@FXML
	protected void setB34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,8,"B");
	}
	@FXML
	protected void setBM34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,7,"B-");
	}
	@FXML
	protected void setCP34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,6,"C+");
	}
	@FXML
	protected void setC34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,5,"C");
	}
	@FXML
	protected void setCM34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,4,"C-");
	}
	@FXML
	protected void setDP34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,3,"D+");
	}
	@FXML
	protected void setD34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,2,"D");
	}
	@FXML
	protected void setDM34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,1,"D-");
	}
	@FXML
	protected void setF34Grade(ActionEvent event) {
		caller(gradePoint34,grade34,33,0,"F");
	}
	@FXML
	protected void setAP35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,12,"A+");
	}
	@FXML
	protected void setA35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,11,"A");
	}
	@FXML
	protected void setAM35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,10,"A-");
	}
	@FXML
	protected void setBP35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,9,"B+");
	}
	@FXML
	protected void setB35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,8,"B");
	}
	@FXML
	protected void setBM35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,7,"B-");
	}
	@FXML
	protected void setCP35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,6,"C+");
	}
	@FXML
	protected void setC35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,5,"C");
	}
	@FXML
	protected void setCM35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,4,"C-");
	}
	@FXML
	protected void setDP35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,3,"D+");
	}
	@FXML
	protected void setD35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,2,"D");
	}
	@FXML
	protected void setDM35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,1,"D-");
	}
	@FXML
	protected void setF35Grade(ActionEvent event) {
		caller(gradePoint35,grade35,34,0,"F");
	}
	@FXML
	protected void setAP36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,12,"A+");
	}
	@FXML
	protected void setA36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,11,"A");
	}
	@FXML
	protected void setAM36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,10,"A-");
	}
	@FXML
	protected void setBP36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,9,"B+");
	}
	@FXML
	protected void setB36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,8,"B");
	}
	@FXML
	protected void setBM36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,7,"B-");
	}
	@FXML
	protected void setCP36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,6,"C+");
	}
	@FXML
	protected void setC36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,5,"C");
	}
	@FXML
	protected void setCM36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,4,"C-");
	}
	@FXML
	protected void setDP36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,3,"D+");
	}
	@FXML
	protected void setD36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,2,"D");
	}
	@FXML
	protected void setDM36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,1,"D-");
	}
	@FXML
	protected void setF36Grade(ActionEvent event) {
		caller(gradePoint36,grade36,35,0,"F");
	}
	@FXML
	protected void setAP37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,12,"A+");
	}
	@FXML
	protected void setA37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,11,"A");
	}
	@FXML
	protected void setAM37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,10,"A-");
	}
	@FXML
	protected void setBP37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,9,"B+");
	}
	@FXML
	protected void setB37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,8,"B");
	}
	@FXML
	protected void setBM37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,7,"B-");
	}
	@FXML
	protected void setCP37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,6,"C+");
	}
	@FXML
	protected void setC37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,5,"C");
	}
	@FXML
	protected void setCM37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,4,"C-");
	}
	@FXML
	protected void setDP37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,3,"D+");
	}
	@FXML
	protected void setD37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,2,"D");
	}
	@FXML
	protected void setDM37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,1,"D-");
	}
	@FXML
	protected void setF37Grade(ActionEvent event) {
		caller(gradePoint37,grade37,36,0,"F");
	}
	@FXML
	protected void setAP38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,12,"A+");
	}
	@FXML
	protected void setA38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,11,"A");
	}
	@FXML
	protected void setAM38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,10,"A-");
	}
	@FXML
	protected void setBP38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,9,"B+");
	}
	@FXML
	protected void setB38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,8,"B");
	}
	@FXML
	protected void setBM38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,7,"B-");
	}
	@FXML
	protected void setCP38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,6,"C+");
	}
	@FXML
	protected void setC38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,5,"C");
	}
	@FXML
	protected void setCM38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,4,"C-");
	}
	@FXML
	protected void setDP38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,3,"D+");
	}
	@FXML
	protected void setD38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,2,"D");
	}
	@FXML
	protected void setDM38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,1,"D-");
	}
	@FXML
	protected void setF38Grade(ActionEvent event) {
		caller(gradePoint38,grade38,37,0,"F");
	}
	@FXML
	protected void setAP39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,12,"A+");
	}
	@FXML
	protected void setA39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,11,"A");
	}
	@FXML
	protected void setAM39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,10,"A-");
	}
	@FXML
	protected void setBP39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,9,"B+");
	}
	@FXML
	protected void setB39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,8,"B");
	}
	@FXML
	protected void setBM39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,7,"B-");
	}
	@FXML
	protected void setCP39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,6,"C+");
	}
	@FXML
	protected void setC39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,5,"C");
	}
	@FXML
	protected void setCM39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,4,"C-");
	}
	@FXML
	protected void setDP39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,3,"D+");
	}
	@FXML
	protected void setD39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,2,"D");
	}
	@FXML
	protected void setDM39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,1,"D-");
	}
	@FXML
	protected void setF39Grade(ActionEvent event) {
		caller(gradePoint39,grade39,38,0,"F");
	}
	@FXML
	protected void setAP40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,12,"A+");
	}
	@FXML
	protected void setA40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,11,"A");
	}
	@FXML
	protected void setAM40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,10,"A-");
	}
	@FXML
	protected void setBP40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,9,"B+");
	}
	@FXML
	protected void setB40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,8,"B");
	}
	@FXML
	protected void setBM40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,7,"B-");
	}
	@FXML
	protected void setCP40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,6,"C+");
	}
	@FXML
	protected void setC40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,5,"C");
	}
	@FXML
	protected void setCM40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,4,"C-");
	}
	@FXML
	protected void setDP40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,3,"D+");
	}
	@FXML
	protected void setD40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,2,"D");
	}
	@FXML
	protected void setDM40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,1,"D-");
	}
	@FXML
	protected void setF40Grade(ActionEvent event) {
		caller(gradePoint40,grade40,39,0,"F");
	}
	@FXML
	protected void compute(ActionEvent event) {
		for(int i = 0; i < 40; i ++) {
			totalCreds+= gradePointArray[i];
//			System.out.println("GP: " + gradePointArray[i]);
//			System.out.println(gradeArray[i]);
//			System.out.println(gradePointArray[i] +" * "+ gradeArray[i]);
			GradePoint += gradePointArray[i] * gradeArray[i];
//			System.out.println("GP: "+GradePoint);

		}
		
//		System.out.println(totalCreds);
//		System.out.println("TotalGradePoint: " + GradePoint);
//		System.out.println("Total credits: "+totalCreds);
		if(totalCreds == 0) {
			finalGpa.setText(0.0 + "");
		}
		else {
			finalGpa.setText(df.format((GradePoint*1.0)/totalCreds));
		}
		totalCreds = 0;
		GradePoint = 0;
		
	}
	@FXML
	protected void clearAll(ActionEvent event) {
		for(int i = 0; i < 40; i ++) {
			gradePointArray[i] = 0;
			gradeArray[i] = 0;
		}
		int count = 0;
		for (Node node : mainPane.getChildren()) {
		    if(node.getClass().equals(TextField.class)) {
		    	((TextField)node).setText("");
		    }
		}
		for (Node node : mainPane.getChildren()) {
		    if(node.getClass().equals(SplitMenuButton.class)) {
		    	((SplitMenuButton)node).setText("Grade");
		    }
		}
		
	}
	@FXML
	protected void close(ActionEvent event) {
		application.alertWithOption.display("Error", "Do you want to quit?");
	}
	
	@FXML
	protected void backToMenu(ActionEvent event) {
		application.Main.stage.setScene(application.Main.promptWindow);
		application.Main.stage.setTitle("GPA Calculator");
	}
	

	protected boolean isZero(TextField tf) {
		if (tf.getText().isEmpty()) {
			return true;
		}
		return false;
	}
	
	
	protected boolean isValid(TextField tf) {
		double parser = Double.parseDouble(tf.getText());
//		System.out.println(parser);
		if ( parser == 0.5 || parser == 1 || parser == 0  ) {
			return true;
		}
		return false;
	}
	
	
	protected void caller(TextField tf,SplitMenuButton button, int index, int grade,String letterGrade) {
		try {
			button.setText(letterGrade);
			gradePointArray[index] = 0;
			
			if (isZero(tf)) {
				tf.setText("0");
			}
			if(!isValid(tf)) {
				application.alert.display("Error", "Problem");
				tf.setText("");
				button.setText("Grade");
				return;
			}
//			System.out.println(Double.parseDouble(tf.getText()));
			gradePointArray[index] = Double.parseDouble(tf.getText());
			gradeArray[index] = grade;
		}
		catch(Exception e) {
			application.alert.display("Error", "Problem");
			return;
		}
	}


}
