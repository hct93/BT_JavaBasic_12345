package BaiTap3;

public class onTapToanTu {
    // Biến cố định
    public static int number = 100;

    // Các biến bất kỳ
    static int a = 10;
    static int b = 20;
    static int c = 30;


    // Phương thức thực hiện các toán tử
    public static void thucHienToanTu() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Toán tử quan hệ
        boolean reSult1 = (a > b);
        System.out.println(("a > b = ") + reSult1);// So sánh lớn hơn
        boolean reSult2 = (a < b);
        System.out.println("a < c: " + reSult2);  // So sánh nhỏ hơn
        boolean reSult3 = (a == b);
        System.out.println("b == c: " + reSult3); // So sánh bằng


        // Toán tử logic
        boolean reSult4 = (a > b && b < c);
        System.out.println("a > b && b < c: " + reSult4); // AND logic
        boolean reSult5 = (a < b || b > c);
        System.out.println("a < b || b > c: " + reSult5); // OR logic
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng
        onTapToanTu obj = new onTapToanTu();
        // Thực hiện các toán tử
        obj.thucHienToanTu();
    }
}
