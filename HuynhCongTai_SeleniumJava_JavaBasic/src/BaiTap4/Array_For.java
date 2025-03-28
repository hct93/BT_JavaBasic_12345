package BaiTap4;

public class Array_For {
    public static void main(String[] args) {

        int mangSoChan[] = new int[26];
        int index = 0;

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                System.out.println(i + " Là Số Chẵn");
                mangSoChan[index] = i;
                index++;
            }
        }
        for (int item : mangSoChan){
        System.out.println(item);
    }
}}
