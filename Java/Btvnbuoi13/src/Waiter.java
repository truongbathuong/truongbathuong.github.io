public class Waiter extends Employer{
    private double compensate;

    public Waiter(String id, String name, int age, double basicsalary, double compensate) {
        super(id, name, age, basicsalary);
        this.compensate = compensate;
    }

    @Override
    protected double calculatorsalary() {
        return compensate + calculatorsalary();
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "compensate=" + compensate +
                '}';
    }
}
