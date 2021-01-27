package Java;
import java.util.Scanner;
public class Tinhlaixuat
{
    public static void main(String[] args) throws Exception
    {
        float p, r, v, rate, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền nợ : ");
        p = scan.nextFloat();
        System.out.print("Nhập vào lãi xuất hàng năm (%) : ");
        r = scan.nextFloat();
        scan.close();
        v=(r/12)/100;
        System.out.print("Lãi suất tháng là:"+v);
        rate=p*v;
        System.out.print("Tiền lãi trả hàng tháng là :"+rate);
        s = (p/12)+rate;
        System.out.print("Số tiền lãi là: " +s);
    }
}