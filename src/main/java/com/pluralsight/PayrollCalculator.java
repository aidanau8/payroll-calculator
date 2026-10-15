package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossPay = hoursWorked * hourlyRate;

        System.out.printf("Employee: %s%n", employeeName);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        scanner.close();



    }
}
