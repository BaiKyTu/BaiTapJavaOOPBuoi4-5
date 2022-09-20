package JavaOOP_Buoi5;

import JavaOOP_Buoi5.Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = null;
        CongTy ct = new CongTy();
        while (true){
            System.out.println();
            System.out.println("============ CHƯƠNG TRÌNH QUẢN LÝ NHÂN SỰ ===============");
            System.out.println("1. Nhập thông tin công ty. ");
            System.out.println("2. Phân bổ nhân viên vào trưởng phòng. ");
            System.out.println("3. Thêm, xóa thông tin một nhân sự. ");
            System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty. ");
            System.out.println("5. Tính và xuất tổng lương cho toàn công ty. ");
            System.out.println("6. Tìm nhân viên thường có lương cao nhất. ");
            System.out.println("7. Tìm Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất. ");
            System.out.println("8. Sắp xếp toàn bộ nhân viên theo thứ tự abc. ");
            System.out.println("9. Sắp xếp toàn bộ nhân viên theo thứ tự lương giảm dần. ");
            System.out.println("10. Tìm Giám đốc có số lượng cổ phần nhiều nhất");
            System.out.println("11. Tính và xuất Tổng thu nhập của từng giám đốc. ");
            System.out.println("0. Kết thúc chương trình. ");
            System.out.println("Mời chọn chức năng (1-11): ");
            switch (op = sc.nextLine().trim()){
                case "1": //Nhập thông tin cty
                    System.out.println("1. Nhập và xuất thông tin công ty");
                    ct.NhapThongTinCongTy();
                    System.out.println(ct);
                    break;
                case "2":
                    System.out.println("2. Phân bổ nhân viên vào trưởng phòng");
                    ct.PhanBoNhanVien();
                    break;
                case "3":
                    System.out.println("3. Thêm, xóa thông tin một nhân sự");
                    System.out.println("Mời chọn chức năng:");
                    System.out.println("1. Thêm nhân sự");
                    System.out.println("2. Xóa nhân sự");
                    int a = Integer.parseInt(sc.nextLine());
                    switch (a){
                        case 1:
                            NhanVien nv = new NhanVien();
                            ct.ThemNhanVien(nv);
                            break;
                        case 2:
                            ct.XoaNhanVien();
                            break;
                    }
                    break;
                case "4":
                    System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
                    ct.XuatToanBoNhanVien();
                    break;
                case "5":
                    System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
                    ct.TinhTongLuongToanCongTy();
                    break;
                case "6":
                    System.out.println("6. Tìm nhân viên thường có lương cao nhất");
                    ct.NhanVienThuongLuongCaoNhat();
                    break;
                case "7":
                    System.out.println("7. Tìm Trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
                    ct.TruongPhongCoSoNhanVienNhieuNhat();
                    break;
                case "8":
                    System.out.println("8. Sắp xếp toàn bộ nhân viên theo thứ tự abc");
                    ct.SapXepNhanVienTheoTen();
                    break;
                case "9":
                    System.out.println("9. Sắp xếp toàn bộ nhân viên theo thứ tự lương giảm dần");
                    ct.SapXepNhanVienTheoLuong();
                    break;
                case "10":
                    System.out.println("10. Tìm Giám đốc có số lượng cổ phần nhiều nhất");
                    ct.GiamDocCoNhieuCoPhanNhat();
                    break;
                case "11":
                    System.out.println("11. Tính và xuất Tổng thu nhập của từng giám đốc");
                    ct.TinhTongThuNhapTungGiamDoc();
                    break;
                case "0":
                    System.exit(0);
            }
        }



    }
}
