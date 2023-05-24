/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
abstract class GiaoDich {
    private String maGiaoDich;
    public int ngay, thang, nam;
    public long donGia;
    public float dienTich;
    private String ten;
     
    public GiaoDich() {
        super();
    }

    public GiaoDich(String maGiaoDich, int ngay, int thang, int nam, long donGia, float dienTich, String ten) {
        this.maGiaoDich = maGiaoDich;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.ten = ten;
    }
 
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
 
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
 
 
    public long getDonGia() {
        return donGia;
    }
 
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
 
    public float getDienTich() {
        return dienTich;
    }
 
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    
    public abstract double tinhThanhTien();
     
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = sc.nextLine();
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Long.parseLong(sc.nextLine());
        System.out.print("Nhap dien tich: ");
        dienTich = Float.parseFloat(sc.nextLine());
        nhapNgayGiaoDich();
    }
    
    public void nhapNgayGiaoDich() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap nam giao dich: ");
            this.setNam(sc.nextInt());
            if (this.getNam() <= 0 && this.getNam() > 2023) {
                    System.out.println("Vui long nhap nam lon hon 0 !");
            }
        } while (this.getNam() <= 0);


        do {
            System.out.print("Nhap thang giao dich: ");
            this.setThang(sc.nextInt());
            if (this.getThang() <= 0 || this.getThang() > 12) {
                    System.out.println("Vui long nhap thang lon hon 0 va nho hon 13 !");
            }
        } while (this.getThang() <= 0 || this.getThang() > 12);

        if (this.getThang() == 1 || this.getThang() == 3 || this.getThang() == 5 || this.getThang() == 7
                || this.getThang() == 8 || this.getThang() == 10 || this.getThang() == 12) {
            do {
                    System.out.print("Nhap ngay giao dich:  ");
                    this.setNgay(sc.nextInt());
                    if (this.getNgay() <= 0 || this.getNgay() > 31) {
                            System.out.println("Vui long nhap ngay tu 1-31 !");
                    }
            } while (this.getNgay() <= 0 || this.getNgay() > 31);
        } else if (this.getThang() == 2) {
            if (this.getNam() % 400 == 0 || this.getNam() % 4 == 0 && this.getNam() % 100 != 0) {
                    do {
                            System.out.print("Nhap ngay giao dich: ");
                            this.setNgay(sc.nextInt());
                            if (this.getNgay() <= 0 || this.getNgay() > 29)
                                    System.out.println("Vui long nhap ngay tu 1-29 !");
                    } while (this.getNgay() <= 0 || this.getNgay() > 29);
            } else {
                    do {
                            System.out.print("Nhap ngay giao dich: ");
                            this.setNgay(sc.nextInt());
                            if (this.getNgay() <= 0 || this.getNgay() > 28)
                                    System.out.println("Vui long nhap ngay tu 1-28 !");
                    } while (this.getNgay() <= 0 || this.getNgay() > 28);
            }
        } else {
            do {
                    System.out.print("Nhap ngay giao dich: ");
                    this.setNgay(sc.nextInt());
                    if (this.getNgay() <= 0 || this.getNgay() > 30)
                            System.out.println("Vui long nhap ngay tu 1-30 !");
            } while (this.getNgay() <= 0 || this.getNgay() > 30);
        }
    }
     
    public void xuat() {
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ten: " + ten);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Ngay giao dich: " + this.getNgay() + "/" + this.getThang() + "/" + this.getNam());
    }
}
