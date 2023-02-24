// create a variable called counter to hold the number 1
// create a variable called largest to hold the number 0
//create a variable for the number
//set Largest to the number, if the number is great than largest
// create a while loop for the counter as long as it is less than 10
// if number is greater than largest, set largest to number

import java.util.Scanner;

public class FindLargestNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int counter = 1;
      int largest = 0;
      int number;

      System.out.print("Enter an integer: ");
      number = input.nextInt();
      largest = number;

      while (counter < 10) {
         System.out.print("Enter an integer: ");
         number = input.nextInt();
         if (number > largest) {
            largest = number;
         }
         counter++;
      }
      System.out.printf("The largest number is: %d%n", largest);
   }
}