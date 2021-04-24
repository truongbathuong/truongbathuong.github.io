package Java111.buoi8;

class Pets extends Animal{
@Override
public void eat(String food) {
    // TODO Auto-generated method stub
    System.out.println(this.name + "eat" +food);

}
@Override
public float run(float speed) {
    // TODO Auto-generated method stub
    
    System.out.println("Nhap toc do:");
    return speed;
}
@Override
public float sleep(float hours) {
    // TODO Auto-generated method stub
    
    System.out.println("Nhap so h:");
    return hours;
}
@Override
public void input() {
    // TODO Auto-generated method stub
    super.input();

}
@Override
public String toString(){
    return super.toString();
}  
}
