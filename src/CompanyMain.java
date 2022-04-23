import company.Employee;
import company.Manager;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200,10);
        Manager employeeTwo = new Manager("Bogdan", 250, 50, 50);

//        employeeOne.age = 50;
        employeeOne.show();
        employeeTwo.show();
    }
}
