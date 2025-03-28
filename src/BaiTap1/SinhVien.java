package BaiTap1;

public class SinhVien {

//  Class SinhVien: khai báo 3 loại biến (local, instance, static) gọi lại in ra ở hàm main

    //  Biến Instance
    public String Ten = "Huynh Cong Tai";
    public int Tuoi = 32;

    //  Biến Static
    public static String ChuyenNganh = "Cong Nghe Thong Tin";

    public void HienThiThongTin() {
        // Biến Local
        int Namhoc = 2025;
        String Khoa = "Thang 1/";
        String Thongtinkhoa = Khoa + Namhoc;

        System.out.println(Thongtinkhoa);
        System.out.println(Ten);
        System.out.println(Tuoi);
        System.out.println(ChuyenNganh);
        System.out.println(ThongTin.Tentruong);
        System.out.println(ThongTin.Coso);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.HienThiThongTin();
    }
}
