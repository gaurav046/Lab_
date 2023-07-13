/*Q3)WAP to perform the following operation 
     1:Accept age and check eligible for voting or not
	2:Accept 3 no from the user and find out the greatest
	3:WAP to accept a no from the user and check it is even or odd
*/
import java.util.Scanner;
class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Enter age 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        //check if the person is eligible for voting or not
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 2. Accept three numbers from the user and find the greatest among them.
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int number = num1;
        if (num2 > number) {
            number = num2;
        }
        if (num3 > number) {
            number = num3;
        }
        System.out.println("The greatest number is: " + number);

        // 3. Accept a number from the user and check if it is even or odd.
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        sc.close();
    }
}