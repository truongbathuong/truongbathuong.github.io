package Java111;
import java.util.Scanner;
import java.util.*;
public class giaithua {

	public static void main(String []args)
    {	
    	int j=1;
    	Scanner in = new Scanner(System.in);
    	System.out.println("Hay nhap vao 1 so: ");
    	int n=in.nextInt();
    	for(int i=1;i<=n;i++)
    	j*=i;
    	System.out.println("Giai thua cua "+n+" la "+j);
    
    }
}

