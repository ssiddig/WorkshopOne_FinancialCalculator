package com.MortageCalculator;
import java.security.Principal;
import java.util.Scanner;
public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello, I'm Salha and I will be helping you with your Mortgage today!");

        System.out.println("Please input the principal amount: ");
        double principal = myScanner.nextDouble(); // Principal answer



        System.out.println(" Please input the interest rate, monthly ");
         double interestRes = myScanner.nextDouble(); // Interest rate answer


        System.out.println("Please input the desired length of loan, in years ; "); // length of loan
        int termInYears = myScanner.nextInt();

        double monthlyRate , loanAmount, numberOfYears, totalPayment, rate =12;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        double monthlyInterestRate = interestRes / 12;


        double total=  principal * (interestRes * (Math.pow(1 + interestRes, termInYears)) /
                ((Math.pow(1 + interestRes, termInYears )) - 1)
            );


        System.out.println(" monthlyRate " + termInYears);










    }

}
