/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();

        System.out.print("Nhap so luong hoa don: ");
        int soLuongHoaDon = scanner.nextInt();
        for (int i = 0; i < soLuongHoaDon; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1));
            System.out.print("Loai khach hang (1: Viet Nam, 2: Nuoc ngoai): ");
            int loaiKhachHang = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi đọc số nguyên

            System.out.print("Ma khach hang: ");
            String maKhachHang = scanner.nextLine();
            System.out.print("Ho ten khach hang: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngay ra hoa don (ngay thang nam): ");
            int ngay = scanner.nextInt();
            int thang = scanner.nextInt();
            int nam = scanner.nextInt();
            Ngay ngayRaHoaDon = new Ngay(ngay, thang, nam);

            if (loaiKhachHang == 1) { 
                scanner.nextLine(); 
                System.out.print("Doi tuong khach hang (sinh hoat , kinh doanh , san xuat): ");
                String doiTuongKhachHang = scanner.nextLine();
                System.out.print("So luong (so kw tieu thu): ");
                int soLuong = scanner.nextInt();
                System.out.print("Don gia: ");
                double donGia = scanner.nextDouble();
                System.out.print("Dinh muc: ");
                int dinhMuc = scanner.nextInt();

                HoaDonVietNam hoaDonVietNam = new HoaDonVietNam(maKhachHang, hoTen, ngayRaHoaDon, doiTuongKhachHang, soLuong, donGia, dinhMuc);
                danhSachHoaDon.add(hoaDonVietNam);
            } else if (loaiKhachHang == 2) { 
                scanner.nextLine(); 
                System.out.print("Quoc tich: ");
                String quocTich = scanner.nextLine();
                System.out.print("So luong: ");
                int soLuong = scanner.nextInt();
                System.out.print("Don gia: ");
                double donGia = scanner.nextDouble();

                HoaDonNuocNgoai hoaDonNuocNgoai = new HoaDonNuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, quocTich, soLuong, donGia);
                danhSachHoaDon.add(hoaDonNuocNgoai);
            }
        }

        
        System.out.println("\nDanh sach hoa don");
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatHoaDon();
            System.out.println();
        }

        
        int tongSoLuongKhachHangVietNam = 0;
        int tongSoLuongKhachHangNuocNgoai = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof HoaDonVietNam) {
                tongSoLuongKhachHangVietNam++;
            } else if (hoaDon instanceof HoaDonNuocNgoai) {
                tongSoLuongKhachHangNuocNgoai++;
            }
        }
        System.out.println("Tong so luong khach hang Viet Nam: " + tongSoLuongKhachHangVietNam);
        System.out.println("Tong so luong khach hang nuoc ngoai: " + tongSoLuongKhachHangNuocNgoai);

        
        double tongThanhTienKhachHangNuocNgoai = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof HoaDonNuocNgoai) {
                tongSoLuongKhachHangNuocNgoai++;
                tongThanhTienKhachHangNuocNgoai += hoaDon.tinhThanhTien();
            }
        }
        double trungBinhThanhTienKhachHangNuocNgoai = tongThanhTienKhachHangNuocNgoai / tongSoLuongKhachHangNuocNgoai;
        System.out.println("Trung binh thanh tien khach hang nuoc ngoai: " + trungBinhThanhTienKhachHangNuocNgoai);

        
        System.out.println("\nCac hoa don trong thang 09 nam 2013");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.thang == 9 && hoaDon.ngayRaHoaDon.nam == 2013) {
                hoaDon.xuatHoaDon();
                System.out.println();
            }
        }
    }
}
