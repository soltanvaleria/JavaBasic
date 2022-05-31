import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Guzun", "Andrea", 10000);
        Employee emp2 = new Employee("Ursu", "Vera", 8000);

        System.out.printf("%s %s has a salary of %.2f lei per month%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getSalary());
        System.out.printf("%s %s has a salary of %.2f lei per month%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getSalary());
        System.out.printf("%s %s has a salary of %.2f lei per year%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s has a salary of %.2f lei per year%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
        System.out.println("Enter the raise of the salary in %");
        Scanner input = new Scanner(System.in);
        double raiseAmount = input.nextDouble();
        emp1.raise(raiseAmount);
        emp2.raise(raiseAmount);
        System.out.printf("%s %s has a salary of %.2f lei per year%n",
                emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s has a salary of %.2f lei per year%n",
                emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}