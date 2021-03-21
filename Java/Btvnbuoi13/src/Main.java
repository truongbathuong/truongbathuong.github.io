import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printArray(List<? extends Employer> list1){
        list1.forEach(employer -> System.out.println(employer));

    }

    public static void main(String[] args) {
        List<Employer> employerss = Arrays.asList(
                new Waiter("w1", "Truong Ba Thuong", 21, 2000000, 200000),
                new Waiter("w2", "Tran Duc Bo", 26, 2500000, 80000),
                new Waiter("w3", "Nguyen Van Hoan", 22, 2900000, 90000),
                new Kitchen("k1", "Bui Ba Dao", 23, 3100000, 370000),
                new Kitchen("k2", "Nguyen Tran Linh", 19, 2500000, 270000),
                new Kitchen("k3", "Nguyen Hoang Thanh", 28, 2600000, 150000));
        
printArray(employerss);
    }
}
