import java.util.Random;
import java.util.Scanner;

public class Participant {
	private String name;
	private int age;
	private char gender;
	private double price,donation;
	private int quantity;
	Scanner scan = new Scanner (System.in);		//Pre-Define Class	
	Random random = new Random();		//Pre-Define Class	
	
	public Participant(String event) {
		System.out.println("Registration for "+event);
		registration();
		
	}
	
	public void registration() {		// constructor with no argument
		System.out.print("Enter Name      : ");
		this.name=scan.nextLine();
		System.out.print("Enter Age       : ");
		this.age=scan.nextInt();
		System.out.print("Enter Gender    : ");
		this.gender=scan.next().charAt(0);
		scan.nextLine();
		System.out.print("Enter Price     : ");
		this.price=scan.nextDouble();
		System.out.print("Enter Quantity  : ");
		this.quantity=scan.nextInt();	
		System.out.println("Register Successfully");
	}
	
	public void donation() {
		System.out.print("Enter Donation  : ");
		this.donation=scan.nextDouble();	
		System.out.println("Thank You For Your Donation");
	}
	
	public void printInfo() {
		System.out.println("===========================");
		System.out.println("Name \t\t: "+name);
		System.out.println("Age \t\t: "+age);
		System.out.println("Gender \t\t: "+gender);
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

}
