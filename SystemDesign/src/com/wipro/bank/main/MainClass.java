package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.service.BankService;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        System.out.print("Enter Amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Tenure (5 or 10 years): ");
        int tenure = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender: ");
        String gender = sc.next();

        service.calculate(principal, tenure, age, gender);

        sc.close();
    }
}