package observer;

import java.util.ArrayList;
import java.util.List;

public class DisasterNotifier implements Observable {

	private List<Observer> observers;
	private String news;
	private String city;
	
	public DisasterNotifier() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setSubscribedTo(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	/**
	 * Returns <b>news</b> + " in " + <b>city</b>
	 */
	@Override
	public String getUpdate() {
		return news + " in " + city;
	}

	/**
	 * Replaces the current news with new ones, updates city as well
	 * @param news
	 * @param city
	 */
	public void createNews(String news, String city) {
		this.news = news;
		this.city = city;
		notifyObservers();
	}
}
