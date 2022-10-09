package JavaNotes;
import java.util.Scanner;

public class Notes_Nested_Statements {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 13) {
            System.out.println("You can ride!");
        } else {
            System.out.println("You can not ride!");
        }
    }
}
