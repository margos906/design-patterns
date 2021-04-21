package observer;

public class ObserverMain {

	public static void main(String[] args) {
		DisasterNotifier disasterNotifier = new DisasterNotifier();
		
		Observer obs1 = new Subscriber("Plovdiv");
		Observer obs2 = new Subscriber("Varna");
		Observer obs3 = new Subscriber("Tarnovo");
		
		disasterNotifier.subscribe(obs1);
		disasterNotifier.subscribe(obs2);
		disasterNotifier.subscribe(obs3);

		disasterNotifier.createNews("Flood", "Varna");
		System.out.println("");
		disasterNotifier.createNews("Fire", "Plovdiv");
		System.out.println("");
		disasterNotifier.createNews("Tornado", "Tarnovo");
	}
}
