import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Operator> employeeList = new ArrayList<>();
    int moneyCounter = 0;
    private String companyName;

    public int getIncome() {
        for (int i = 0; i < employeeList.size(); i++) {
            moneyCounter += employeeList.get(i).getMonthlySalary();
        }
        return moneyCounter;
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }
}
