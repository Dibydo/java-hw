public class Operator implements Comparable<Operator> {

    private int salary;
    protected String name;
    public Company placeOfWork;

    private int BASE_SALARY = 80000;

    public Operator(String name) {
        this.name = name;
        salary = BASE_SALARY;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Name: " + name + " Salary: " + salary + " rub." + "\n";
    }

    @Override
    public int compareTo(Operator o) {
        if (this.getMonthlySalary() > o.getMonthlySalary()) {
            return 1;
        } else if (this.getMonthlySalary() < o.getMonthlySalary()) {
            return -1;
        }
        return 0;
    }
}
