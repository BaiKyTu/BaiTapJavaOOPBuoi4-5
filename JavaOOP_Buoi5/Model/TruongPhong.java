package JavaOOP_Buoi5.Model;

public class TruongPhong extends NhanVien {
    private double luongMotNgay = 200;

    public TruongPhong(double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }

    public TruongPhong(String maSo, String hoTen, String chucVu, String soDT, int soNgayLamViec, double luongMotNgay, double luongMotNgay1) {
        super(maSo, hoTen, chucVu, soDT, soNgayLamViec, luongMotNgay);
        this.luongMotNgay = luongMotNgay1;
    }

    @Override
    public double TinhLuong() {
        double luongThang = getSoNgayLamViec()*this.luongMotNgay + 100*getSoNhanQuyenDuoiQuyen();
        return luongThang;
    }
}