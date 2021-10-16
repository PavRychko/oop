public class Test {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(new EmployeeFactory().generateEmployees(10));
         employeeService.printEmployees();
//        System.out.printf("%.2f", employeeService.calculateSalaryAndBonus());
//        System.out.println("\n" + employeeService.getById(2).getName());
//        for (Employee employee : employeeService.getByName("Ivan")) {
//            System.out.println(employee.getName());
//        }
//        employeeService.sortByName();
//        employeeService.printEmployees();
        System.out.println("================");
//        employeeService.sortByNameAndSalary();
//        employeeService.printEmployees();
        Designer designer = new Designer(11, "Oleg", 1500, "male", 2.3, 20);
//        employeeService.edit(designer);
//        employeeService.remove(1);
        employeeService.add(designer);
        employeeService.printEmployees();
    }




}
