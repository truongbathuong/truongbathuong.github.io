package Java111.buoi9;

public class Employee implements IEmployee {
    @Override
    public int calculatorSalary() {
        return 0;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    private String name;

    private int paymentPerHour;
    

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }


}