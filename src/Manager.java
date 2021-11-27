import java.util.concurrent.ThreadLocalRandom;

public class Manager extends Operator {

    private int salary = (int) (80000 * 0.05 * ThreadLocalRandom.current().nextInt(115000, 140000 + 1));

    public Manager(String name, Company placeOfWork) {
        super(name, placeOfWork);
    }

    public int getMonthlySalary() {
        return salary;
    }
}
