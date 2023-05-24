/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        int choice;
        int soLuongGiaoDichDat = 0;
        int soLuongGiaoDichNha = 0;
        BigDecimal tongThanhTienDatBigDecimal = BigDecimal.ZERO;
        do {
            System.out.println("===== Quan li giao dich nha dat =====");
            System.out.println("1. Nhap giao dich dat");
            System.out.println("2. Nhap giao dich nha");
            System.out.println("3. Xuat danh sach giao dich");
            System.out.println("4. Tinh trung binh thanh tien giao dich dat");
            System.out.println("5. Xuat giao dich thang 9 nam 2013");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    GiaoDichDat giaoDichDat = new GiaoDichDat();
                    giaoDichDat.nhap();
                    danhSachGiaoDich.add(giaoDichDat);
                    soLuongGiaoDichDat++;
                    break;
                case 2:
                    GiaoDichNha giaoDichNha = new GiaoDichNha();
                    giaoDichNha.nhap();
                    danhSachGiaoDich.add(giaoDichNha);
                    soLuongGiaoDichNha++;
                    break;
                case 3:
                    if (danhSachGiaoDich.isEmpty()) {
                        System.out.println("Danh sach giao dich trong.");
                    } else {
                        for (GiaoDich giaoDich : danhSachGiaoDich) {
                            giaoDich.xuat();
                            System.out.println("=============================");
                        }
                    }
                    break;
                case 4:
                    double tongThanhTienDat = 0;
                    for (GiaoDich giaoDich : danhSachGiaoDich) {
                        if (giaoDich instanceof GiaoDichDat) {
                            tongThanhTienDatBigDecimal = tongThanhTienDatBigDecimal.add(BigDecimal.valueOf(giaoDich.tinhThanhTien()));
                            soLuongGiaoDichDat++;
                        }
                    }
                    if (soLuongGiaoDichDat == 0) {
                        System.out.println("Khong co giao dich dat trong danh sach");
                    } else {
                        BigDecimal soLuongGiaoDichDatBigDecimal = BigDecimal.valueOf(soLuongGiaoDichDat);
                        BigDecimal trungBinhThanhTienDatBigDecimal = tongThanhTienDatBigDecimal.divide(soLuongGiaoDichDatBigDecimal, 2, RoundingMode.HALF_UP);
                        System.out.println("Trung binh thanh tien giao dich dat: " + trungBinhThanhTienDatBigDecimal);
                    }
                    break;
                case 5:
                    System.out.println("Danh sach giao dich thang 9 nam 2013:");
                    for (GiaoDich giaoDich : danhSachGiaoDich) {
                        if (giaoDich.nam == 2013 && giaoDich.thang == 9) {
                            giaoDich.xuat();
                            System.out.println("=============================");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choice != 0);
        System.out.println("Tong so luong giao dich dat: " + soLuongGiaoDichDat);
        System.out.println("Tong so luong giao dich nha: " + soLuongGiaoDichNha);
    }
}
