package Java111.buoi5;

public class Student {
    public int masv;
    public String hoten;
    public float dlt;
    public float dth;
    public Student(){
        System.out.println("Goi toi constructor");
    }
    public Student(int masv, String hoten, float dlt, float dth) {
        this.masv = masv;
        this.hoten = hoten;
        this.dlt = dlt;
        this.dth = dth;
        
    }
    public void output() {
        System.out.println("Masv:"+masv);
        System.out.println("Hoten:"+hoten);
        System.out.println("Diemlt:"+dlt);
        System.out.println("Diemth:"+dth);

    }
    public void average(){
        System.out.println("Diem trung binh:"+(dlt+dth)/2);
    }

}
