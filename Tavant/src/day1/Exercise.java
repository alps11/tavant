package day1;

public class Exercise {

	public static void main(String[] args) {
		Patient patient1= new Patient();
		patient1.setName("Ramesh yadav");
		patient1.setAge(25);
		patient1.setGender('M');
		
		System.out.println("patients name:"+patient1.getName()+"\npatieints age:"+patient1.getAge()+"\npatieints gender:"+patient1.getGender());
		
		Patient patient2= new Patient();
		patient2.setName("Jay joshi");
		patient2.setAge(18);
		patient2.setGender('M');
		
		System.out.println("patients name:"+patient2.getName()+"\npatieints age:"+patient2.getAge()+"\npatieints gender:"+patient2.getGender());
		
		Laptop laptop1= new Laptop();
		laptop1.setcompname("HP");
		laptop1.setRAM(4);
		laptop1.setprocessor("i5");
		
		System.out.println("Laptop company:"+laptop1.getcompname()+"\nRAM size:"+laptop1.getRAM()+"\nprocessor:"+laptop1.getprocessor());
		
		Laptop laptop2= new Laptop();
		laptop2.setcompname("Dell");
		laptop2.setRAM(8);
		laptop2.setprocessor("i3");
		
		System.out.println("Laptop company:"+laptop2.getcompname()+"\nRAM size:"+laptop2.getRAM()+"\nprocessor:"+laptop2.getprocessor());
		
		Watch watch1= new Watch();
		watch1.setname("Casio");
		watch1.setprice(5000);
		watch1.setwarranty(5);
		
		System.out.println("watch company"+watch1.getname()+"\nprice:"+watch1.getprice()+"\nwarranty(in yrs):"+watch1.getwarrenty());
		
		Watch watch2 = new Watch();
		watch2.setname("DW");
		watch2.setprice(10000);
		watch2.setwarranty(3);
		
		System.out.println("watch company"+watch2.getname()+"\nprice:"+watch2.getprice()+"\nwarranty(in yrs):"+watch2.getwarrenty());
	}

}
class Patient{
	private String name;
	private int age;
	private char gender;
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;	
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}
class Laptop {
	private String compname;
	private int RAM;
	private String processor;
	
	public void setcompname(String compname) {
		this.compname=compname;
	}
	public String getcompname() {
		return compname;
	}
	public void setRAM(int RAM) {
		this.RAM=RAM;
	}
	public int getRAM() {
		return RAM;
	}
	public void setprocessor(String processor) {
		this.processor=processor;
	}
	public String getprocessor() {
		return processor;
	}
}
class Watch{
	private String name;
	private int price;
	private int warranty;
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setwarranty(int warrenty) {
		this.warranty=warrenty;
	}
	public int getwarrenty() {
		return warranty;
	}
}