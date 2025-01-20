package ObserverDP;

public class WhatsAppSubscriber implements ISubscriber{
    @Override
    public void notifySub(String notification) {
        System.out.println("WhatsApp Notification!\n" + notification + "\n");
    }
}
