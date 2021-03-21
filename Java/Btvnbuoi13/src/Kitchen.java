public class Kitchen extends Employer{

    private double serviceCharge;

    public Kitchen(String id, String name, int age, double basicsalary, double serviceCharge) {
        super(id, name, age, basicsalary);
        this.serviceCharge = serviceCharge;
    }



    @Override
    protected double calculatorsalary() {
        return serviceCharge + calculatorsalary();
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "serviceCharge=" + serviceCharge +
                '}';
    }
}
