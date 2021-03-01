package Java111.buoi6;

public class Tester extends Nhanvien {
    private int bug;
    public void setBug(int bug){
        this.bug = bug;
    }
    public int getBug(){
        return bug;
    }
    public int luongTester(){
        return (getluongcb()+bug*50000);
    }
}
