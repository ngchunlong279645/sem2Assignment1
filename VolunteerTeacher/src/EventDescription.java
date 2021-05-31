
public class EventDescription {
	private String eventName;
	private String date;
	private String location;	
	private int time;
	private double price;
	
	public void setEventName(String name) {		
		this.eventName=name;
	}

	public void setTime(int time) {
		this.time=time;
	}
	
	public void setDate(String date) {
			this.date=date;
		}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getEventname() {
		return eventName;
	}
	
	public int getTime() {
		return time;
	}
	
	public String getDate() {
			return date;
		}
	
	public String getLocation() {
		return location;
	}
	
	public double getPrice() {
		return price;
	}
	
	

}
