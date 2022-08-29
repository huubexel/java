import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class absolutejava {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("./file.java"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
    }
}
