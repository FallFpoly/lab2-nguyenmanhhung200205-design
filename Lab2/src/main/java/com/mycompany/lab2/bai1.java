/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.print("Nhap a: ");
        a =sc.nextDouble();
        System.out.print("Nhap b: ");
        b =sc.nextDouble();
        if(a!=0){
            double x=-b/a;
            System.out.printf("Phuong trinh co nghiem x = %.2f ",x);
        }else if (b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
