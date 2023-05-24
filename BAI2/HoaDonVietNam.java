/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
class HoaDonVietNam extends HoaDon {
    private String doiTuongKhachHang;
    private int soLuong;
    private double donGia;
    private int dinhMuc;

    public HoaDonVietNam(String maKhachHang, String hoTen, Ngay ngayRaHoaDon, String doiTuongKhachHang, int soLuong, double donGia, int dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien;
        if (soLuong <= dinhMuc) {
            thanhTien = soLuong * donGia;
        } else {
            thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhTien;
    }

    @Override
    public void xuatHoaDon() {
        super.xuatHoaDon();
        System.out.println("Doi tuong khach hang: " + doiTuongKhachHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dinh muc: " + dinhMuc);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}
