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
public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private int choose;
     
    public GiaoDichNha() {
        super();
    }
 
    public GiaoDichNha(String loaiNha, String diaChi) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
 
    public String getLoaiNha() {
        return loaiNha;
    }
 
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
     
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap loai nha (0: cao cap, 1: thuong): ");
        choose = sc.nextInt();
        switch (choose) {
            case 0 -> loaiNha = "cao cap";
            case 1 -> loaiNha = "thuong";
            default -> System.out.println("So khong hop le");
        }
    }
    
    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cap")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
     
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Loai nha: " + loaiNha);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Dien tich: " + dienTich);
    }
}
