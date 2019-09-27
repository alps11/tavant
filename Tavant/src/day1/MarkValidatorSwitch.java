package day1;
import java.util.*;
public class MarkValidatorSwitch {
	
	public boolean isPass(int mark) {
		if(mark>=40)
			return true;
		else
			return false;
	}
	public String markGrade(int mark) {
		String grade= "Grade D" ;
			switch(mark/10) {
			/*case 10: grade= "Grade A";
					break;*/
			case 9: grade="Grade A";
					if (mark==90)
						grade = "Grade B";
					break;
			case 8: grade="Grade B";
					break;
			case 7: if (mark>75)
						grade="Grade B";
					else 
						grade="Grade C";
					break;
			case 6: grade="Grade C";
					if (mark==60)
						grade= "Grade D";
					break;
				
			}
			return grade;
	}

	public boolean validateMarks(int marks) {
		if (marks <0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		MarkValidatorSwitch markvalidatorswitch=new MarkValidatorSwitch();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter marks");
		int marks=scanner.nextInt();
		while(markvalidatorswitch.validateMarks(marks)){
			System.out.println("marks are invalid");
			System.out.println("enter valid marks");
			marks=scanner.nextInt();
		}
		System.out.println(markvalidatorswitch.markGrade(marks));
		scanner.close();
	}

}
