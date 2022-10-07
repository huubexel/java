import java.time.LocalDateTime;
import java.util.TreeMap;

public class OrderedMessageQueue implements Queue {

    public final TreeMap<LocalDateTime, Message> orderedQueue;

    public OrderedMessageQueue(){
        orderedQueue = new TreeMap<>();
    }

    @Override
    public void enqueue(Message message) {
        orderedQueue.put(message.timestamp, message);
    }

    @Override
    public Message dequeue() {
        return orderedQueue.pollFirstEntry().getValue();
    }

    @Override
    public int getSize() {
        return orderedQueue.size();
    }
}
