/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9quanly;

import java.util.Date;

/**
 *
 * @author thiennd
 */
public class SinhVien {

    int MSSV;
    String hoTen;
    float CPA;
    Date ngaysinh;

    SinhVien(int mssv_moi, String hoTen_moi, float CPA_moi) {
        MSSV = mssv_moi;
        hoTen = hoTen_moi;
        CPA = CPA_moi;
    }
}
