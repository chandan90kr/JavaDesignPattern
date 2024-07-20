package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable stocksObservable;
    public MobileAlertObserverImpl(String emaiId, StocksObservable stocksObservable) {
        this.stocksObservable =stocksObservable;
        this.userName =emaiId;
    }

    @Override
    public void update() {

        sendMessageOnMobile(userName, "product is in stock HurryUp!!!");
    }

    private void sendMessageOnMobile(String userName, String msg) {
        System.out.println("Msg sent to userName"+ userName);
    }
}
