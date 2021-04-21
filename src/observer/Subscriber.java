package observer;

public class Subscriber implements Observer {

	private String city;
	private Observable subscribedTo;
	
	public Subscriber(String city) {
		this.city = city;
	}

	@Override
	public void update() {
		String latestDisaster = this.subscribedTo.getUpdate().split(" in ")[0];
		String latestAffectedCity = this.subscribedTo.getUpdate().split(" in ")[1];
		
		if(latestAffectedCity.equals(city)) {
			System.out.println(city + " is affected by " + latestDisaster + ".");
		}
		else {
			System.out.println(city + " is safe.");
		}
	}

	@Override
	public void setSubscribedTo(Observable subscribedTo) {
		this.subscribedTo = subscribedTo;
	}
}
