package SRP;

import java.util.List;

public class Chief {
    private int workHourEmp = 10;

    public void workHourEmp(List<Employee> employee){
        
        for (int i = 0; i < employee.size(); i++) {
            System.out.printf(String.format("%s отработал %d часов\n", employee.get(i).getName(),workHourEmp));        
        }
    }

}
