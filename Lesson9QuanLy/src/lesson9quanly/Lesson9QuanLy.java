/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9quanly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson9QuanLy {

    /**
     * @param args the command line arguments
     */
    static int luaChon;
    static ArrayList<SinhVien> DSSV; // 

    public static void main(String[] args) {
        // [1,2,3,5,76,2,34,]   // Integer, Character, Boolean 
        DSSV = new ArrayList<SinhVien>(); // k dung int char boolean ...

        while (true) {
            hienThiMenu();
            luaChon = nhapLuaChon();
            switch (luaChon) {
                case 1:
                    CREATE();
                    break;
                case 2:
                    READ();
                    break;
                case 3:
                    UPDATE();
                    break;
                case 4:
                    DELETE();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    static void CREATE() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao MSSV moi: ");
        System.out.print("Nhap MSSV:");
        int mssv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten:");
        String hoten = sc.nextLine();
        System.out.print("Nhap CPA: ");
        float diem = sc.nextFloat();
        SinhVien sinhVienMoi = new SinhVien(mssv, hoten, diem);
        DSSV.add(sinhVienMoi);

    }

    static void READ() { // show up data
        for (int i = 0; i < DSSV.size(); i++) {
            SinhVien SVdangxet = DSSV.get(i); // setter getter
            System.out.println("SO THU TU: " + i);
            System.out.println("MSSV: " + SVdangxet.MSSV);
            System.out.println("HOTEN: " + SVdangxet.hoTen);
            System.out.println("CPA: " + SVdangxet.CPA);
            System.out.println("==============");
        }
        new Scanner(System.in).nextLine(); // dung man hinh 
    }

    static void UPDATE() {
        UPDATE_CPA();
    }

    static void UPDATE_CPA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MSSV can update CPA: ");
        int mssv = sc.nextInt();
        System.out.println("Nhap CPA moi: ");
        float CPAmoi = sc.nextFloat();
        for (int i = 0; i < DSSV.size(); i++) {
            if (DSSV.get(i).MSSV == mssv) {
                DSSV.get(i).CPA = CPAmoi;
                return;
            }
        }
    }

    static void DELETE() {
        System.out.print("Nhap vao MSSV can xoa: ");
        int mssvCanXoa = new Scanner(System.in).nextInt();
        for (int i = 0; i < DSSV.size(); i++) {
            if (DSSV.get(i).MSSV == mssvCanXoa) {
                String confirm = "";
                System.out.print("Ban co muon xoa khong (YES/NO)?");
                confirm = new Scanner(System.in).next();
                System.out.println("CF: " + confirm + ":");
                if ("YES".equals(confirm)) {
                    DSSV.remove(i);
                }
                return;
            }
        }
    }

    static int nhapLuaChon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("=== Lua chon cua ban: ");
        int n = sc.nextInt();

        return n;
    }

    static void hienThiMenu() {
        System.out.println("Cac lua chon: ");
        System.out.println("1. CREATE: Tao moi 1 sinh vien");
        System.out.println("2. READ: Hien thi sinh vien");
        System.out.println("3. UPDATE: Cap nhap thong tin 1 sinh vien");
        System.out.println("4. DELETE: Xoa 1 sinh vien.");
        System.out.println("5. Thoat chuong trinh");

    }
}
