import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số N nguyên dương. ĐK: 8< N < 14");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(scan.nextLine());

        
        int[] createdNumber = randomNumbers(n);
        System.out.println("Mang ngau nhien la: " + Arrays.toString(createdNumber));

        System.out.print("Nhập số X trong khoảng 10 đến -10: ");
        int target = Integer.valueOf(scan.nextLine());
        scan.close();

    }

    public static int[] randomNumbers(int n) {
        int[] randomNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = (int) (Math.random() * 21) - 10;
        }
        return randomNumbers;
    }


}
