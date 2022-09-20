package JavaOOP_Buoi5.Model;

import java.util.Scanner;

public class GiamDoc extends NhanVien   {
    private float coPhan = 1000;
    private double luongMotNgay = 300;

    public GiamDoc(float coPhan, double luongMotNgay) {
        this.coPhan = coPhan;
        this.luongMotNgay = luongMotNgay;
    }

    public GiamDoc(String maSo, String hoTen, String chucVu, String soDT, int soNgayLamViec, double luongMotNgay, float coPhan, double luongMotNgay1) {
        super(maSo, hoTen, chucVu, soDT, soNgayLamViec, luongMotNgay);
        this.coPhan = coPhan;
        this.luongMotNgay = luongMotNgay1;
    }

    @Override
    public float getCoPhan() {
        return coPhan;
    }

    @Override
    public void setCoPhan(float coPhan) {
        this.coPhan = coPhan;
    }

    @Override
    public double getLuongMotNgay() {
        return luongMotNgay;
    }

    @Override
    public void setLuongMotNgay(double luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }

    @Override
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.NhapThongTin();
        while (this.coPhan<0 || this.coPhan>100) {  //Bắt người dùng nhập đúng từ 0-100
            System.out.println("Nhập số cổ phần (0% - 100%) của Giám đốc: ");
            this.coPhan = sc.nextFloat();
        }
    }

    @Override
    public double TinhLuong() {
        return super.TinhLuong();
    }
}