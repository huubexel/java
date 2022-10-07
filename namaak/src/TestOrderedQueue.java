import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import java.time.LocalDateTime;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class TestOrderedQueue {

    private OrderedMessageQueue queue;

    @BeforeEach
    public void setup(){
        queue = new OrderedMessageQueue();
    }

    @Test
    public void testEnqueueMessageNull(){
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(null));
    }

    @Test
    public void testEnqueueMessageValueNull(){
        assertThrows(IllegalArgumentException.class, () -> queue.enqueue(new Message("header", null)));
    }

    @Test
    public void testEnqueueSameTimestampMessage(){
        class MessageCloner {
            public final Message message;

            public MessageCloner (Message originalMessage) {
                this.message = originalMessage;
            }

            public LocalDateTime getTimestamp() {
                return this.message.timestamp;
            }
        }

        Message message = new Message("header", "body");
        MessageCloner messageClone = new MessageCloner(message);
        assertEquals(message.timestamp, messageClone.getTimestamp());
    }

    @Test
    public void testDequeueEmptyQueue(){
        assertEquals(null, queue.dequeue());
    }

    @Test
    public void testEnqueueDequeue(){
        Message message = new Message("header", "body");
        queue.enqueue(message);
        assertEquals(message, queue.dequeue());
    }

    @Test
    public void testGetSize(){
        Message message = new Message("header", "body");
        int queueSize = queue.getSize();
        queue.enqueue(message);
        queue.enqueue(message);
        queue.enqueue(message);
        queue.dequeue();
        assertEquals((queueSize + 2), queue.getSize());
    }

}