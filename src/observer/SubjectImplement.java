package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImplement implements Subject{

    private List<Observer> observerList = null;
    private String message;

    public SubjectImplement() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer == null) {
            throw new NullPointerException();
        }
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if(observer == null) {
            throw new NullPointerException();
        }
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(observerList != null && !observerList.isEmpty()) {
            for(Observer observer:observerList) {
                observer.update(message);
            }
        } else {
            System.out.println("No observers to notify");
        }
    }

    @Override
    public Object getUpdate() {
        return message;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Message posted for Subject: " + message);
        this.message = message;
        notifyObservers();
    }
}
