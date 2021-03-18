package Java111.buoi10;

public class test{
    public static void main(String[] args) {
        try {
            int a=0; 
            int b= 5;
            int c=b/a;

        }
        catch(Exception e){
            System.out.println("Code lỗi rồi :((");
        }
        finally{
            System.out.println("Khối lệnh này hơi non:)");
        }
    }
}