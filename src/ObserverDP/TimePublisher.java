package ObserverDP;

import java.util.ArrayList;

public class TimePublisher implements IPublisher{
    private ArrayList<ISubscriber> subscribers = new ArrayList<ISubscriber>();
    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber s : subscribers){
            String formattedDateTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            s.notifySub(formattedDateTime);
        }
    }
}
