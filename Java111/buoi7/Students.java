package Java111.buoi7;

import java.util.Scanner;

public class Students extends Person{
    public String id;
    public double CPA;
    public String email;
    Scanner sc = new Scanner(System.in);
 public String getId(){
     return id;
 }
 public void setId(String id){
     this.id = id;
 }
 public Double getCPA(){
     return CPA;
 }
 public void setcPA(Double CPA){
     this.CPA= CPA;
 }
 public String getemail(){
     return email;
 }
 public void setemail(String email){
     this.email = email;
 }
 @Override
 public void input(){
     super.input();
     System.out.println("Nhap ma sinh vien:");
     setId(sc.nextLine());
     System.out.println("Nhap diem trung binh:");
     setcPA(sc.nextDouble());
     System.out.println("Nhap email:");
     setemail(sc.nextLine());
 }
 @Override
 public void display(){
     super.display();
     System.out.println("Ma sinh vien:"+getId());
     System.out.println("Diem trung binh:"+getCPA());
     System.out.println("Email:"+getemail());

 }

}