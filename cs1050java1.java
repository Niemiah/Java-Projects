//step 1. print out first and second integer
//step 2. compare the two integers
//step 3. print out the larger integer

import java.util.Scanner;

public class cs1050java1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
    
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
    
        if (num1 > num2) {
          System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
          System.out.println(num2 + " is larger");
        } else {
          System.out.println("These numbers are equal");
        }
    
        input.close();
      }
    }
