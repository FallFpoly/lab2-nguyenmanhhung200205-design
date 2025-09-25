/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDien;
        double tien;

        System.out.print("Nhap so dien su dung: ");
        soDien = sc.nextInt();

        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.printf("So tien dien phai tra: %.0f VND%n", tien);
    }
}
