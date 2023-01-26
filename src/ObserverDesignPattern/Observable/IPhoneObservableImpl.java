package ObserverDesignPattern.Observable;

import java.util.*;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IPhoneObservableImpl implements StockObservable {

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		for (NotificationAlertObserver observer : observerList) {
			observer.update();
		}
	}

	public void setStockCount(int newStockAdded) {
		if (stockCount == 0) {
			notifySubscribers();
		}
		stockCount += newStockAdded;
	}

	public int getCount() {
		return stockCount;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}
}
