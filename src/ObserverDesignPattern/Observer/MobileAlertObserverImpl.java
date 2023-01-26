package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

	String userName;
	StockObservable observable;

	public MobileAlertObserverImpl(String userName, StockObservable observable) {
		this.userName = userName;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMessage(userName, "Product is in stock. Hurry up!");
	}

	private void sendMessage(String username, String msg) {
		System.out.println("Msg sent to:" + username);
	}
}
