import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.nio.file.Paths;
import java.util.Random;

public class absolutejava {
    public static void main(String[] args) {
        // Random object
        Random randomGenerator = new Random();

        int r1 = randomGenerator.nextInt(); // all possible numbers

        // say you want to generate a number that is between 0 en 247
        int r2 = randomGenerator.nextInt(248);

        // This will generate a 4, 5, or 6
        // This will normally generate a 0, 1 or 2
        // But because you added the 4 it will generate
        // Those numbers + 4
        int r = randomGenerator.nextInt(3) + 4;

        // This generates a double between 0 and 1
        double d = randomGenerator.nextDouble();

        // This also generates a double between 0 and 1
        // This is convenient for when you don't want to
        // create a random object
        double mathRandom = Math.random();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r);
        System.out.println(d);
        System.out.println(mathRandom);
    }
}
