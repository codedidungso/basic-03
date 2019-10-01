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
public class ChuaBTVN {

    // psvm (tab)
    public static void main(String[] args) {
        long x = 78998745;
        long y = 12312736;
        long ketqua = x*y;
        int d = 0;
        while (y > 0) {
            long r = y % 10;
            y = y / 10;
            //System.out.println("Phan du: " + r + " Phan con lai: " + y);
            long multi = r * x;
            String space = "";
            for (int i = 0; i < d; i++) {
                space = space + " ";
            }
            d++;
            System.out.printf("%30s\n",multi + space);
            //System.out.printf("");
            
        }
        
        System.out.println("----------------------------------");
        System.out.printf("%30s\n",ketqua);
        
        byte b = (byte) 129;
        System.out.println(b);
    }

}
