package ObserverDP;

public interface IPublisher {

    public void subscribe(ISubscriber subscriber);

    public void unsubscribe(ISubscriber subscriber);

    public void notifySubscribers();
}
