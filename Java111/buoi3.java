package Java111;

import java.util.Scanner;

public class buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("moi nhap vao n:");
        n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu:" + i);
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Mang vua nhap la:");
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);

        }
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu co gia tri nho nhat la:" + min);
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu co gia tri nho nhat la:" + max);

        System.out.println("mang dao nguoc:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        int temp;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("mang tang dan");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
