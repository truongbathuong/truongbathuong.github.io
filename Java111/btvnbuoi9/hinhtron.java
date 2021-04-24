package Java111.btvnbuoi9;

public class hinhtron extends hinhhoc implements duongkinh{
    private double r;
    public hinhtron(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double getcv() {
        // TODO Auto-generated method stub
        return getR()*2*3.14;
    }
    @Override
    public double getdt() {
        // TODO Auto-generated method stub
        return getR()*getR()*3.14;
    }
    @Override
    public double getduongkinh() {
        // TODO Auto-generated method stub
        return getR()*2;
    }
    public void input(){
        System.out.println("duong kinh hinh tron la:"+this.getduongkinh());
        System.out.println("chu vi hinh tron la:"+this.getcv());
        System.out.println("dien tich hinh tron la:"+this.getdt());
    }

}

