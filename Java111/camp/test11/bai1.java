

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Nhap ki tu: ");
        for (int i = 0; i < 100; i++) {
            String n = scanner.nextLine();
            if (n.toUpperCase().equals("Q")) {
                break;
            }
            if (n.matches("^[-+]?\\d+$")) {
                list.add(Integer.valueOf(n));
            }
        }
        scanner.close();
        Collections.sort(list);
        System.out.println("Mang da sap xep: ");
        list.forEach(System.out::println);

    }
}

