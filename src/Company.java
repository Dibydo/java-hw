import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private List<Operator> employeeList = new ArrayList<>();
    int moneyCounter = 0;
    private String companyName;

    public void hire(Operator operator) {
        employeeList.add(operator);
        operator.setPlaceOfWork(this);
        System.out.println("Successfully hired " + operator.getName());
    }

    public void hireAll(List<Operator> hireList) {
        employeeList.addAll(hireList);
        for (Operator operator : hireList) {
            operator.setPlaceOfWork(this);
            System.out.println("Successfully hired " + operator.getName());
        }
    }

    public void fire(Operator operator) {
        employeeList.remove(operator);
        operator.setPlaceOfWork(null);
        System.out.println("Successfully fired " + operator.getName());
    }

    public int getIncome() {
        for (int i = 0; i < employeeList.size(); i++) {
            moneyCounter += employeeList.get(i).getMonthlySalary();
        }
        return moneyCounter;
    }

    public List<Operator> getTopSalaryStaff(int count) {

        Collections.sort(employeeList);
        int arListSize = employeeList.size();
        List<Operator> topPaid = new ArrayList<>();

        for (int i = employeeList.size() - 1; i > employeeList.size() - 1 - count ; i--) {
            topPaid.add(employeeList.get(i));
        }

        return topPaid;
    }

    public List<Operator> getLowestSalaryStaff(int count) {

        Collections.sort(employeeList);
        int arListSize = employeeList.size();
        List<Operator> leastPaid = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            leastPaid.add(employeeList.get(i));
        }

        return leastPaid;
    }

    public List<Operator> getEmployeeList() {
        return employeeList;
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }
}
