package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        Float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a: ");
        a = inputUser.nextFloat();
        System.out.print("operator(+, -, *, /): ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b: ");
        b = inputUser.nextFloat();

        if(operator == '+') {
            hasil = a + b;
            System.out.println("hasil: " + hasil);
        } else if(operator == '-') {
            hasil = a - b;
            System.out.println("hasil: " + hasil);
        } else if(operator == '*') {
            hasil = a * b;
            System.out.println("hasil: " + hasil);
        } else if(operator == '/') {
            hasil = a / b;
            if(b == 0) {
                System.out.println("Nilai tidak terjangkau");
            } else {
                System.out.println("hasil: " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }
    }
}