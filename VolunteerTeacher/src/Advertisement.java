
public class Advertisement {
	private String organisation;
	private String event;
	private double discount;
	
	public Advertisement(String event,double discount) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>Come and join us<<<<<<<<<<<<<<<<<<<<<<<\n");
		organisation="SOL 24/7";
		this.event=event;
		this.discount=discount;
		
	}
	
	public void printInfo() {
		System.out.println("+============================================================+");
		System.out.println("| We will celebrate "+event+" 	     |");
		System.out.println("| This event is organise by "+organisation+"\t\t\t     |");
		System.out.println("| Above 5 tickets will get "+discount+"% discount\t\t     |");
	}
	
	public void donationLink() {
		System.out.println("| Donation Link : https://www.sols247.org/donate/ 	     |");
	}
	
	public void eventLink() {
		System.out.println("| Event Link : https://www.sols247.org/                      |");
		System.out.println("+============================================================+");
	}
	

}
