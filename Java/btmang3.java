package Java111;

import java.util.Scanner;

public class btmang3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang va so cot:");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        System.out.println("nhap mang A");
        nhapmang(n,A);
        System.out.println("nhap mang B");
        nhapmang(n,B);
        System.out.println("mang A sau khi nhap la:");
        xuatmang(n,A);
        System.out.println("\nmang B sau khi nhap la:");
        xuatmang(n,B);
        int C[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("\nMang sau khi cong la:");
        xuatmang(n,C);
        System.out.println("\nma tran chuyen vi cua A la:");
        matranchuyenvi(n,A);

    }
    public static void nhapmang(int n, int arr[][]) {
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j= 0;j<n;j++){
                System.out.printf("nhap phan tu vi tri arr[%d][%d]",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        
    }
    public static void xuatmang(int n, int arr[][]) {
        for(int i=0;i<n;i++){
            System.out.printf("");
            for(int j=0;j<n;j++){
                System.out.printf(arr[i][j]+"\t");
            }
        }
    }
        public static void matranchuyenvi(int n, int arr[][]) {
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            
        
    
        
    }

}
