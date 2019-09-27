package day1;

import java.util.*;

public class MarkValidator {

	public boolean isPass(int mark) {
		if(mark>=40)
			return true;
		else 
			return false;
	}
	public String markGrade(int mark) {
		if(isPass(mark)) {
			if(mark>90)
				return "Grade A";
			if(mark>75)
				return "Grade B";
			if(mark>60)
				return "Grade C";
		}
		return "Grade D";
	}
	public boolean validateMarks(int marks) {
		if(marks<0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
	MarkValidator markvalidator= new MarkValidator();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter marks ");
	int marks=scanner.nextInt();
	while(markvalidator.validateMarks(marks)) {
		System.out.println("marks are invalid");
		System.out.println("Enter valid marks");
		marks=scanner.nextInt();
	}
	System.out.println(markvalidator.markGrade(marks));
	scanner.close();

	}

}
