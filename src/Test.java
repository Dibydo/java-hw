import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Company BMSTU = new Company("МГТУ им. Баумана");

        List<Operator> whoToHire = new ArrayList<>();
        Operator oper1 = new Operator("Леонид");
        Operator oper2 = new Operator("Сергей");
        Operator oper3 = new Operator("Олег");
        Operator oper4 = new Operator("Михаил");
        Operator oper5 = new Operator("Алёна");
        Operator oper6 = new Operator("Анна");
        Operator oper7 = new Operator("Вероника");
        Operator oper8 = new Operator("Татьяна");
        Manager manager1 = new Manager("Борислав");
        Manager manager2 = new Manager("Влад");
        Manager manager3 = new Manager("Степан");
        Manager manager4 = new Manager("Илья");
        Manager manager5 = new Manager("Кирилл");
        TopManager tManager1 = new TopManager("Максим", BMSTU);
        TopManager tManager2 = new TopManager("Евгений", BMSTU);
        TopManager tManager3 = new TopManager("Егор", BMSTU);
        whoToHire.add(oper1);
        whoToHire.add(oper2);
        whoToHire.add(oper3);
        whoToHire.add(oper4);
        whoToHire.add(oper5);
        whoToHire.add(oper6);
        whoToHire.add(oper7);
        whoToHire.add(oper8);
        whoToHire.add(manager1);
        whoToHire.add(manager2);
        whoToHire.add(manager3);
        whoToHire.add(manager4);
        whoToHire.add(manager5);

        BMSTU.hireAll(whoToHire);

        System.out.println("Заработок компании: " + BMSTU.getIncome());

        System.out.println(BMSTU.getEmployeeList());

        List<Operator> low = BMSTU.getLowestSalaryStaff(5);
        System.out.println(low);

        List<Operator> top = BMSTU.getTopSalaryStaff(7);
        System.out.println(top);

        BMSTU.fire(oper1);
        BMSTU.fire(manager1);
        BMSTU.fire(tManager1);
    }
}
