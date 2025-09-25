/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();

        if (a == 0) {
            // phuong trinh bac 1
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.printf("Phuong trinh bac nhat co nghiem x = %.2f%n", x);
            }
        } else {
            // phuong trinh bac 2
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep x = %.2f%n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet:%n");
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
            }
        }
    }
}
