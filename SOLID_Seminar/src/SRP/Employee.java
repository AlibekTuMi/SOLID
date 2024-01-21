package SRP;


public class Employee {
    private String name;
    private String birthday;
    

    public Employee(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;  
    }

    public String getEmpInfo() {
        return "name - " + name + " , birthday - " + birthday.toString();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

  
}