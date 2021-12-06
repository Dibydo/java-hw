public class TopManager extends Operator {
    private int salary;
    private int companyIncome;

    private int WANTED_INCOME = 10000000;
    private int BASE_SALARY = 100000;

    public TopManager(String name) {
        super(name);
        salary = BASE_SALARY;
    }

    public int getMonthlySalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Salary: " + salary + " rub." + "\n";
    }
}
