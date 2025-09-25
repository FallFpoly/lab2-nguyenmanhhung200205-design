/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    
    static Scanner sc=new Scanner(System.in);
        // bai 1 giai pt  bac 1
    static void giaiPTB1() {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Phuong trinh vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.printf("Nghiem x = %.2f%n", -b / a);
        }
    }

    // bai giai pt bac 2
    static void giaiPTB2() {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) { 
            if (b == 0)
                System.out.println(c == 0 ? "Vo so nghiem" : "Vo nghiem");
            else
                System.out.printf("Nghiem x = %.2f%n", -c / b);
            return;
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Vo nghiem");
        } else if (delta == 0) {
            System.out.printf("Nghiem kep x = %.2f%n", -b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Hai nghiem x1 = %.2f, x2 = %.2f%n", x1, x2);
        }
    }

    // bai tinh tien dien
    static void tinhTienDien() {
        System.out.print("Nhap so dien su dung: ");
        int soDien = sc.nextInt();
        double tien;
        if (soDien <= 50)
            tien = soDien * 1000;
        else
            tien = 50 * 1000 + (soDien - 50) * 1200;
        System.out.printf("Tien dien: %.0f VND%n", tien);
    }

    // menu
    static void menu() {
        int chon;
        do {
            System.out.println("+-------------------------------+");
            System.out.println("1. Giai phuong trinh bac 1");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+-------------------------------+");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> giaiPTB1();
                case 2 -> giaiPTB2();
                case 3 -> tinhTienDien();
                case 4 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le moi chon lai!");
            }
        } while (chon != 4);
    }

    public static void main(String[] args) {
        menu();
        
    }
    
}
