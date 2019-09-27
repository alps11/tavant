package day1;

import java.util.*;

public class SumOfNumbers {

	public int sumOfEvenNumbers(int firstnumber, int secondnumber) {
		int sumofeven=0;
		for(int i=firstnumber;i<=secondnumber;i++) {
				if(i%2==0) {
					sumofeven=sumofeven+i;
				}
		}
		return sumofeven;
	}
	public int sumOfOddNumbers(int firstnumber, int secondnumber) {
		int sumofodd=0;
		for (int i=firstnumber;i<=secondnumber;i++) {
				if(i%2!=0) {
					sumofodd=sumofodd+i;
				}
		
		}
		return sumofodd;
	}
	public static  boolean validatenumber(int number)
	{
		if(number<0)
		{
		 return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		SumOfNumbers sumofnumbers= new SumOfNumbers();
		System.out.println("Enter starting number");
		int firstnumber= scanner.nextInt();
		while(SumOfNumbers.validatenumber(firstnumber)) {
			System.out.println("number is invalid");
			System.out.println("enter first positive number");
			firstnumber= scanner.nextInt();
		}
		System.out.println("enter end number");
		int secondnumber=scanner.nextInt();
		while(SumOfNumbers.validatenumber(secondnumber)) {
			System.out.println("number is invalid");
			System.out.println("enter second positive number");
			secondnumber= scanner.nextInt();
		}
		System.out.println("sum of even numbers="+sumofnumbers.sumOfEvenNumbers(firstnumber,secondnumber));
		System.out.println("sum of odd numbers="+sumofnumbers.sumOfOddNumbers(firstnumber, secondnumber));
		scanner.close();
	}

}
