package Java111.buoi8;

import java.util.Scanner;

public abstract class Phone {
    private String name;
    private String phoneNumber;
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ten:");
        name = scanner.nextLine();
        System.out.println("Nhap so dien thoai:");
        phoneNumber = scanner.nextLine();
    }
    public String toString(){
        return name+" "+phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
