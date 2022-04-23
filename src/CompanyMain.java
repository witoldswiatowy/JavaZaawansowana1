import company.Employee;
import company.Manager;
import company.Secratary;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200,10);
        Manager employeeTwo = new Manager("Bogdan", 250, 50, 50);
        Secratary employeeThree = new Secratary("Ala", 230, 33);

//        employeeOne.age = 50;
        employeeOne.show();
        employeeTwo.show();
        employeeThree.show();

        Employee emplyeefour = new Manager("Ola", 250, 50, 44);
        System.out.println(emplyeefour.getSalary());
//        emplyeefour.makeSp

        System.out.println("KOLEJNE DZIALANIA KOMPOZYCJA");
        System.out.println();

        Employee [] employees = new Employee[3];
        employees[0] = employeeOne;
        employees[1] = employeeTwo;
        employees[2] = employeeThree;

        for (Employee e : employees){
            e.show();
            int emplyeeSalary = e.getSalary();
            System.out.println(emplyeeSalary); //tutaj róznica jest u Bogdana z 250 i 300
        }

        employeeTwo.makeCall("123-123-123");
        employeeTwo.setSecratary(employeeThree);
        employeeTwo.makeCall("123-123-123");

        CompanyMain.displayInformation(employeeOne);
        displayInformation(employeeOne);

    }

    public static void displayInformation (Employee employee){
        System.out.println();
        System.out.println("Teraz przedstawia się nowy pracownik");
        employee.show();
    }
}
