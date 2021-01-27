package Java;
import java.util.Scanner;
public class Tinhlaixuat
{
    public static void main(String[] args) throws Exception
    {
        float p, r, t, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi vào ngân hàng : ");
        p = scan.nextFloat();
        System.out.print("Nhập vào lãi xuất hàng năm (%) : ");
        r = scan.nextFloat();
        System.out.print("Nhập vào thời gian gửi (tính bằng năm) : ");
        t = scan.nextFloat();
        scan.close();
        s = (p * r * t) / 100;
        System.out.print("Số tiền lãi là: " +s);
    }
}
