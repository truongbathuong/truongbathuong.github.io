package Java111;

import java.util.Scanner;

public class btmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap vao phan tu thu arr[%d]:" ,i);
            arr[i] = sc.nextInt();
        }
        
        System.out.println("mang vua nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\nphan tu nho nhat trong mang la:" + min);
        System.out.println("phan tu lon nhat trong mang la:" + max);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.println(arr[i] + "\t");
            }
        }
        System.out.println("So phan tu chan trong mang la:" +count);
        System.out.print("Cac phan tu la so nguyen to:");
        for (int i = 0; i < n; i++) {
            if (ktsonguyento(arr[i])) {
                System.out.print(arr[i] + "\t");
            }

        }

        System.out.printf("\nmang theo thu tu tang dan la:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }

        System.out.printf("\nmang theo thu tu giam dan la:");
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        System.out.println(arr[i] + "\t");
    }
    }
    



    public static boolean ktsonguyento(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
