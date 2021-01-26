package Java;

import java.util.Scanner;
class Hcn {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật:");
        double length = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
        double width = scanner.nextDouble();
        double area = length*width;
        double Perimeter = (length+width)*2;
        System.out.println("Diện tích hình chữ nhật là:"+area);
        System.out.println("Chu vi hình chữ nhật là:"+Perimeter);
        System.out.println("------------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}