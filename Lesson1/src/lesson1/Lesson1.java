/*
 * To change this lb87o87 giu;7ugicense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author Hieu
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("jggfhg "); // print line s=
//        System.out.println("");
        // Khai bao soNguyen co gia tri = 7
//        DataType Name = InitilizeValue;
/* */
        int soNguyen = 7;   // -2^32 ... 2^23
        boolean bl = true;  // true false 
        char c = 'a';       // 0-255 ASCII 
        float f = 0.5f;     // 4 byte    
        double d = 123.565; // 8 byte  
//        byte b = 4;

//        System.out.println(soNguyen);
        char ch = 65;
        int codeA = 'A';
        //System.out.println(ch);
        // operator + - * / % 
        int A = 90;
        int B = 90;
        int ketqua;
        System.out.println("Phep cong: ");
        ketqua = A + B;
        System.out.println(ketqua);

        System.out.println("Phep tru");
        ketqua = A - B;
        System.out.println(ketqua);

        System.out.println("Phep nhan: ");
        ketqua = A * B;
        System.out.println(ketqua);

        System.out.println("Phep chia lay phan nguyen: ");
        ketqua = A / B;
        System.out.println(ketqua);

        System.out.println("Chia lay du: ");
        ketqua = A % B;
        System.out.println(ketqua);

        boolean dieukien; // bool C++
        dieukien = true;
        System.out.println(dieukien);
        dieukien = false;
        System.out.println(dieukien);
        System.out.println("Cac toan tu so sanh: > < >= <= == !=");
        System.out.println("AND &&");
        System.out.println("OR ||");
        System.out.println("");
        if (dieukien) {
            System.out.println("Dieu kien dung ");
        } else {
            System.out.println("dieu kien sai ");
        }

        if (A == B) {
            System.out.println("A bang B");
        } else {
            System.out.println("A khong bang B");
        }
        if (A % 2 == 1) {
            System.out.println("A la so le");
        } else {
            System.out.println("A la so chan");
        }
        if (A + B - 100 == 580 % 500) {
            System.out.println("Bang nhau gi gi day ");
        }
        int K = 3;
        int L = 0;
        if (K == 3 && L == 0) {
            System.out.println("K la 3 va L la 0");
        }
        if (K == 1 || K == 0) {
            System.out.println("K la 1 hoac 0");
        }

        int a = 0;
        int b = 6;
        // ax + b = 0. Tim X ?
        // neu a == 0; b == 0 => vo so nghiem   0x + 0 = 0
        // neu a == 0; b != 0 => vo nghiem )    0x + 6 = 0
        // a != 0 ;           => x = -b/a
        if (a == 0 && b == 0) {
            System.out.println("Vo So Nghiem");
        }
        if (a == 0 && b != 0) {
            System.out.println("Vo Nghiem ");
        }
        if (a != 0) {
            float x = -b / ((float) a);
//        float xx = -b / a;
            System.out.println("Nghiem la: ");
            System.out.println(x);
        }
        
        // cach 2:
        if(a==0){
            if(b==0){
                // scope 1    
            } else {
                // scope 2
            }
        } else {
            // scope 3
        }
    }

}
