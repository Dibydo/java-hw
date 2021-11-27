public class Operator {

    private int salary = 80000;
    private String name;
    public Company placeOfWork;

    public Operator(String name, Company placeOfWork) {
        this.name = name;
        this.placeOfWork = placeOfWork;
    }

    public Company getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(Company placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMonthlySalary() {
        return salary;
    }

}
