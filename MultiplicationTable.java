//5) WAP to accept a no from the user and display the multiplication table (5*1=5)
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User Input Value
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // For loop for 1 to 10 value multiplication
        for (int i = 1; i <= 10; i++) {
            // Formula of Multiplication
            int result = num * i;
            // Formating for Print Result
            System.out.println(num + " * " + i + " = " + result);
        }
        sc.close();
    }
}

