package se.lexicon;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        double amount;
        double rate = 0.05;
        double depositAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you would like to deposit: ");
        depositAmount = scanner.nextDouble();
        System.out.print("Enter number of the year would like to save: ");
        int n = scanner.nextInt();



        for (int year = 1; year <= n; year++) {

            amount = depositAmount * Math.pow(1.0 + rate, year);
            System.out.println("Year " + year + ": " + amount);
        }
        System.out.println();
    }

}