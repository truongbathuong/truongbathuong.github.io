package Java111;

import java.time.Month;
import java.util.Scanner;

public class switch111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập vào tháng :");
        a = sc.nextInt();
        switch(a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Tháng có 31 ngày");
            break;
            case 2:
            System.out.println("Tháng có 28 hoặc 29 ngày");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("Tháng có 30 ngày");
            break;
            default: System.out.println("Non");

        }
    }
    
}
