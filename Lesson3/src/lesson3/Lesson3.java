/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author thiennd
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        char[] charArray = new char[50];
        int[][] matrix = new int[3][3];
        String[] sArray = new String[10];
        
        int[] mangA = {1, 22, 36, 42, 51, 22, 65, 33, 67};
        int k = -1;
        boolean timThay = false;
        int dem = 0;
        for (int i = 0; i < mangA.length; i++) {
            if (mangA[i] == k) {
                System.out.println("Tim thay tai: " + i);
                dem = dem + 1;
                timThay = true; // flag
            }
        }
        if (dem == 0) {
            System.out.println("Khong tim thay");
        }
        // int k = -1;
        // index        0 1  2  3  4
        // mangA[0] = 1;
        // mangA[1] = 22;
        // mangA[2] = 36;
        // ..
        // mangA[4] = 51;

        String[] name = {
            "Thien",
            "Thang",
            "Hiu",};
        
        int length = mangA.length;
        System.out.println("Do dai mangA: " + length);
        
        for (int i = 0; i < mangA.length; i++) {
            System.out.print("Index: " + i);
            System.out.println("\tValue: " + mangA[i]);
        }
        
        String s = "Nhay doi \" Tab3123123\t Xuong dong \n Dau gach \\ Xoa\b";
        String sample = "Nguyen Thien";
        char c = 'X';
        //               01234567
        System.out.println("Sample: \t" + sample);
        System.out.println("Length: \t" + sample.length());
        
        for (int i = 0; i < sample.length(); i++) {
            System.out.print("Index: " + i);
            System.out.print("\tValue: " + sample.charAt(i));
            System.out.println("");
        }
        
        boolean check = false;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) == c) {
                System.out.println("Tim thay " + c + " tai: " + i);
                check = true;
                
            }
        }
        
        if (check) {
            System.out.println("Tim thay!!");
        } else {
            System.out.println("Khong tim thay");
        }
        
        String key_word = "Thien";
        
        if (sample.contains(key_word)) {
            System.out.println(key_word + " co trong " + sample);
        }
        int[] arrayA = {1, 22, 36, 42, 51, 22, 65, 33, 67};
        // in ra thong tin ve mang:
        // sum()
        // tim cac phan tu chia 5 du 1
        // tim cac phan tu la nguyen to
        int sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sum += arrayA[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("Cac phan tu chia 5 du 1: ");
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 5 == 1) {
                System.out.print(arrayA[i]+" ");
            }
        }
        System.out.println();
        
        System.out.println("Cac so nguyen to:");
        for (int i = 0; i < arrayA.length; i++) {
            
        }
        
    }
    
}
