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
public class Lesson4Function {

    // int main(char[] *args)
    public static void main(String[] args) {
        int a1, a2;
        a1 = 3;
        a2 = 7;
        int sumA = tinhTong(a1, a2);
        int b1, b2;
        b1 = 9;
        b2 = -7;
        int sumB = tinhTong(9, -7);
        System.out.println("SumA: "  +sumA + " SumB: " + sumB);
        String hoten= "Thien";
        int namsinh = 98;
        String s = inRaHTNS(hoten, namsinh);
        System.out.println(s);
        
    }

    //Function 
    static String inRaHTNS(String hoten, int namsinh) {
//        System.out.println(hoten+namsinh);
//        String returnValue = "Ho va ten: " + hoten + " Nam sinh: " + namsinh;
        return "Ho va ten: " + hoten + " Nam sinh: " + namsinh;
    }


    static int tinhTong(int a, int b) {
        int tong = a + b;
        return tong;
    }

    static String tenTruong() {
        String tenTruong = "DHBKHN";
        return tenTruong;
    }

    static void inRaSoNguyen(int x) {
        System.out.println(x);
    }

    static void thoatChuongTrinh() {
        System.exit(0);
    }

}
