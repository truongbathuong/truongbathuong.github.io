package Java111.btvnbuoi9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh :");
        double r = sc.nextDouble();
        hinhtron hinhtron = new hinhtron(r);
        hinhtron.input();
        System.out.println("Nhap vao chieu dai:");
        System.out.println("Nhap vao chieu rong:");
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();
        hinhchunhat hinhchunhat = new hinhchunhat(cd,cr);
        hinhchunhat.output();
        sc.close();
    }
}
