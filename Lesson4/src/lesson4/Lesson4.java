/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = 1; // input 
        float[] array = new float[length];
//        float[] array = {2f, 4f, 7f, 6f, 1f, 9f, 8f, 0f, 3f, 7f};

//        for (int i = 0; i < length; i++) {
//            array[i] = sc.nextFloat(); // cin >> array[i];  scanf("%d",array[i]);
//        }
        // in ra toan bo mang
        System.out.println("Truoc khi sap xep: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "; ");
        }

        int soluongpheptinh = 0;// n(n-1)/2
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("Dang so sanh: " + i + " va " + j);
                soluongpheptinh++; // min = n*log2(n)
                if (array[i] > array[j]) {
                    float temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        // in ra toan bo mang
        System.out.println("Sau khi sap xep: " + soluongpheptinh + " phep tinh");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "; ");
        }

        String[] danhSachHoTen = {
            "A", // 4
            "D", // 2
            "C", // 5
            "F", // 3
            "E", // 1
        };
        int[] diem = {4, 2, 5, 3, 1};

        for (int i = 0; i < danhSachHoTen.length - 1; i++) {
            for (int j = i + 1; j < danhSachHoTen.length; j++) {
                if (danhSachHoTen[i].compareTo(danhSachHoTen[j]) > 0) {
                    String t = danhSachHoTen[i];
                    danhSachHoTen[i] = danhSachHoTen[j];
                    danhSachHoTen[j] = t;

                    int t2 = diem[i];
                    diem[i] = diem[j];
                    diem[j] = t2;

                }
            }
        }
        System.out.println("");
        for (int i = 0; i < danhSachHoTen.length; i++) {
            System.out.println(danhSachHoTen[i] + "\t" + diem[i]);
        }

        //end line 
    }
    

}
