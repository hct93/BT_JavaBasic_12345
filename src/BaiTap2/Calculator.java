package BaiTap2;

public class Calculator {

    // Tạo hàm tính tổng 2 số nguyên
    public static int tongSoNguyen(int a, int b){
        return a+b;
    }

    // Tạo hàm tính tích 2 số thực
    public static double tichSoThuc(double a, double b){
        return a*b;
    }


    public static void main(String[] args) {
        int sumResult = tongSoNguyen(10,290);
        double multiResult = tichSoThuc(1.5,10.5);

        System.out.println(sumResult);
        System.out.println(multiResult);
    }
}
