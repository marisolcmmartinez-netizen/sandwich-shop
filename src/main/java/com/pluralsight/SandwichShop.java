package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter sandwich size(1 = Regular, 2 = Large): ");
        int size = myscanner.nextInt();
        myscanner.nextLine();
        System.out.print("Would you like it loaded? (yes/no): ");
        String loaded = myscanner.nextLine();
        System.out.print("Enter age: ");
        int age = myscanner.nextInt();

        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else {
            basePrice = 8.95;
        }

        double loadedCost;
        if(loaded.equals("yes") && size == 1) {
            loadedCost = 1.00;
        } else if (loaded.equals("yes") && size == 2) {
            loadedCost = 1.75;
        }  else {
            loadedCost = 0;
        }
         double sandwichPrice = basePrice + loadedCost;

        double discount;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            discount = 0;
        }

        double discountAmount = sandwichPrice * discount;
        double totalPrice = sandwichPrice - discountAmount;
        System.out.printf("Your sandwich costs $%.2f%n", totalPrice);

    }
}