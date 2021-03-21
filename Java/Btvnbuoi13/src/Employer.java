public abstract class Employer {
    private String id;
    private String name;
    private int age;
    private double basicsalary;

    public Employer(String id, String name, int age, double basicsalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicsalary = basicsalary;
    }
 protected abstract double calculatorsalary();

    @Override
    public String toString() {
        return "Employer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicsalary=" + basicsalary +
                '}';
    }
}
