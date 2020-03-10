package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorDemo {
    Comparator<employee> employeeIdComparator = new Comparator<employee>() {
        @Override
        public int compare(employee o1, employee o2) {
            if(o1.getId()==o2.getId()){
                return 0;
            }else if(o1.getId()>o2.getId()){
                return 1;
            }else {
                return -1;
            }
        }
    };

    List<employee> employees = new ArrayList<>();

    public void sortDemo(){
        employees.add(new employee(1));
        employees.add(new employee(2));

        Collections.sort(employees,employeeIdComparator);
    }
}
