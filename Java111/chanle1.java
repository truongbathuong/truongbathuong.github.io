package Java111;
import java.util.Scanner;

public class chanle1 {
        public static void main(String[] args)  throws Exception{
            Scanner sc = new Scanner(System.in);
            int n;
            String result;
            System.out.println("nhập vào số: ");
            n = sc.nextInt();
            result = (n%2 == 0) ? "Đây là số chẵn" : "Đây là số lẻ";
            System.out.println(result);
    
            sc.close();
        }
    }