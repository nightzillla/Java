package JavaNotes;
import java.util.Scanner;

public class Notes_Conditions_Boolean {

    public static void main(String[] args) {
        String x = "hello"; // strings can only be compare != || ==
        String y = "hellO";
        int z = 10;
        // > greater than,  < less than, == equal to,
        // >= greater than or equal to, <= less than or equal to
        // !== not equal to
//        s.equals("hello"); // use this to compare two strings


        boolean compare = x == y;

        System.out.println(compare);
    }
}
