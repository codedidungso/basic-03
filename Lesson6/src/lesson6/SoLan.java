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
public class SoLan {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,4,4,4,5,5};
        int maxA = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxA){
            maxA = a[i];
            }
        }
        
        int[] b = new int[maxA+1];
        
        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        int maxB = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]>maxB) {
                maxB = b[i];
            }
        }
        for (int i = b.length-1; i > 0; i--) {
            if (b[i] == maxB) {
                System.out.println("output:"+ i);
                System.out.println("count:"+maxB);
                break;
            }
        }
    }
}
