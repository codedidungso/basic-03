/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int a = 7;

        while (true) // a = 4 tro len
        {
            System.out.println("Gia tri cua a: " + a);
            a = a + 1;
            break;
        }
        // Format code (Windows) = Alt Shift F 
        // Format code (MacOS)   = Ctrl Shift F 

        for (int i = 0; i < 5; i++) {
            System.out.println("Ben ngoai: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("     Ben trong: " + i + " : " + j);
                if (i == 3 && j == 1) {
                    break;
                }
            }
        }

//        Math Lib Math.
        System.out.println("-----INPUT METHOD-----");
        Scanner sc = new Scanner(System.in);

        int K;
        K = sc.nextInt(); // cin >> K; // scanf("%d",&K);
        System.out.println("Gia tri K vua nhap: " + K);

        // Kiem tra tinh chia het cho 5 cua K 
        if (K % 5 == 0)// Modulo
        {
            System.out.println("K chia het cho 5. Ket qua: " + (K / 5));
        } else {
            int phandu = K % 5;
            System.out.println("K khong chia het cho 5, phan du la: " + phandu);
        }
        // Nhap vao k , in ra moi so chia het cho 2 va nho hon K
        for (int i = 0; i < K; i++) {
            if (i % 2 == 0) {
                System.out.println("So chia het cho 2: " + i);
            }
        }
        for (int i = 0; i < K; i = i + 2) {
            System.out.println("Gia tri cua i: " + i);
        }
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                System.out.println("gia tri cua i: " + i);
            }

            i = i + 1;
            if (i < K) {
                continue;

            } else {
                break;
            }

        }
        System.out.println("Danh sach cac uoc cua K: ");
        int count = 0;
        for (int j = 1; j <= K; j++) {
           if(K%j==0){
               System.out.println(j +"; ");
               count++;
           }
        }
        System.out.println("So luong uoc: " + count);
        
        
        
        final int HANG_SO_TRONG_TRUONG = 10; // constant 
        
        int soThuNhat = 1; // variable + function 
        int soThuHai = 2;
        
        
        
        
        
        
        
        
    //end point 
    }

}
