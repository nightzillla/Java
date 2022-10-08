package JavaNotes;
import java.util.Scanner;


public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // sc is a data type
        String scanned = sc.next();              // this prints-outs strings
//        int scanned = sc.nextInt();           // this print-outs integer
//        boolean scanned = sc.nextBoolean();  // this prints-outs true or false ONLY
//        double scanned = sc.nextDouble();   // this prints-out 2 digits 5.60
        int x = Integer.parseInt(scanned);
        System.out.println(x);
    }
}
