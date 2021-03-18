import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class bai1 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File myFile = new File("D:\\frontend\\HTML\\Java111\\camp\\text1.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile);
        System.out.println("Nhap so tu ban phim(Nhap X hoac Q de thoat khoi chuong trinh)");
        String input = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            if (input.equals("X") || input.equals("Q")) {
                break;
            } else if (input.matches(".*[^0-9].*")) {
                System.out.println("n khong phai la so");
                fileWriter.write("n khong phai la so");

            } else {
                int b = Integer.parseInt(input);
                if (isPrimeNumber(b)) {
                    System.out.println(b + " la so nguyen to:");
                    fileWriter.write(b + "la so nguyen to");
                }else{
                    System.out.println(b + " khong la so nguyen to:");
                    fileWriter.write(b + "khong la so nguyen to");
                }
            }
        }
    }
}

