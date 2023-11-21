/**
*ChangeCounter.java
*Author: Caroline Kirkconnell
*6/27/2020
*Solution to Programming Project 2.8.
*/
import java.util.Scanner;

public class ChangeCounter
{
//Reads values representing the number of various types of coins and
//computes the total monetary value.
   public static void main(String[] args)
   {
      int quarters, dimes, nickels, pennies;
      int dollars, cents, total;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the number of quarters: ");
      quarters = scan.nextInt();
      System.out.print("Enter the number of dimes: ");
      dimes = scan.nextInt();
      System.out.print("Enter the number of nickels: ");
      nickels = scan.nextInt();
      System.out.print("Enter the number of pennies: ");
      pennies = scan.nextInt();
      
      total = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
      
      dollars = total / 100;
      cents = total % 100;
      
      System.out.println("Total value: " + dollars + " dollars and " +
                       cents + " cents.");
   }
}
