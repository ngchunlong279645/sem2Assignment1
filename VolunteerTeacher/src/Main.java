import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		int choose;
		
		VolunteerTeacherOrganisation organisation = new VolunteerTeacherOrganisation("SOL_24_7");
		organisation.setAddress("NO,17 TAMAN BAHAGIA BUKIT AMAN");
		organisation.setContactNum("0332917865");
		organisation.setFBLink("https://www.facebook.com/SOLS247/");
		organisation.printInfo();	
		System.out.println("");
		
		System.out.println("Select Option : 1-Participant\n\t\t"
											+ "2-Admin \n\t\t");
	
		do {
			System.out.print("Enter option    : ");
			int option = scan.nextInt();
			
			if(option==1) {
				Advertisement latestNews = new Advertisement("World Book and Copyright Day",10);
				latestNews.printInfo();
				latestNews.donationLink();
				latestNews.eventLink();
				System.out.println("");
					
				EventDescription event1 = new EventDescription();
				event1.setEventName("World Book and Copyright Day");
				event1.setDate("27-6-2021");
				event1.setTime(3);
				event1.setLocation("Setia City Mall");
				event1.setPrice(3);
				System.out.println("Event \t\t: "+event1.getEventname());
				System.out.println("Date \t\t: "+event1.getDate());
				System.out.println("Time \t\t: "+event1.getTime()+"PM");
				System.out.println("Location \t: "+event1.getLocation());
				System.out.println("Entrance Fee \t: "+event1.getPrice()+"\n");
				
				Participant ppl = new Participant("World Book and Copyright Day");
				ppl.printInfo();
				double price=ppl.getPrice();
				int quantity=ppl.getQuantity();
				Finance countTotalPrice = new Finance(price,quantity);
				System.out.println("");
				System.out.println("Do you want to donate ?? 1-yes 2-no");
				int selection=scan.nextInt();
				if(selection==1) {
					ppl.donation();
				}
				else {
					System.out.println("Thank you");
				}
			}
			else {
				Finance report = new Finance ("June");
				Finance expenses = new Finance(245,345,1420,590);
				report.setTotalDonation(27968.90);
				System.out.println(">>>>>>>>Financial Report In "+report.getMonth()+"<<<<<<<<<<<<<<<<\n");
				System.out.println("Total Donation in "+report.getMonth()+" : RM "+report.getTotalDonation());	
				System.out.println("Total Expenses in "+report.getMonth()+" : RM "+expenses.calTotalExpenses());
				double totalDonation=report.getTotalDonation();
				double totalExpenses=expenses.calTotalExpenses();
				System.out.println("Balance in "+report.getMonth()+"\t       : RM "+report.calBalance(totalDonation, totalExpenses));
			}
			System.out.println("");
			System.out.println("DO YOU WANT TO CONTINUE ? 1-YES 2-NO");
			choose=scan.nextInt();
			}while(choose==1);
	}
				
}

	
