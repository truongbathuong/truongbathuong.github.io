package Java111.btvnbuoi9;

public class hinhchunhat extends hinhhoc implements duongcheo{
    private double cd;
    private double cr;
    public double getCd() {
        return cd;
    }
    public void setCd(double cd) {
        this.cd = cd;
    }
    public double getCr() {
        return cr;
    }
    public void setCr(double cr) {
        this.cr = cr;
    }
    public hinhchunhat(double cd, double cr){
        this.cd = cd;
        this.cr = cr;
    }
    @Override
    public double getcv() {
        // TODO Auto-generated method stub
        return (getCd()+getCr())*2;
    }
    @Override
    public double getdt() {
        // TODO Auto-generated method stub
        return getCd()*getCr();
    }
    @Override
    public double getduongcheo() {
        // TODO Auto-generated method stub
        return Math.sqrt(getCd()*getCd()+getCr()*getCr());
    }
    public void output(){
        System.out.println("duong cheo hinh chu nhat la:"+this.getduongcheo());
        System.out.println("chu vi hinh chu nhat la:"+this.getcv());
        System.out.println("dien tich hinh chu nhat la:"+this.getdt());

    }

   
    
}
