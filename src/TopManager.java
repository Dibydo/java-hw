public class TopManager extends Operator {
    private int salary;
    private int companyIncome = placeOfWork.getIncome();


    public TopManager(String name, Company placeOfWork) {
        super(name, placeOfWork);
        if (companyIncome >= 10000000) {
            salary = (int) (2.5 * 80000);
        } else {
            salary = 80000;
        }
    }
    public int getMonthlySalary() {
        return salary;
    }
}
