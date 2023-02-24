public class TabularOutput {

   // create a print statement including a tab for each number
   // create a for loop for the number 1 to 5
   // print the number, 10 times the number, 100 times the number, and 1000 times the number
    public static void main(String[] args) {
       System.out.println("N\t10*N\t100*N\t1000*N");
       for (int i = 1; i <= 5; i++) {
          System.out.println(i + "\t" + (i * 10) + "\t" + (i * 100) + "\t" + (i * 1000));
       }
    }
 }