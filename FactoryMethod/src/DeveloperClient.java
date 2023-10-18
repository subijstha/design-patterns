public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        int salary1 = employee.getSalary();
        System.out.println(salary1);

        Employee employee1 = EmployeeFactory.getEmployee("Ios Developer");
        int salary2 = employee1.getSalary();
        System.out.println(salary2);

        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        int salary3 = employee2.getSalary();
        System.out.println(salary3);

    }
}