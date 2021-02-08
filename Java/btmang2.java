package Java111;
import java.util.Scanner;

public class btmang2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap vao phan tu thu arr[%d]:" ,i);
            arr[i] = sc.nextInt();
            if(arr[i]<=0){
                System.out.println("nhap sai");
                System.exit(0);
            }
        }
        
        System.out.println("mang vua nhap la:");
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
    int max =arr[0];
    for(int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("phan tu lon nhat trong mang la:"+max);

   
    int position =0;
    for(int i=0;i<n;i++){
    if(arr[i] == max){
        position = i;
        System.out.println("vi tri phan tu lon nhat la:"+position);
    }
    }
    int max2=0;
   for(int i=0;i<n;i++){
       if(arr[i] > max2 && arr[i] != arr[position]){
           max2=arr[i];
       }
   }
   System.out.println("phan tu lon thu 2 trong mang la:"+max2);
   int position2 =0;
   for(int i=0;i<n;i++){
       if(arr[i] == max2){
           position2 =i;
           System.out.println("vi tri phan tu lon thu 2 trong mang la:"+position2); 
       }
   }
}
}
