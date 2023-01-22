package observer;

public class ObserverImplement implements Observer{

    String observerName;
    Subject subjectRegistered;

    public ObserverImplement(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        String newMessage = (String) subjectRegistered.getUpdate();

        if(newMessage != null) {
            System.out.println(observerName + " New message: " + newMessage);
        }
    }

    @Override
    public void update(String newMessage) {
        if(newMessage != null) {
            System.out.println(observerName + " New message: " + newMessage);
        }else {
            System.out.println(observerName + " No messages received ");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        subjectRegistered = subject;
    }
}
