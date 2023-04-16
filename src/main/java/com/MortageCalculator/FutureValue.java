package com.MortageCalculator;

import java.util.Scanner;

import static java.lang.Math.pow;

public class FutureValue
      {
          public static void main(String[] args) {

              Scanner myScanner = new Scanner(System.in);

              System.out.println("Total amount of deposits: ");
              int deposits = myScanner.nextInt();


              System.out.println(" Current interest rate ");
              double interestRes = myScanner.nextDouble(); // Interest rate answer
              double InterestRate = interestRes;


              System.out.println("Please input the desired length, in years ; ");
              double numberOfYears = myScanner.nextDouble();

              A = P * (1 + r/n)^(n*t)

              double total = deposits * Math.pow(1 + interestRes / deposits) /
                      Math.pow(numberOfYears * numberOfYears );
          }

}
