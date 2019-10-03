/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author thiennd
 */
public class Sample {

    public static int songuyen = 7;

    public static void main(String[] args) {
        int songuyen = 6;
        System.out.println("local: " + songuyen);
        System.out.println("global: " + Sample.songuyen);

        String[] danhSachHoTen = {
            "A", // 4
            "D", // 2
            "C", // 5
            "F", // 3
            "E", // 1
        };
        int[] bangdiem = {4, 2, 5, 3, 1};
        String[] ketQua = lietke(danhSachHoTen, bangdiem);
        for (int i = 0; i < ketQua.length; i++) {
            System.out.println(ketQua[i]);
        }
        int[] arr = {1, 2, 7, 4, 5, 6};
        boolean tangdan = checkTangDan(arr);
        System.out.println(tangdan);
    }

    public static String[] lietke(String[] hoten, int bangdiem[]) {
        String[] result = new String[hoten.length];

        for (int i = 0; i < hoten.length; i++) {
            result[i] = hoten[i] + " duoc " + bangdiem[i];
        }
        System.out.println("global: " + songuyen);
        return result;

    }

    public static int tongMang(int[] mangSoNguyen) {
        return 0;
    }

    public static boolean checkTangDan(int[] arr) {
        // 1 2 7 4 5
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // giam dan  arr[i]<arr[i+1]
                return false;
            }
        }
        // da kiem tra het mang
        return true;

    }

    public static boolean checkChanLe(int X) {
//        if (X % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
           return X%2==0;
    }
}
