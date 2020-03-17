package model;
import java.util.*;

public class GPAModel {
	public HashMap<String,Integer> grades = new HashMap<>();
	public GPAModel() {
		grades.put("A+", 9);
		grades.put("A", 8);
		grades.put("B+", 7);
		grades.put("B", 6);
		grades.put("C+", 5);
		grades.put("C", 4);
		grades.put("D+", 3);
		grades.put("D", 2);
		grades.put("E", 1);
		grades.put("F", 0);
	}
}
