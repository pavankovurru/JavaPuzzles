package Data;

public class EmployeeSalary {

    private final double salary;
    private final int experience;

    public EmployeeSalary(double salary, int experience){
        this.salary = salary;
        this.experience = experience;
    }

    public Double getSalary(){
        return salary;
    }

    public int getExperience(){
        return experience;
    }
}
