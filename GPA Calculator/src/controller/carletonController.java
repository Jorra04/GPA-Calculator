package controller;
import model.GPAModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.text.DecimalFormat;
import java.util.*;

public class carletonController {
	@FXML
	private AnchorPane mainPane;
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
	private SplitMenuButton grade6;

	@FXML
	private SplitMenuButton grade8;

	@FXML
	private SplitMenuButton grade5;

	@FXML
	private SplitMenuButton grade7;

	@FXML
	private SplitMenuButton grade3;

	@FXML
	private SplitMenuButton grade4;

	@FXML
	private SplitMenuButton grade9;

	@FXML
	private SplitMenuButton grade13;

	@FXML
	private SplitMenuButton grade15;

	@FXML
	private SplitMenuButton grade12;

	@FXML
	private SplitMenuButton grade14;

	@FXML
	private SplitMenuButton grade10;

	@FXML
	private SplitMenuButton grade11;

	@FXML
	private SplitMenuButton grade17;

	@FXML
	private SplitMenuButton grade16;

	@FXML
	private TextField finalGpa;

	@FXML
	private Button compute;

	double totalCreds = 0;

	double GradePoint = 0;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	

	double GPA = 0;
	GPAModel model1 = new GPAModel();
	double[] gradePointArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int[] gradeArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

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
	protected void compute(ActionEvent event) {
		for(int i = 0; i < 17; i ++) {
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
		for(int i = 0; i < 17; i ++) {
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
