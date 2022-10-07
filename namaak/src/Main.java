
public class Main {

    private final Map<Integer, PlayerAction> actions;
    public static void main(String[] args){
        Message message = new Message("header", "body");
        MessageCloner messageClone = new MessageCloner(message);

        if (message.getTimestamp().equals(messageClone.getTimestamp())) {
            System.out.println("Timestamp is the same.");
        }
    }
}
