package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String employeeName = getEmployeeName();
        double hoursWorked = getHoursWorked();
        double hourlyRate = getHourlyRate();

        double grossPay = calculateGrossPay(hoursWorked, hourlyRate);

        displayResults(employeeName, grossPay);

        scanner.close();
    }

    public static String getEmployeeName() {
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
    }

    public static double getHoursWorked() {
        System.out.print("Enter hours worked: ");
        return scanner.nextDouble();
    }

    public static double getHourlyRate() {
        System.out.print("Enter hourly pay rate: ");
        return scanner.nextDouble();
    }

    public static double calculateGrossPay(double hours, double rate) {
        return hours * rate;
    }

    public static void displayResults(String name, double pay) {
        System.out.printf("Employee: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", pay);
    }
}