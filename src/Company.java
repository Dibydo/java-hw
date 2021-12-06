import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Company {

    private List<Operator> employeeList = new ArrayList<>();
    int moneyCounter = 0;
    private String companyName;

    private int WANTED_INCOME = 10000000;

    public void hire(Operator operator) {
        employeeList.add(operator);
        operator.setPlaceOfWork(this);
        System.out.println("Successfully hired " + operator.getName());
    }

    public void hire(TopManager topManager) {
        employeeList.add(topManager);
        topManager.setPlaceOfWork(this);
        if (this.getIncome() >= WANTED_INCOME) {
            topManager.setSalary((int) (topManager.getMonthlySalary() * 2.5));
        }
        System.out.println("Successfully hired " + topManager.getName());
    }

    public void hireAll(List<Operator> hireList) {
        employeeList.addAll(hireList);
        for (Operator operator : hireList) {
            operator.setPlaceOfWork(this);
            System.out.println("Successfully hired " + operator.getName());
        }
    }

    public void fire(Operator operator) {
        if (employeeList.contains(operator)) {
            employeeList.remove(operator);
            operator.setPlaceOfWork(null);
            System.out.println("Successfully fired " + operator.getName());
        } else {
            System.out.println("Operator " + operator.getName() + " isn't hired by " + companyName);
        }
    }

    public int getIncome() {
        for (int i = 0; i < employeeList.size(); i++) {
            moneyCounter += employeeList.get(i).getMonthlySalary();
        }
        return moneyCounter;
    }

    public List<Operator> getTopSalaryStaff(int count) {

        SortedOperatorList sortedEmployeeList = new SortedOperatorList(employeeList);
        List<Operator> topPaid = new ArrayList<>();

        System.out.println("List of " + count + " highest salaries");
        for (int i = sortedEmployeeList.size() - 1; i > sortedEmployeeList.size() - 1 - count; i--) {
            topPaid.add(sortedEmployeeList.get(i));
        }

        return topPaid;
    }

    public List<Operator> getLowestSalaryStaff(int count) {

        SortedOperatorList sortedEmployeeList = new SortedOperatorList(employeeList);
        List<Operator> leastPaid = new ArrayList<>();

        System.out.println("List of " + count + " lowest salaries");
        for (int i = 0; i < count; i++) {
            leastPaid.add(sortedEmployeeList.get(i));
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
