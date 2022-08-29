import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.nio.file.Paths;

public class absolutejava {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of ice cream flavors:");
        int numberOfFlavors = keyboard.nextInt( );

        switch (numberOfFlavors) {
            case 32 -> System.out.println("Nice selection.");
            case 2, 3, 4 -> {
                System.out.println(numberOfFlavors + "flavors");
                System.out.println("is acceptable.");
            }
            default -> {
                System.out.println("I didn't plan for");
                System.out.println(numberOfFlavors + " flavors.");
            }
        }
    }
}
