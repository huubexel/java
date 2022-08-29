import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.nio.file.Paths;

public class absolutejava {
    public static void main(String[] args) {
        int max = 0;
        int n1 = 3;
        int n2 = 1;

        if (n1 > n2)
            max = n1;
        else
            max = n2;

        max = (n1 > n2) ? n1 : n2;
    }
}
