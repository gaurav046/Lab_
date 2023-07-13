//Q4) WAP to accept a no from the user and find out the facorial
import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        // Declear variable
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
        // Taking User Input
		System.out.print("Enter a Number : ");
		num=sc.nextInt();
        // Comparing Variabble with Greater then 1
        for (int i = 1; i <= num; i++) 
        {
            // Factorial Formula 
            fact *=i;
        }
        // Result
		System.out.println("The factorial is  : "+fact);
        sc.close();
	}
}
