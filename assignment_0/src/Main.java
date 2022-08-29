import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("eat")) {
            System.out.println("Animal is eating");
        } else if (input.equals("run")) {
            System.out.println("Animal is running");
        }
    }
}
