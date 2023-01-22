package observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {
    public static void main(String[] args) {
        Subject implementSubject = new SubjectImplement();
        List<Observer> observers = new ArrayList<>(3);

        for (int i=1; i<=3; i++) {
            observers.add(new ObserverImplement("observer-" + i));
        }

        for (Observer observer:observers) {
            implementSubject.register(observer);
            observer.setSubject(implementSubject);
        }

        observers.get(0).update();
        implementSubject.postMessage("Message observed");
    }
}
