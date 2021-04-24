package Java111;

import java.util.Scanner;
public class Ht 
{
        public static double tinhDienTich(double r) {
            return r * r * Math.PI;
        }
        public static double tinhChuVi(double r){
            return r * 2 * 3.14;
        }
        public static void main(String[] args) {
            double r;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập bán kính hình tròn: ");
            r = scanner.nextDouble();
            System.out.println("Diện tích hình tròn là: " + tinhDienTich(r));
            System.out.println("Chu vi hình tròn là: "+ tinhChuVi(r));
            System.out.println("----------------------------");
            scanner.close();
        }
    }