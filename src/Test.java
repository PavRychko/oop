public class Test {

    public static void main(String[] args) {
//        EmployeeService employeeService = new EmployeeService(new EmployeeFactory().generateEmployees(10));
//         employeeService.printEmployees();
////        System.out.printf("%.2f", employeeService.calculateSalaryAndBonus());
////        System.out.println("\n" + employeeService.getById(2).getName());
////        for (Employee employee : employeeService.getByName("Ivan")) {
////            System.out.println(employee.getName());
////        }
////        employeeService.sortByName();
////        employeeService.printEmployees();
//        System.out.println("================");
////        employeeService.sortByNameAndSalary();
////        employeeService.printEmployees();
//        Designer designer = new Designer(11, "Oleg", 1500, "male", 2.3, 20);
////        employeeService.edit(designer);
////        employeeService.remove(1);
//        employeeService.add(designer);
//        employeeService.printEmployees();
//        calculateSalaryAndBonusTest();
       // getByIdTest();
//        getByNameTest();
//        sortByNameTest();
    }



public static void calculateSalaryAndBonusTest(){
    Designer designer = new Designer(1, "Oleg", 1500, "male", 2.3, 20);
    Developer developer = new Developer(2, "Oleg", 1500, "male", 20);
    Manager manager = new Manager(3, "Oleg", 1500, "male");
    Employee[] employees = {designer, developer, manager};
    EmployeeService employeeService = new EmployeeService(employees);
    double expected = designer.getSalaryWithBonuses() + developer.getSalaryWithBonuses()+ manager.getSalary();
    double actual = employeeService.calculateSalaryAndBonus();
    if( expected != actual){
        System.out.println(" Test #1 calculate salary failed! Expected = "+ expected + " actual = " + actual);
        return;
    }
    System.out.println(" Test #1 calculate salary passed! Expected = "+ expected + " actual = " + actual);
}

public  static EmployeeService employeeServiceForTest(){
    Designer designer = new Designer(1, "Oleg", 300, "male", 2.3, 20);
    Developer developer = new Developer(2, "Danil", 200, "male", 20);
    Manager manager = new Manager(3, "Petya", 1000, "male");
    Manager manager2 = new Manager(4, "Petya", 1500, "male");
    Employee[] employees = {designer, developer, manager, manager2};
    return  new EmployeeService(employees);


}

    public static void getByIdTest() {
        EmployeeService employeeService  = employeeServiceForTest();
        Employee expected = employeeService.getEmployees()[0];
        Employee actual = employeeService.getById(1);
        assertEquals("2" , expected, actual);
    }

    public static void  getByNameTest(){
        EmployeeService employeeService  = employeeServiceForTest();
        Employee[] expected = {employeeService.getEmployees()[2], employeeService.getEmployees()[3]};
        Employee[] actual =  employeeService.getByName("Petya");
        assertEquals("3.1", expected[0], actual[0]);
        assertEquals("3.2", expected[1], actual[1]);

    }

    public static void assertEquals(String testNum, Object expected, Object actual){
        if (!expected.equals(actual)) {
            System.out.println(" Test # " + testNum+ " Failed! Expected = " + expected + " actual = " + actual);
            return;
        }
        System.out.println(" Test # " + testNum+  " Passed! Expected = " + expected+ " actual = " + actual);
    }

//    public static void sortByNameTest(){
//        EmployeeService employeeServiceForExpected = employeeServiceForTest();
//        EmployeeService employeeServiceForActual = employeeServiceForTest();
//        Employee[] employeesExpected = employeeServiceForExpected.getEmployees();
//        Employee [] employeesActual = employeeServiceForActual.getEmployees();
//        employeeServiceForActual.sortByName();
//        assertEquals("4.1", employeesExpected[1], employeesActual[0]);
//        assertEquals("4.2", employeesExpected[0], employeesActual[1]);
//        assertEquals("4.3", employeesExpected[2], employeesActual[2]);
//        assertEquals("4.4", employeesExpected[3], employeesActual[3]);
//
//  необхідно переробити
//    }
}
