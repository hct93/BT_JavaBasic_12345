package BaiTap3;

public class ifElse {
    // Biến cố định
    public static int number = 100;

    // Hàm kiểm tra giá trị n so với number
    public void kiemTra(int n) {
        if (n == number) {
            System.out.println("TH1: n bằng " + number);
        } else if (n < number) {
            System.out.println("TH2: n nhỏ hơn " + number);
        } else {
            System.out.println("TH3: n lớn hơn " + number);
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của class
        ifElse obj = new ifElse();
        // Gọi hàm và truyền giá trị vào để kiểm tra
        obj.kiemTra(50);   // TH2: n < number
        obj.kiemTra(100);  // TH1: n == number
        obj.kiemTra(150);  // TH3: n > number
    }
}
