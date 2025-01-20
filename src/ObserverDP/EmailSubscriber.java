package ObserverDP;

public class EmailSubscriber implements ISubscriber {
    @Override
    public void notifySub(String notification) {
        System.out.println("Email Notification!\n" + notification + "\n");
    }
}
