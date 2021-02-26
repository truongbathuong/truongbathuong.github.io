package buoi5;

import buoi5.Student;

public class Person {
    public static void main(String[] args) {
        Student sv1 = new Student();
        sv1.masv  = 113;
        sv1.hoten = "Duong";
        sv1.dlt = 8.0f;
        sv1.dth = 8.0f;
        sv1.output();
        sv1.average();
        Student sv2 = new Student();
        sv2.masv  = 114;
        sv2.hoten = "Qua";
        sv2.dlt = 7.5f;
        sv2.dth = 8.0f;
        sv2.output();
        sv2.average();
        Student sv3 = new Student();
        sv3.masv  = 115;
        sv3.hoten = "Quan";
        sv3.dlt = 6.5f;
        sv3.dth = 8.5f;
        sv3.output();
        sv3.average();

        Student sv4 = new Student(119,"Linh",7.0f,8.0f);
        sv4.output();
        sv4.average();
    }
}
