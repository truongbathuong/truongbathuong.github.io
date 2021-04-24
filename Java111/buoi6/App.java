package Java111.buoi6;

import java.util.Scanner;

public class App {


    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien:");
        int n = scanner.nextInt();
        try{
            if(n<0) throw new Exception("nhan vien khong duoc nho hon 0");
            System.out.println("So nhan vien vua nhap:"+n);
        }catch(Exception e){
            System.out.println("Non");
        }
        Nhanvien nhanvien[] = new Nhanvien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin lap trinh vien");
            System.out.println("chon loai nhan vien: \nChon 1: Lap trinh vien \nChon 2: Kiem chung vien");
            int choose = scanner.nextInt();
            if(choose ==1){
                nhanvien[i] = new LTV();
            }
            else if(choose==2){
                nhanvien[i]= new Tester();
            }
            nhanvien[i].input();
        }


        // LTV dev = new LTV();
        // System.out.println("Lap trinh vien");
        // System.out.println("Nhap ma nhan vien : ");
        // int id1 = Integer.valueOf(scanner.nextLine());
        // dev.setId(id1);
        // System.out.println("Nhap ho ten: ");
        // String name1 = scanner.nextLine();
        // dev.setName(name1);
        // System.out.println("Nhap tuoi: ");
        // int age1 = Integer.valueOf(scanner.nextLine());
        // dev.setAge(age1);
        // System.out.println("Nhap so dien thoai: ");
        // String phoneNum1 = scanner.nextLine();
        // dev.setPhoneNum(phoneNum1);
        // System.out.println("Nhap email: ");
        // String email1 = scanner.nextLine();
        // dev.setEmail(email1);
        // System.out.println("Nhap luong co ban");
        // int luongcb1 = scanner.nextInt();
        // dev.setluongcb(luongcb1);
        // System.out.println("Nhap so gio lam them");
        // int overtime1 = scanner.nextInt();
        // dev.setOvertime(overtime1);
        // int luongcbDev1 = dev.luongDev();
        // System.out.printf("%2s %10s %3s %10s %10s %15s %3s %15s \n", "Id", "Hoten", "Tuoi", "SDT", "Email",
        //         "Luong co ban", "Gio lam them", "Luong nhan duoc");
        // System.out.printf("%2d %10s %3d %10s %10s %15d %3d %15d \n", id1, name1, age1, phoneNum1, email1, luongcb1,
        //         overtime1, luongcbDev1);
        // Tester tester1 = new Tester();
        // System.out.println("Kiem chung vien");
        // System.out.println("Nhap ma nhan vien : ");
        // int id2 = scanner.nextInt();
        // scanner.nextLine();
        // tester1.setId(id2);
        // System.out.println("Nhap ho ten: ");
        // String name2 = scanner.nextLine();
        // tester1.setName(name2);
        // System.out.println("Nhap tuoi: ");
        // int age2 = Integer.valueOf(scanner.nextLine());
        // tester1.setAge(age2);
        // System.out.println("Nhap so dien thoai: ");
        // String phoneNum2 = scanner.nextLine();
        // tester1.setPhoneNum(phoneNum2);
        // System.out.println("Nhap email: ");
        // String email2 = scanner.nextLine();
        // tester1.setEmail(email2);
        // System.out.println("Nhap luong co ban");
        // int luongcb2 = scanner.nextInt();
        // tester1.setluongcb(luongcb2);
        // System.out.println("Nhap so loi tim duoc");
        // int bug1 = scanner.nextInt();
        // tester1.setBug(bug1);
        // int luongTester1 = tester1.luongTester();
        // System.out.printf("%2s %10s %3s %10s %10s %15s %3s %15s \n", "Id", "Hoten", "Tuoi", "SDT", "Email",
        //         "Luong co ban", "So loi tim duoc", "Luong nhan duoc");
        // System.out.printf("%2d %10s %3d %10s %10s %15d %3d %15d \n", id2, name2, age2, phoneNum2, email2, luongcb2,
        //         bug1, luongTester1);

        // scanner.close();

    }
}
