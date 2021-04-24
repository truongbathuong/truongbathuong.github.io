package Java111.buoi10;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        try{
            int tuoi = nhapTuoi();
            System.out.println("Tuoi vua nhap :"+tuoi);

        }catch(Exception e){
            System.out.println("Nonnn");

        }
    }

//  static void checkAge(int age) throws CustomException{
//      if(age<20){
//          throw new CustomException("Oh No!!!");
//      }
//      else{
//          System.out.println("NO no!!!");
//      }
//  }
 public static int nhapTuoi()throws Exception {
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     if(age<0) throw new Exception("tuoi khong duoc nho hon 0");
     return age;
 }
    
}
