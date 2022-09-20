package JavaOOP_Buoi5.Model;

public class NhanVienThuong extends NhanVien{
    private double luongMotNgay = 100;
    private TruongPhong truongPhongQuanLy;

    public NhanVienThuong(double luongMotNgay, TruongPhong truongPhongQuanLy) {
        this.luongMotNgay = luongMotNgay;
        this.truongPhongQuanLy = truongPhongQuanLy;
    }

    public NhanVienThuong(String maSo, String hoTen, String chucVu, String soDT, int soNgayLamViec, double luongMotNgay, TruongPhong truongPhongQuanLy) {
        super(maSo, hoTen, chucVu, soDT, soNgayLamViec, luongMotNgay);
        this.luongMotNgay = luongMotNgay;
        this.truongPhongQuanLy = truongPhongQuanLy;
    }

    public TruongPhong getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    public void setTruongPhongQuanLy(TruongPhong truongPhongQuanLy) {
        this.truongPhongQuanLy = truongPhongQuanLy;
    }

    @Override
    public double getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }

    @Override
    public double TinhLuong() {
        return super.TinhLuong();
    }
}