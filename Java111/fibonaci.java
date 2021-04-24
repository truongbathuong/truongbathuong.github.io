package Java111;

import java.util.Scanner;

public class fibonaci {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao so nguyen duong n:");
        n = sc.nextInt();
        System.out.println("dãy số fibonacci: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
    

    /**
     * Tính số fibonacci thứ n
     * 
     * @param n: chỉ số của số fibonacci tính từ 0 vd: F0 = 0, F1 = 1, F2 = 1, F3 =
     *           2
     * @return số fibonacci thứ n
     */
    public static int fibonacci(int m) {
        if (m < 0) {
            return -1;
        } else if (m == 0 || m == 1) {
            return m;
        } else {
            return fibonacci(m - 1) + fibonacci(m - 2);
        }
    }

}
