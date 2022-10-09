package JavaNotes;
// Java is an Object oriented programming language
// meaning everything inside of something called classes, and
// everything is known as objects

// int means integer any # that is not a decimal and will give you only whole numbers
// double means floating decimal point and will give you decimal in equations
// boolean true or false
// char represent any character or letter that's in = '' and CAN BE ONLY 1 letter
// String has to be in double quotation marks = " "
// _ represent a space
// variables holds value
public class JavaNotes_Data_Types {

    public static void main(String[] args) {      //  This is called a method
        // TOD Auto-generated method stub
        System.out.println("Hello World!");       // println means print line
        // Primitive DATA TYPE // not changeable
        int hello_world = 9;                      // This is a variable
        double num2 = 5.0;
        boolean b = true;
        char C = 'h';
        // NOT primitive
        String str = "tim";

        int tim = hello_world;

        System.out.println();          // this prints out 5

        int a;
        a = 6; // have to initialized it first
        // PEMDAS: Parentheses, Exponents, Multiplication, and Division (from left to right),
        // Addition and Subtraction (from left to right).
        int x = 5;
        double y = 7;
        int z = 57;
//        double u = x * y;
//        double d = Math.pow(x,y); // exponents needs to be in double
        double u = x / (double)y;
        System.out.println(u);

        // typecasting changing inline, without changing the declaration

    }
}
