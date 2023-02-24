//create an integer variable n and assign it an input value from 1 to 19
//create an if statement that will check if the input is less than 1 or greater than 19 or if it is even
//create a for loop that will print out the first half of the diamond
//set i to 0 and increment it by 1 until it is less than or equal to n / 2 + 1
//create a for loop that will print out the second half of the diamond
//set i to n / 2 - 1 and decrement it by 1 until it is greater than or equal to 0
//create a for loop that will print out the spaces
//set j to 0 and increment it by 1 until it is less than or equal to n / 2 - i


import java.util.Scanner;

public class DiamondVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an odd number in the range 1 to 19: ");
        int n = input.nextInt();
        
        if (n < 1 || n > 19 || n % 2 == 0) {
            System.out.println("Invalid input");
            return;
        }
        
        // Upper half of the diamond
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}