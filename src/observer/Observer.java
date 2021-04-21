package observer;

public interface Observer {

	void update();
	void setSubscribedTo(Observable subscribedTo);
}
