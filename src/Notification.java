import java.time.LocalDateTime;

public class Notification {
    private static LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "results";

    }



    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public void transport() throws NoTransportException{
    }


    public void showStatus() {
        System.out.println(this.status);

    }

    protected void printText(){
        System.out.println("It worked!!!!!!");
    }
}
