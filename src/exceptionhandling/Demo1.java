package exceptionhandling;
import java.io.FileReader;

public class Demo1 {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
}