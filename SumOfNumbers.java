public class SumOfNumbers {
   public static void main(String[] args) {
     int x = 1, total = 0;
     while (x <= 10) {
       total += x;
       ++x;
     }
     System.out.println("The sum of numbers from 1 to 10 is: " + total);
   }
 }