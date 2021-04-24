package Java111.buoi8;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguoi:");
        int n = sc.nextInt();
        PhoneBook[] phone1 = new PhoneBook[n];
        for(int i=0;i<1;i++){
            phone1[i].input();
        
        }
        for(int i=0;i<n;i++){
            System.out.println(phone1[i].toString());
        }
    }
    
     public static void editPhoneNumber(int n, String id, String name, PhoneBook phone1[]){
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<n;i++){
                if(name.equals(phone1[i].getName())){
                    System.out.println("Nhap so dien thoai moi:");
                    String newPhone = sc.nextLine();
                    phone1[i].setPhoneNumber(newPhone);
                }
            }
        }
    public static int deleteContact(int n, PhoneBook phone1[], String name) {
        for(int i=0;i<n;i++){
            if(name.equals(phone1[i].getName())){
                phone1[i]=phone1[i+1];
            }
        }
        return n-1;
    
        
    

}
}
    

