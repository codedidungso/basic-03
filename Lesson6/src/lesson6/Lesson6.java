/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long conlai = Integer.valueOf(input);
        long sodu = 0;
        long heso = 100;
        String kq = "";
        // ,568
        // ,374,568
        while (true) {
            System.out.println("=== vong lap ===");
            System.out.println("conlai:\t" + conlai);
            System.out.println("sodu: \t" + sodu);
            System.out.println("kq: \t" + kq);
            sodu = conlai % heso;
            kq = "," + sodu + kq;
            conlai = conlai / heso;
            if (conlai < heso) {
                kq = conlai + kq;
                break;
            }

        }
        int[][] matrix = new int[3][3];
        System.out.println("Nhap vao toa do: ");
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        System.out.println("Nhap gia tri: ");
        int giatri = sc.nextInt();
        matrix[hang][cot] = giatri;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println(kq);
    }

}
