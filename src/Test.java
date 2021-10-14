public class Test {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(new EmploeeFactory().generateEmployees(10));
        employeeService.printEmployees();
        System.out.println("++++++++++++++++++");
        System.out.printf("%.2f", employeeService.calculateSalaryAndBonus());
        System.out.println();
        System.out.println('\n' + employeeService.getById(2).getName());
       Employee[] employees = employeeService.getByName("Ivan");
        for (Employee employee : employees) {
            System.out.println(employee.getName() +" salary = " + employee.getSalary());
        }
        employeeService.sortByName();
        employeeService.sortByNameAndSalary();
        employeeService.printEmployees();

        Employee employee = new Employee(2, "Misha", 1000, "male", 40, 0.5);
        employeeService.edit(employee);
        employeeService.printEmployees();
        employeeService.remove(2);
        System.out.println("=======================");
        employeeService.printEmployees();

    }




}
