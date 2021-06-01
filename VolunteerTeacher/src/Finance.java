
public class Finance {
	private String month;
	private double price;
	private int quantity;
	private double totalDonation,totalExpenses;
	private double bill,eventExpenses,rentalFee,otherExpenses;
	
	public Finance(String month){	//constructor with 1 argument
		this.month=month;
	}
	
	
	public Finance(double price, int quantity) {	//constructor with 2 argument
		this.price=price;
		this.quantity=quantity;
		if(quantity<=2) {
			double totalPrice=price*quantity;
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+price);
			System.out.println("Total Price\t: RM "+totalPrice);
		}
		else if(quantity>2&&quantity<=4) {
			double newPrice=2.00;
			double totalPrice=newPrice*quantity;
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newPrice);
			System.out.println("Total Price\t: RM "+totalPrice);
		}
		else {
			double newPrice=1.50;
			double discount=0.10;
			double totalPrice=(newPrice*quantity)*(1-discount);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newPrice);
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price\t: RM "+totalPrice);
		}	
	
	}
	
	public Finance (double bill, double eventExpenses, double rentalFee, double otherExpenses) {	//constructor with 4 argument	
		this.bill=bill;
		this.eventExpenses=eventExpenses;
		this.rentalFee=rentalFee;
		this.otherExpenses=otherExpenses;
	}
	
	public double calTotalExpenses() {
		totalExpenses=bill+eventExpenses+rentalFee+otherExpenses;
		return totalExpenses;
	}
	
	public double calBalance(double total,double expenses) {
		return total-expenses;
	}
	
	public void setTotalDonation(double totalDonation) {
		this.totalDonation=totalDonation;
	}

	public String getMonth() {
		return month;
	}
	
	public double getTotalDonation() {
		return totalDonation;
	}
}
