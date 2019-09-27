package day1;

import java.util.*;

public class Temperature {
	 public double convertToFarenheit(double celcius) {
		 double  a= (celcius*1.8)+32;
		 return a;
	 }
	 public double convertToCelcius(Double farenheit) {
		 double b = (farenheit-32)*0.556;
		 return b;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner (System.in);
		System.out.println("Select 1 for celcius to farenheit conversion"+"\n"+"or"+"\n"+"select 2 for farenheit to celcius conversion");
		int choice=scanner.nextInt();
		System.out.println("enter temperature");
		double temp= scanner.nextDouble();  //Value to be converted
		double convertedtemp ;				//converted temperature value 
		Temperature temperature= new Temperature();
		
		switch(choice){
			case 1:{
				convertedtemp= temperature.convertToFarenheit(temp);
				System.out.println("Converted to farenheit value is"+convertedtemp+"f");
				break;
			}
			case 2:{
				convertedtemp= temperature.convertToCelcius(temp);
				System.out.println("Converted to celcius value is"+convertedtemp+"c" );
				break;
			}
			
		}
		
		scanner.close();
	}

}
