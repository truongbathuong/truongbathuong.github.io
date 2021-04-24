package Java111.buoi6;

public class LTV extends Nhanvien{

 private int overtime;
    public void setOvertime(int overtime){
        this.overtime = overtime;
    }
    public int getOvertime(int overtime){
        return overtime;
    }
    public int luongDev(){
        return (getluongcb()+ overtime *2000000);
    }
    
}
