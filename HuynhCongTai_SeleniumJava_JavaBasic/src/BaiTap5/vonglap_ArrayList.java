package BaiTap4;

import java.util.ArrayList;

public class vonglap_ArrayList {
    public static void main(String[] args) {

      ArrayList<Integer> listSoNguyen = new ArrayList<>();

        for (int i = 0; i <= 70; i++){
            if (i % 2 == 0){
                System.out.println(i + " Là Số Chẵn");
                listSoNguyen.add(i) ;

            }
        }
        for (int item : listSoNguyen){
            System.out.println(item);
        }
    }
}
