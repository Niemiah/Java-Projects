//create an integer variable n and assign it a value of 5
//create a for loop that will print out the first half of the diamond
//set i to 1 and increment it by 1 until it is less than or equal to n
//create a for loop that will print out the second half of the diamond
//set i to n - 1 and decrement it by 1 until it is greater than or equal to 1
//create a for loop that will print out the spaces
// set j to 1 and increment it by 1 until it is less than or equal to n - i

public class Diamond {
    public static void main(String[] args) {
      int n = 5;
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= n - i; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
  //end method main
