package Java111.buoi6;

import java.util.Scanner;

public class Nhanvien {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private String phoneNum;
    private String email;
    private int luongcb;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getluongcb() {
        return luongcb;
    }

    public void setluongcb(int luongcb) {
        this.luongcb = luongcb;
    }
    public void input(){
        System.out.println("Nhap ma nhan vien:");
        id = scanner.nextInt();
        System.out.println("Nhap ten nhan vien:");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien:");
        age = scanner.nextInt();
        System.out.println("Nhap so dien thoai:");
        phoneNum = scanner.nextLine();
        System.out.println("Nhap email:");
        email = scanner.nextLine();
        System.out.println("Luong co ban:");
        luongcb = scanner.nextInt();
    }

    
}
