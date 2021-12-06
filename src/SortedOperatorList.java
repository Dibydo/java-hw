import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedOperatorList {
    private List<Operator> operatorList = new ArrayList<>();

    public int size() {
        return operatorList.size();
    }

    public Operator get(int i) {
        return operatorList.get(i);
    }

    public SortedOperatorList(List<Operator> operatorList) {
        this.operatorList = operatorList;
        Collections.sort(this.operatorList);
    }
}
