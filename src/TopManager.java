public class TopManager extends Operator {
    private int salary;
    private int companyIncome;


    public TopManager(String name, Company company) {
        super(name);
        this.placeOfWork = company;
        companyIncome = placeOfWork.getIncome();
        if (companyIncome >= 10000000) {
            salary = (int) (2.5 * 100000);
        } else {
            salary = 100000;
        }
    }
    public int getMonthlySalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Зарплата: " + this.salary + "\n";
    }
}
