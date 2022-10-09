package JavaNotes;
import java.util.Scanner;
// Nesting is putting another if statement inside another if statement
public class Notes_Nested_Statements {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.println("Input your fav food:");
            String food = sc.nextLine();

            if (food.equals("pizza")) {
                System.out.println("Mine too!");
            } else {
                System.out.println("Not mine");
            }
            System.out.println("You are an adult");
        } else if (age >= 13){
            System.out.println("You are not a teenager!");
        } else {
            System.out.println("You are not a teenager or an adult");
        }
    }
}
