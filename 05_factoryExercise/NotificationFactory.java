public class NotificationFactory {
    enum MessageEnum{SMS, EMAIL, PUSH}
    public Notification createNotification(MessageEnum channel){
        if(channel == null )
            return null;
        switch (channel){
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel"+channel);

        }
    }
}
