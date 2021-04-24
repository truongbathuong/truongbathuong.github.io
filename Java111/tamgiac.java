package Java111;

import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        Scanner tg = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap vao canh thu nhat cua tam giac:");
        a = tg.nextInt();
        System.out.println("Nhap vao canh thu hai cua tam giac:");
        b = tg.nextInt();
        System.out.println("Nhap vao canh thu ba cua tam giac:");
        c = tg.nextInt();
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Đây không phải cạnh của tam giác");
        } else {
            System.out.println("Đây là cạnh của tam giác");
        }
    }

}
