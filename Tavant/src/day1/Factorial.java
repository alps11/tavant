package day1;

import java.util.*;

public class Factorial {
	 
	public int calculateFactorial(int number) {
		int value=1;
		for (int i=number;i>0;i--) {
			value=value*i;
		}
		return value;
	}
	
	 public  boolean validateNumber(int number)
	 	{
	 		if(number<0)
	 		{
	 		 return true;
	 		}
	 		return false;
	 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial= new Factorial();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter valid positive number");
		int number= scanner.nextInt();
		while(factorial.validateNumber(number)) {
			System.out.println("number is invalid");
			System.out.println("Enter valid positive number");
			number = scanner.nextInt();
		}
		System.out.println("Factorial of given number is "+factorial.calculateFactorial(number));
		scanner.close();
	}

}
