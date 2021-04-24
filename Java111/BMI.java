package Java111;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class BMI {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;
        System.out.println("nhap vao chieu cao(m):");
        height = sc.nextDouble();
        System.out.println("nhap vao can nang(kg):");
        weight = sc.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        System.out.println("chi so BMI:"+BMI);
        sc.close();
        if(BMI<18.5){
            System.out.println("Thiếu cân");
        }
        else if(BMI>24.9)
        {
            System.out.println("Thừa cân");
        }
        else{
            System.out.println("Cân đối");
        }
    
    }
  
}
