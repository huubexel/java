import java.util.LinkedList;

public class UnorderedMessageQueue implements Queue {

    public final LinkedList<Message> unorderedQueue;

    public UnorderedMessageQueue() {
        unorderedQueue = new LinkedList<>();
    }

    @Override
    public void enqueue(Message message) {
        unorderedQueue.add(message);
    }

    @Override
    public Message dequeue() {
        return unorderedQueue.poll();
    }

    @Override
    public int getSize() {
        return unorderedQueue.size();
    }
}
