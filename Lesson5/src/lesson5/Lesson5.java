/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String vua nhap" + str); //  sap xep lai theo thu tu ASCII
        char[] arr = str.toCharArray(); // "abcd" => {a,b,c,d}
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // ASCII
                    char midman = arr[i];
                    arr[i] = arr[j];
                    arr[j] = midman;
                }
            }
        }
        String ans = String.valueOf(arr);
        System.out.println("CHUyen doi:" + ans);

        int x = Integer.valueOf("123");
        float f = Float.valueOf("0.45");
        boolean t = Boolean.valueOf("false");
        int c = Character.valueOf('a');
        System.out.println(x);
        System.out.println(f);
        System.out.println(t);
        System.out.println(c);
        String s = "Nguyen Duc Thien"; // 
        int mssv = 20168806;
//        thien.nd168806@sis.hust.edu.vn
        //get THIEN
        int indexOfSpace = s.lastIndexOf(' ');
        String ten = s.substring(indexOfSpace + 1);
        //get N
        String viettatho = String.valueOf(s.charAt(0));
        //GET D
        int indexOfFirstSpace = s.indexOf(' ');
        String viettatdem = String.valueOf(s.charAt(indexOfFirstSpace + 1)); 
        // GET 168806
        String mssvrg = String.valueOf(mssv % 100000);

        String emailsv = ten + "." + viettatho + viettatdem + mssvrg
                + "@sis.hust.edu.vn"; 
        System.out.println(emailsv.toLowerCase());

    }
    
    static boolean validPassword(String pass){
        // 1 CHU HOA
        // 1 chu thuong
        // 1 so 0-9
        // 8 <= do dai <= 32
        // option: !@#$%^&*()   
        
        return true;
                // return false
    }

}
