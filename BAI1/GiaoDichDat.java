/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
 
    public GiaoDichDat() {
        super();
    }
 
    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
 
    public String getLoaiDat() {
        return loaiDat;
    }
 
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    @Override
    public double tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }
     
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap loai dat (A/B/C): ");
        loaiDat = sc.nextLine();
    }
 
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai dat: " + loaiDat);
        System.out.println("Dien tich: " + dienTich);
    }
}
