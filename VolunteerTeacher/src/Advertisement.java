
public class Advertisement {
	private String organisation;
	private String event;
	private double discount;
	
	public Advertisement(String event,double discount) {	//constructor with 2 argument
		System.out.println(">>>>>>>>>>>>>>>>>>>>Come and join us<<<<<<<<<<<<<<<<<<<<<<<\n");
		organisation="SOL 24/7";
		this.event=event;
		this.discount=discount;
		
	}
	
	public void printInfo() {
		System.out.println("+============================================================+");
		System.out.println("| We will celebrate "+event+" 	     |");
		System.out.println("| This event is organise by "+organisation+"\t\t\t     |");
		System.out.println("| Each tickets price will be RM 3 per Unit\t\t     |");
		System.out.println("| Above 2 tickets price will be RM 2 per Unit\t\t     |");
		System.out.println("| Above 5 tickets will be RM 1.50 +"+discount+"% discount\t     |");
	}
	
	public void donationLink() {
		System.out.println("| Donation Link : https://www.sols247.org/donate/ 	     |");
	}
	
	public void eventLink() {
		System.out.println("| Event Link : https://www.sols247.org/                      |");
		System.out.println("+============================================================+");
	}
	

}
