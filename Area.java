//Q1)WAP to accept R from the user and calculate AC & CC
import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Assigning (pi) Value which is 3.14
        double pi = 3.14;
        // Accept the user value
        System.out.print("Enter the radius of the circle: ");
        // Holding the Radius Value from the user keyboard
        double radius = sc.nextDouble();
        
        // Calculate the area of the circle
        double area = pi * radius * radius;
        
        // Calculate the circumference of the circle
        double circumference = 2 * pi * radius;
        //Show the value of Area of Circle
        System.out.println("Area of the circle: " + area);
        //Show the value of Circumference of the circle 
        System.out.println("Circumference of the circle: " + circumference);
        sc.close();
    }
}
