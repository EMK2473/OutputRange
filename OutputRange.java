package OutputRange;

import java.util.Scanner;

public class OutputRange {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int firstInt = scnr.nextInt();
      int secondInt = scnr.nextInt();
      int increments;
      
      if (secondInt < firstInt) {
        System.out.println("Second integer can't be less than the first.");
      }

      else {
        while(firstInt <= secondInt){
            increments = firstInt;
            System.out.print(increments + " ");
            firstInt += 5;
        }
         System.out.println();
         scnr.close();
      }
   }
}
