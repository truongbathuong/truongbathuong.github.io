package Java111;
import java.util.Scanner;
public class Tinhlaixuat11
{
    public static void main(String[] args) throws Exception
    {
        
        Scanner scan = new Scanner(System.in);
        double p = 100000000;
        double v = 0.12;
        double rate, s;
        scan.close();
        rate = p *(v/12);
        s=(p/12)+rate;
        System.out.print("Tiền lãi hàng tháng là:"+rate);
        System.out.print("Tổng tiền lãi là:"+s);
    }
}