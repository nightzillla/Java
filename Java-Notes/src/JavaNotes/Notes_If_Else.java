package JavaNotes;
import java.util.Scanner;

public class Notes_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = 4;
        // s.equals("hello"); use this to compare two strings
        // if you have a if, else if , else
        // else has to be the last else if
        if (s.equals("tim")) {
            System.out.println("You type tim");
        } else if (s.equals("Hello")) {
            System.out.println("Hi");
        } else {
            System.out.println("Print");
        }
    }
}
