/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author thiennd
 */
public class ChuaBTVN5 {

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 0},
            {4, 5, 0},
            {7, 8, 0}
        };

        int check[] = new int[9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                check[a[i][j]]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("check:" + i
                    + ": " + check[i]
            );
        }
        String str = "thienafsk&dnfa";
        String special = "!@#$%^&*()";
        if(checkContainsSpecial(str, special)){
            System.out.println("Dung");
        } else {
            System.out.println("Sai");
        }
    }
    public static boolean checkContainsSpecial(String str, String spec){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='!' || str.charAt(i)=='@' ) // ...
            if(
                    spec.contains(
                            String.valueOf(str.charAt(i))
                    )){
                return true;
            } else continue;
//            for (int j = 0; j < spec.length(); j++) {
//                if(str.charAt(i)==spec.charAt(j)){
//                    return true;
//                } 
//            }
        }
        return false;
    }
}
