import java.time.LocalDateTime;

public class MessageCloner {

    public final Message message;

    public MessageCloner(Message originalMessage) {
        this.message = originalMessage;
    }

    public LocalDateTime getTimestamp() {
        return this.message.getTimestamp();
    }
}
