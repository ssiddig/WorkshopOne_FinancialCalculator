package com.MortageCalculator;
import java.security.Principal;
import java.util.Scanner;
public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello, I'm Salha and I will be helping you with your Mortgage today!");

        System.out.println("Please input the principal amount: ");
        double principales = myScanner.nextFloat(); // Principal answer


        System.out.println(" Please input the interest rate, monthly ");
         double interestRes = myScanner.nextFloat(); // Interest rate answer


        System.out.println("Please input the desired length of loan, in months; "); // length of loan
        double lengthRes = myScanner.nextFloat();

        double monthlyPayment, loanAmount, monthlyRate, numberOfYears, totalPayment, rate =0;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);



        double principal = principales;
        double interest = interestRes;
        double length =  lengthRes;

        monthlyRate = rate/12;

        double total=  (principales * Math.pow(1 + (interestRes), (1 * interestRes)));
        System.out.println(total);

        double mortgage= (principales * interestRes * Math.pow(1 + (interestRes), (1 - interestRes)));
        System.out.println(mortgage);










    }

}
