package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable stocksObservable;
    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {

        this.stocksObservable = stocksObservable;
        this.userName = emailId;

    }

    @Override
    public void update() {

        sendMessageOnEmail(userName,"product is in stock HurryUp!!!");

    }

    private void sendMessageOnEmail(String userName, String msg) {
        System.out.println("Msg sent to userName"+ userName);
    }
}
