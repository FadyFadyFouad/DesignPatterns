package ObserverDP;

import DecoratorDP.*;

public class Main {
    public static void main(String[] args) {
        TimePublisher publisher = new TimePublisher();
        publisher.subscribe(new EmailSubscriber());
        publisher.notifySubscribers();
        publisher.subscribe(new PushSubscriber());
        publisher.notifySubscribers();
        publisher.subscribe(new EmailSubscriber());
        publisher.notifySubscribers();
        publisher.subscribe(new WhatsAppSubscriber());
        publisher.notifySubscribers();
        publisher.subscribe(new WhatsAppSubscriber());
        publisher.notifySubscribers();
    }
}