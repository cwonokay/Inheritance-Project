public class Main {
    public static void main(String[] arg){

    EmailNotification email = new EmailNotification("New Job", "Please apply", "Yolo", "Corn");
    TextNotification text = new TextNotification("Review", "Please review all info", "Jenni", "Corn");

        email.transport();
        text.transport();
        email.printText();
        text.printText();
        Object emailNotificationClone = email.clone();
        


        }
}
