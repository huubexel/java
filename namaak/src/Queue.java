public interface Queue {
    void enqueue(Message message);
    Message dequeue();
    int getSize();
}
