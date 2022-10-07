import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public ServerSocket serverSocket;
    public InetSocketAddress inetSocketAddress;
    public boolean tempServerRunning = false;

    public Server() throws IOException {
        new Thread(() -> {
            InetSocketAddress inetSocketAddress;

            try {
                this.serverSocket = new ServerSocket(0);
                this.inetSocketAddress = new InetSocketAddress(serverSocket.getInetAddress(), serverSocket.getLocalPort());
                System.out.println(serverSocket.getInetAddress());
                System.out.println(serverSocket.getLocalPort());
                tempServerRunning = true;
                Socket socket = serverSocket.accept();
                //ClientHandler clientHandler = new ClientHandler(socket, messageHandler);
                //clientHandler.run();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
