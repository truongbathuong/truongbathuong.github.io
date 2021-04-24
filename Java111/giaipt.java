package Java111;

import java.util.Scanner;
public class giaipt {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        double a;
        double b;

        System.out.println("nhap vao a:");
        a = pt.nextDouble();
        System.out.println("nhap vao b:");
        b = pt.nextDouble();
        pt.close();
        if(a==0&&b==0)
        {
            System.out.println("pt có vô số nghiệm:");
        }
        else if(a==0&&b!=0)
        {
            System.out.println("pt vo nghiem");
        }
        else
        {

            System.out.println("nghiệm của pt là:" +(-b/a));
        }
        
        
    }
    
}