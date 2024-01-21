package SRP;

import java.util.List;

public class NetSalary {
    private int baseSalary = 100000;


    public int calculateNetSalary(int baseSalary) {
        int tax = baseSalary/4;
        int sumsal = baseSalary - tax;
        return sumsal;
    }
    
    public void baseSalaryEmp(List<Employee> employee){
        int netSal = calculateNetSalary(baseSalary);
        for (int i = 0; i < employee.size(); i++) {
            System.out.printf("%s заработал %d рублей\n", employee.get(i).getName(), netSal);         
        }
    }
}