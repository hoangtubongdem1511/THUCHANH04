/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
abstract class HoaDon {
    protected String maKhachHang;
    protected String hoTen;
    protected Ngay ngayRaHoaDon;

    public HoaDon(String maKhachHang, String hoTen, Ngay ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public abstract double tinhThanhTien();

    public void xuatHoaDon() {
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println("Ho ten khach hang: " + hoTen);
        System.out.println("Ngay ra hoa don: " + ngayRaHoaDon.toString());
    }
}
