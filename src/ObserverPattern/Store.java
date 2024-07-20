package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        //Orchestration for observer pattern by implementation of notification of product
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl("ck@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl("rk@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObserverImpl("mk@gmail.com",iphoneStocksObservable);


        iphoneStocksObservable.add(notificationAlertObserver1);
        iphoneStocksObservable.add(notificationAlertObserver2);
        iphoneStocksObservable.add(notificationAlertObserver3);
        iphoneStocksObservable.setStockCount(10);
    }
}
