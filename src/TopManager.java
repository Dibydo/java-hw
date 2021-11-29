public class TopManager extends Operator {
    private int salary;
    private int companyIncome;

    private final int WANTED_INCOME = 10000000;
    private final int BASE_SALARY = 100000;

    public TopManager(String name, Company company) {
        super(name);
        placeOfWork = company;
        company.hire(this);
        companyIncome = placeOfWork.getIncome();
        if (companyIncome >= WANTED_INCOME) {
            salary = (int) (2.5 * BASE_SALARY);
        } else {
            salary = BASE_SALARY;
        }
    }

    public int getMonthlySalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Зарплата: " + salary + " руб." + "\n";
    }
}
