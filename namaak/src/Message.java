import java.time.LocalDateTime;

public class Message {
    public final String header;
    public final String body;
    public final LocalDateTime timestamp;

    public Message(String header, String body) {
        this.header = header;
        this.body = body;
        timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
