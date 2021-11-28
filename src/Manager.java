import java.util.concurrent.ThreadLocalRandom;

public class Manager extends Operator {

    private int salary = (int) (80000 + 0.05 * ThreadLocalRandom.current().nextInt(115000, 140000 + 1));

    public Manager(String name) {
        super(name);
    }

    public int getMonthlySalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Зарплата: " + this.salary + "\n";
    }
}
