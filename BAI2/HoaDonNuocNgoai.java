/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
class HoaDonNuocNgoai extends HoaDon {
    private String quocTich;
    private int soLuong;
    private double donGia;

    public HoaDonNuocNgoai(String maKhachHang, String hoTen, Ngay ngayRaHoaDon, String quocTich, int soLuong, double donGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void xuatHoaDon() {
        super.xuatHoaDon();
        System.out.println("Quoc tich: " + quocTich);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}
