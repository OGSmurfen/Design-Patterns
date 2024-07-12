public class Main {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(NotificationFactory.MessageEnum.SMS);
        notification.setMessage("Message");


        notification.notifyUser();



    }
}
