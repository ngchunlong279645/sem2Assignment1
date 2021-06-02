
public class VolunteerTeacherOrganisation {
	private String organisationName;
	private String address;
	private String contactNum;
	private String fbLink;
	
	
	public VolunteerTeacherOrganisation(String organisationName) {		//constructor with 1 argument
		this.organisationName=organisationName;
		System.out.println("Welcome to "+ organisationName +" Organization");
		System.out.println("Our organization provides free education and"
				+ " social empowerment programmes to underserved communities"
				+ " all around Malaysia.\n");
		System.out.println("Our organization vision : "+vision());
		System.out.println("Our organization mission : "+mission());
		
	}
	
	public String vision() {
		return "SOLS 24/7 envisions that people from all communities\n\t\t\t"
				+ "  – regardless of race, religion or gender – will have access to education\n\t\t\t"
				+ "  and social empowerment services, resulting in developed societies with equal\n\t\t\t"
				+ "  opportunities for all.\n";
	}
	
	public String mission() {
		return "Our mission is to serve, educate & empower the bottom 40% of the population\n\t\t\t"
				+ "   with FREE education, personal development & employment support.\n";
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setContactNum(String contactNum) {
		this.contactNum=contactNum;
	}
	
	public void setFBLink(String fbLink) {
		this.fbLink=fbLink;
	}
	
	public String getAddress() {
		return address;	
	}
	
	public String getContactNum() {
		return contactNum;		
		}
	
	public String getFBLink() {
		return fbLink;	
	}
	
	public void printInfo() {
		System.out.println("Organisation Name\t: "+organisationName);
		System.out.println("Address\t\t\t: "+address);
		System.out.println("Contact Number\t\t: "+contactNum);
		System.out.println("Facebook Link\t\t: "+fbLink);
	}

}
