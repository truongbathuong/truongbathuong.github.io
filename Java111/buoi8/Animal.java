package Java111.buoi8;

import java.util.Scanner;

public abstract class Animal {
    public String name;
    public String gender;
    public String age;
    public String weight;
    public String color;
    Scanner scanner = new Scanner(System.in);
     public abstract void eat(String food);
     public abstract float run(float speed);
     public abstract float sleep(float hours);
     public void input(){
         System.out.println("Nhap ten:");
         name= scanner.nextLine();
         System.out.println("Nhap gioi tinh:");
         gender= scanner.nextLine();
         System.out.println("Nhap tuoi:");
         age= scanner.nextLine();
         System.out.println("Nhap can nang:");
         weight = scanner.nextLine();
         System.out.println("Nhap mau:");
         color = scanner.nextLine();


     }
     public String toString(){
         return name+" "+gender+" "+age+" "+weight+" "+color;
     }
}
