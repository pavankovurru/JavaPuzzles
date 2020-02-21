package Data;

public class EmployeeAddress {


    private final String address;
    private final int age;
    private final EmployeeSalary employeesalary;


    public EmployeeAddress(String  address , int age , double salary , int experience){
        this.address = address;
        this.age = age;
        employeesalary = new EmployeeSalary(salary, experience);
    }


    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    public EmployeeSalary getEmployeeSalaryObject(){
        return employeesalary;
    }
}
