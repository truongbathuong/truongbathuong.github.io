import java.io.IOException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Team fteam = new Team();

            System.out.println("Nhap 1 de chon dh 4-4-2 \nNhap 2 de chon dh 3-5-2 \nNhap 3 de chon dh 4-3-3");
            int out = scanner.nextInt();
            switch (out) {
                case 1:
                    fteam.buildTeam(4,4,2);
                    break;
                case 2:
                    fteam.buildTeam(3,5, 2);
                    break;
                case 3:
                    fteam.buildTeam(4 ,3, 3);
                    break;



            }
        }
    }

