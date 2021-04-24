package Java111;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

public class matran {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    int n,m;
    System.out.println("nhap vao phan tu n:");
    n = sc.nextInt();
    System.out.println("nhap vao phan tu m:");
    m=sc.nextInt();
    int[][] arr= new int[n][m];
    System.out.println("mang:");

    for (int i = 0; i < n; ++i) {
        for(int j = 0; j < m; ++j) {
            arr[i][j]=sc.nextInt();
        }
    }
    sc.close();
    for (int i = 0; i < n; ++i) {
        System.out.println("");
        for(int j = 0; j < m; ++j) {
           System.out.print(arr[i][j]+"\t");
        }
    }
    int sum =0;
    for(int i=0;i<n;i++){
    
        sum+=arr[i][i];
}
    System.out.println("");
System.out.println("tong duogn cheo" +sum);
int max = arr[0][0];
    for(int i=0;i<n;i++){
    
      if(arr[i][i]>max) {max = arr[i][i];}
}

System.out.println("gia tri lon nhat" +max);
int min=arr[0][0];
    for(int i=0;i<n;i++){
    
        if(arr[i][i]<min) {min=arr[i][i];}
}
System.out.println("gia tri nho nhat" +min);
}
}
