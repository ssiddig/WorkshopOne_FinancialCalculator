package com.MortageCalculator;

import java.util.Scanner;
public class MortgageCalculator {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello, I'm Salha and I will be helping you with your Mortgage today!");

        System.out.println("Please input the principal amount: ");
        double principal = myScanner.nextDouble(); // Principal answer


        System.out.println(" Please input the interest rate ");
         double interestRes = myScanner.nextDouble(); // Interest rate answer
        double monthlyInterestRate = interestRes / 12 / 100 ;


        System.out.println("Please input the desired length of loan, in years ; "); // length of loan
        double termInYears = myScanner.nextDouble(); // year to months
        double termInMonths = termInYears * 12;


        double total = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, termInMonths)) /
                (Math.pow(1 + monthlyInterestRate, termInMonths) - 1);



        System.out.println("Your monthly payment is: $" + String.format("%.2f", total));
        System.out.println("Total interest paid: $" + String.format("%.2f", total * termInMonths - principal));









    }

}
