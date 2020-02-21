package Data;

public class Test {
  public static void main(String[] args) {


      EmployeeAddress addressNew = new EmployeeAddress("123 street" , 31 ,12000.00,10);

      System.out.println(addressNew.getAddress());
      System.out.println(addressNew.getAge());
      System.out.println(addressNew.getEmployeeSalaryObject().getSalary());
      System.out.println(addressNew.getEmployeeSalaryObject().getExperience());
  }
}
