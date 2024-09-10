package OutputRange;

import java.util.Scanner;

public class OutputRange {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      int firstInt = scnr.nextInt();
      int secondInt = scnr.nextInt();
      
      if (secondInt < firstInt) {
         System.out.println("Second integer can't be less than the first.");
      }
      else {
         System.out.println("First Int: " + firstInt);
         System.out.println("Second Int: " + secondInt);
      
      }
   }
}
