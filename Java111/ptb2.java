package Java111;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ptb2 {
    public static void main(String[] args) {
        Scanner ptb2 = new Scanner(System.in);
        Double a;
        Double b;
        Double c;
        double delta;
        System.out.println("Nhập vào a(a!=0):");
        a = ptb2.nextDouble();
        System.out.println("Nhập vào b:");
        b = ptb2.nextDouble();
        System.out.println("Nhập vào c:");
        c = ptb2.nextDouble();
        delta = b * b - 4 * a * c;
        

        if (a == 0) {
            System.out.println("Vui lòng nhập lại");
        }
        else {
            if(delta<0){
                System.out.println("Pt vô nghiệm");
            }
            if(delta>0){
                System.out.println("Phương trình có 2 nghiệm phân biệt:"+((-b+Math.sqrt(delta))/2)+"    "+((-b-Math.sqrt(delta))/2));
            }
            if(delta==0){
                System.out.println("Pt có nghiệm kép:"+(-b/2*a));

            }

        }
        ptb2.close();
       
    }
}
