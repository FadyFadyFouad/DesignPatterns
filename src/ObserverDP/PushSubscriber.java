package ObserverDP;

public class PushSubscriber implements ISubscriber{
    @Override
    public void notifySub(String notification) {
        System.out.println("Push Notification!\n" + notification + "\n");
    }
}
