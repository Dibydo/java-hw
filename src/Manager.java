import java.util.concurrent.ThreadLocalRandom;

public class Manager extends Operator {

    private int salary;

    private int BASE_SALARY = 80000;
    private int LOW_EARN = 115000;
    private int HIGH_EARN = 140000;

    public Manager(String name) {
        super(name);
        setSalary();
    }

    private void setSalary() {
        salary = (int) (BASE_SALARY + 0.05 * ThreadLocalRandom.current().nextInt(LOW_EARN, HIGH_EARN + 1));
    }

    public int getMonthlySalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Salary: " + salary + " rub." + "\n";
    }
}
