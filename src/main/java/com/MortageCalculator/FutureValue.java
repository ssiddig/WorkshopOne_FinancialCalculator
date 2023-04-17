package com.MortageCalculator;

import java.util.Scanner;

import static java.lang.Math.pow;

public class FutureValue {



          public static void main(String[] args) {

              Scanner myScanner = new Scanner(System.in);

              System.out.println("Total amount of deposits: ");
              int deposits = myScanner.nextInt();


              System.out.println(" Current interest rate ");
              double interestRes = myScanner.nextDouble(); // Interest rate answer


              System.out.println("Please input the desired length, in years ; ");
              double time = myScanner.nextDouble();

              int number = myScanner.nextInt();


              double total = deposits * Math.pow( 1+(interestRes/number), number *time);

              System.out.println(" Your ending balance is: $" + String.format("%2f" , total));
              System.out.println (" You would have earned a total interest of: $" + String.format("%2f" , total));
          }

}
