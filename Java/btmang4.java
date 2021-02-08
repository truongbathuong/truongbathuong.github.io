package Java111;
import java.util.Scanner;

public class btmang4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang va so cot:");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("nhap mang A");
        nhapmang(n,A);
        
        System.out.println("mang A sau khi nhap la:");
        xuatmang(n,A);
        tongchiahetcho5(n, A);
       
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
    public static void tongchiahetcho5(int n, int arr[][]) 
    {
        int sum =0;
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]%5==0){
                sum += arr[i][j];
            }
        }

     }  
     System.out.println("tong cac phan tu chia het cho 5 la:"+sum); 
    }
}

