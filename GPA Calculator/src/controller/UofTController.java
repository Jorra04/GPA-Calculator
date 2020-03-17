package controller;


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

public class UofTController {
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

	int totalCreds = 0;

	int GradePoint = 0;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	

	double GPA = 0;
	
	int[] gradePointArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int[] gradeArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

	public void initialize() {
		finalGpa.setEditable(false);
		
	}

	@FXML
	protected void setAP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,9,"A+");
	}
	@FXML
	protected void setA1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,8,"A");
	}
	@FXML
	protected void setBP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,7,"B+");
	}
	@FXML
	protected void setB1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,6,"B");
	}
	@FXML
	protected void setCP1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,5,"C+");
	}
	@FXML
	protected void setC1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,4,"C");
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
	protected void setE1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,1,"E");
	}
	@FXML
	protected void setF1Grade(ActionEvent event) {
		caller(gradePoint1,grade1,0,0,"F");
	}
	@FXML
	protected void setAP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,9,"A+");
	}
	@FXML
	protected void setA2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,8,"A");
	}
	@FXML
	protected void setBP2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,7,"B+");
	}
	@FXML
	protected void setB2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,6,"B");
	}
	@FXML
	protected void setCP2Grade(ActionEvent event) {
		caller(gradePoint1,grade2,1,5,"C+");
	}
	@FXML
	protected void setC2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,4,"C");
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
	protected void setE2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,1,"E");
	}
	@FXML
	protected void setF2Grade(ActionEvent event) {
		caller(gradePoint2,grade2,1,0,"F");
	}
	@FXML
	protected void setAP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,9,"A+");
	}
	@FXML
	protected void setA3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,8,"A");
	}
	@FXML
	protected void setBP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,7,"B+");
	}
	@FXML
	protected void setB3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,6,"B");
	}
	@FXML
	protected void setCP3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,5,"C+");
	}
	@FXML
	protected void setC3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,4,"C");
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
	protected void setE3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,1,"E");
	}
	@FXML
	protected void setF3Grade(ActionEvent event) {
		caller(gradePoint3,grade3,2,0,"F");
	}
	@FXML
	protected void setAP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,9,"A+");
	}
	@FXML
	protected void setA4Grade(ActionEvent event) {
		System.out.println("Here");
		caller(gradePoint4,grade4,3,8,"A");
	}
	@FXML
	protected void setBP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,7,"B+");
	}
	@FXML
	protected void setB4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,6,"B");
	}
	@FXML
	protected void setCP4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,5,"C+");
	}
	@FXML
	protected void setC4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,4,"C");
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
	protected void setE4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,1,"E");
	}
	@FXML
	protected void setF4Grade(ActionEvent event) {
		caller(gradePoint4,grade4,3,0,"F");
	}
	@FXML
	protected void setAP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,9,"A+");
	}
	@FXML
	protected void setA5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,8,"A");
	}
	@FXML
	protected void setBP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,7,"B+");
	}
	@FXML
	protected void setB5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,6,"B");
	}
	@FXML
	protected void setCP5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,5,"C+");
	}
	@FXML
	protected void setC5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,4,"C");
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
	protected void setE5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,1,"E");
	}
	@FXML
	protected void setF5Grade(ActionEvent event) {
		caller(gradePoint5,grade5,4,0,"F");
	}
	@FXML
	protected void setAP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,9,"A+");
	}
	@FXML
	protected void setA6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,8,"A");
	}
	@FXML
	protected void setBP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,7,"B+");
	}
	@FXML
	protected void setB6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,6,"B");
	}
	@FXML
	protected void setCP6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,5,"C+");
	}
	@FXML
	protected void setC6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,4,"C");
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
	protected void setE6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,1,"E");
	}
	@FXML
	protected void setF6Grade(ActionEvent event) {
		caller(gradePoint6,grade6,5,0,"F");
	}
	@FXML
	protected void setAP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,9,"A+");
	}
	@FXML
	protected void setA7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,8,"A");
	}
	@FXML
	protected void setBP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,7,"B+");
	}
	@FXML
	protected void setB7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,6,"B");
	}
	@FXML
	protected void setCP7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,5,"C+");
	}
	@FXML
	protected void setC7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,4,"C");
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
	protected void setE7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,1,"E");
	}
	@FXML
	protected void setF7Grade(ActionEvent event) {
		caller(gradePoint7,grade7,6,0,"F");
	}
	@FXML
	protected void setAP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,9,"A+");
	}
	@FXML
	protected void setA8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,8,"A");
	}
	@FXML
	protected void setBP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,7,"B+");
	}
	@FXML
	protected void setB8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,6,"B");
	}
	@FXML
	protected void setCP8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,5,"C+");
	}
	@FXML
	protected void setC8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,4,"C");
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
	protected void setE8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,1,"E");
	}
	@FXML
	protected void setF8Grade(ActionEvent event) {
		caller(gradePoint8,grade8,7,0,"F");
	}
	@FXML
	protected void setAP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,9,"A+");
	}
	@FXML
	protected void setA9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,8,"A");
	}
	@FXML
	protected void setBP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,7,"B+");
	}
	@FXML
	protected void setB9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,6,"B");
	}
	@FXML
	protected void setCP9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,5,"C+");
	}
	@FXML
	protected void setC9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,4,"C");
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
	protected void setE9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,1,"E");
	}
	@FXML
	protected void setF9Grade(ActionEvent event) {
		caller(gradePoint9,grade9,8,0,"F");
	}
	@FXML
	protected void setAP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,9,"A+");
	}
	@FXML
	protected void setA10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,8,"A");
	}
	@FXML
	protected void setBP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,7,"B+");
	}
	@FXML
	protected void setB10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,6,"B");
	}
	@FXML
	protected void setCP10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,5,"C+");
	}
	@FXML
	protected void setC10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,4,"C");
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
	protected void setE10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,1,"E");
	}
	@FXML
	protected void setF10Grade(ActionEvent event) {
		caller(gradePoint10,grade10,9,0,"F");
	}
	@FXML
	protected void setAP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,9,"A+");
	}
	@FXML
	protected void setA11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,8,"A");
	}
	@FXML
	protected void setBP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,7,"B+");
	}
	@FXML
	protected void setB11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,6,"B");
	}
	@FXML
	protected void setCP11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,5,"C+");
	}
	@FXML
	protected void setC11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,4,"C");
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
	protected void setE11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,1,"E");
	}
	@FXML
	protected void setF11Grade(ActionEvent event) {
		caller(gradePoint11,grade11,10,0,"F");
	}
	@FXML
	protected void setAP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,9,"A+");
	}
	@FXML
	protected void setA12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,8,"A");
	}
	@FXML
	protected void setBP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,7,"B+");
	}
	@FXML
	protected void setB12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,6,"B");
	}
	@FXML
	protected void setCP12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,5,"C+");
	}
	@FXML
	protected void setC12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,4,"C");
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
	protected void setE12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,1,"E");
	}
	@FXML
	protected void setF12Grade(ActionEvent event) {
		caller(gradePoint12,grade12,11,0,"F");
	}
	@FXML
	protected void setAP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,9,"A+");
	}
	@FXML
	protected void setA13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,8,"A");
	}
	@FXML
	protected void setBP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,7,"B+");
	}
	@FXML
	protected void setB13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,6,"B");
	}
	@FXML
	protected void setCP13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,5,"C+");
	}
	@FXML
	protected void setC13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,4,"C");
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
	protected void setE13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,1,"E");
	}
	@FXML
	protected void setF13Grade(ActionEvent event) {
		caller(gradePoint13,grade13,12,0,"F");
	}
	@FXML
	protected void setAP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,9,"A+");
	}
	@FXML
	protected void setA14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,8,"A");
	}
	@FXML
	protected void setBP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,7,"B+");
	}
	@FXML
	protected void setB14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,6,"B");
	}
	@FXML
	protected void setCP14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,5,"C+");
	}
	@FXML
	protected void setC14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,4,"C");
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
	protected void setE14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,1,"E");
	}
	@FXML
	protected void setF14Grade(ActionEvent event) {
		caller(gradePoint14,grade14,13,0,"F");
	}
	@FXML
	protected void setAP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,9,"A+");
	}
	@FXML
	protected void setA15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,8,"A");
	}
	@FXML
	protected void setBP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,7,"B+");
	}
	@FXML
	protected void setB15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,6,"B");
	}
	@FXML
	protected void setCP15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,5,"C+");
	}
	@FXML
	protected void setC15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,4,"C");
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
	protected void setE15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,1,"E");
	}
	@FXML
	protected void setF15Grade(ActionEvent event) {
		caller(gradePoint15,grade15,14,0,"F");
	}
	@FXML
	protected void setAP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,9,"A+");
	}
	@FXML
	protected void setA16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,8,"A");
	}
	@FXML
	protected void setBP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,7,"B+");
	}
	@FXML
	protected void setB16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,6,"B");
	}
	@FXML
	protected void setCP16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,5,"C+");
	}
	@FXML
	protected void setC16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,4,"C");
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
	protected void setE16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,1,"E");
	}
	@FXML
	protected void setF16Grade(ActionEvent event) {
		caller(gradePoint16,grade16,15,0,"F");
	}
	@FXML
	protected void setAP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,9,"A+");
	}
	@FXML
	protected void setA17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,8,"A");
	}
	@FXML
	protected void setBP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,7,"B+");
	}
	@FXML
	protected void setB17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,6,"B");
	}
	@FXML
	protected void setCP17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,5,"C+");
	}
	@FXML
	protected void setC17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,4,"C");
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
	protected void setE17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,1,"E");
	}
	@FXML
	protected void setF17Grade(ActionEvent event) {
		caller(gradePoint17,grade17,16,0,"F");
	}
	@FXML
	protected void compute(ActionEvent event) {
		for(int i = 0; i < 17; i ++) {
			totalCreds+= gradePointArray[i];
			System.out.println(gradePointArray[i]);
			System.out.println(gradeArray[i]);
			GradePoint += gradePointArray[i] * gradeArray[i];
		}
		
//		System.out.println(totalCreds);
		System.out.println("TotalGradePoint: " + GradePoint);
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
		int parser = Integer.parseInt(tf.getText());
		if ( parser <=9 && parser >=0  ) {
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
			gradePointArray[index] = Integer.parseInt(tf.getText());
			gradeArray[index] = grade;
		}
		catch(Exception e) {
			application.alert.display("Error", "Problem");
			return;
		}
	}


}
