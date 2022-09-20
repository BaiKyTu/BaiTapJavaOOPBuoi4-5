package JavaOOP_Buoi5.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NhanVien {
    private String maSo;
    private String hoTen;
    public String chucVu;
    private String soDT;
    private int soNgayLamViec;
    private double luongMotNgay;

    private NhanVien truongPhongQuanLy;
    private int soNhanQuyenDuoiQuyen;
    List<NhanVien> dsNhanVienDuoiQuyen = new ArrayList<>();
    private float coPhan;


    public NhanVien(){
    }

    public NhanVien(String maSo, String hoTen, String chucVu, String soDT, int soNgayLamViec, double luongMotNgay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.soDT = soDT;
        this.soNgayLamViec = soNgayLamViec;
        this.luongMotNgay = luongMotNgay;
    }


    public String  getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        switch (this.chucVu.toUpperCase()) {
            case "NV" :
            case "Nhân viên thường":
                this.maSo = this.chucVu.toUpperCase()+ this.maSo;
                this.chucVu = "Nhân viên thường";
                this.luongMotNgay = 100;
                break;
            case "TP" :
            case "Trưởng phòng" :
                this.maSo = this.chucVu.toUpperCase()+ this.maSo;
                this.chucVu = "Trưởng phòng";
                this.luongMotNgay = 200;
                break;
            case "GD" :
            case "Giám đốc" :
                this.maSo = this.chucVu.toUpperCase()+ this.maSo;
                this.chucVu = "Giám đốc";
                this.luongMotNgay = 300;
                break;
        }
    }

    public String getHoTen() { return hoTen; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getChucVu() { return chucVu; }

    public void setChucVu(String chucVu) { this.chucVu = chucVu; }

    public String getSoDT() { return soDT; }

    public void setSoDT(String soDT) { this.soDT = soDT; }

    public int getSoNgayLamViec() { return soNgayLamViec; }

    public void setSoNgayLamViec(int soNgayLamViec) { this.soNgayLamViec = soNgayLamViec; }

    public double getLuongMotNgay() { return luongMotNgay; }

    public void setLuongMotNgay(double luongMotNgay) { }

    public NhanVien getTruongPhongQuanLy() { return truongPhongQuanLy; }

    public void setTruongPhongQuanLy(NhanVien truongPhongQuanLy) { this.truongPhongQuanLy = truongPhongQuanLy; }

    public int getSoNhanQuyenDuoiQuyen() {return soNhanQuyenDuoiQuyen; }

    public void setSoNhanQuyenDuoiQuyen(int soNhanQuyenDuoiQuyen) { this.soNhanQuyenDuoiQuyen = soNhanQuyenDuoiQuyen; }

    public List<NhanVien> getDsNhanVienDuoiQuyen() { return dsNhanVienDuoiQuyen; }

    public void setDsNhanVienDuoiQuyen(List<NhanVien> dsNhanVienDuoiQuyen) { this.dsNhanVienDuoiQuyen = dsNhanVienDuoiQuyen; }

    public float getCoPhan() { return coPhan; }

    public void setCoPhan(float coPhan) { this.coPhan = coPhan; }

    public double TinhTongThuNhap(double doanhThu, double tongLuong){
        double tongThuNhap;
        if (this.chucVu.equals("Giám đốc")){
            tongThuNhap = this.TinhLuong() + (doanhThu - tongLuong)*this.coPhan/100;
        } else {tongThuNhap = this.TinhLuong();}
        return tongThuNhap;
    }

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân sự: ");
        System.out.println("Mã số nhân sự: ");
        this.maSo = sc.nextLine();
        System.out.println("Họ tên nhân sự: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập chức vụ nhân sự [Giám đốc (GD) - Trưởng phòng (TP) - Nhân viên thường (NV)]: ");
        this.chucVu = sc.nextLine().trim();
        setMaSo(this.chucVu);
        System.out.println("Số ĐT nhân sự: ");
        this.soDT = sc.nextLine();
        System.out.println("Số ngày làm việc: ");
        this.soNgayLamViec = Integer.parseInt(sc.nextLine());
    }

    public void XuatThongTin(){
        System.out.println("Họ và tên: " + getHoTen());
        System.out.println("Mã số nhân viên: " + getMaSo());
        System.out.println("Chức vụ: " + getChucVu());
        System.out.println("Số điện thoại: " + getSoDT());
        System.out.println("Lương một ngày: " + getLuongMotNgay());
        System.out.println("Số ngày làm việc: " + getSoNgayLamViec() + " ngày");
        System.out.println("Lương tháng: " + TinhLuong());
        System.out.println("----------------------------------------------------------");
    }

    public double TinhLuong(){
        double luongThang = getSoNgayLamViec()*getLuongMotNgay();
        return luongThang;
    }

    public int CapNhatSoNhanVien() {
        if (this.getChucVu().equalsIgnoreCase("Trưởng phòng")) {
            this.soNhanQuyenDuoiQuyen += 1;
        }
        return this.soNhanQuyenDuoiQuyen;
    }

        public List CapNhanDanhSachNhanVienQuanLy(NhanVien nv) {
            if(this.getChucVu().equalsIgnoreCase("Trưởng phòng")) {
                this.dsNhanVienDuoiQuyen.add(nv);
            }
            return this.dsNhanVienDuoiQuyen;
        }

}

