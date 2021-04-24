package Java111.buoi8;

import java.util.Scanner;

public class PhoneBook extends Phone{
    Scanner sc = new Scanner(System.in);
    public String id;
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap id:");
        id = sc.nextLine();
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
    }
    
