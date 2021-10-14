public class EmployeeService {

    Employee[] employees;

    EmployeeService(Employee[] employees){
        this.employees = employees;
    }


    void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.print("id = " + employees[i].getId() +
                    " name = " + employees[i].getName() +
                    " salary = " + employees[i].getSalary() +
                    " gender = " + employees[i].getGender() +
                    " fixedBugs = " + employees[i].getFixedBugs() + " bugRate = ");
            System.out.printf("%.2f", employees[i].getDefaultBugRate());
            System.out.println();
        }
    }

        double calculateSalaryAndBonus(){
            double sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary() + employee.calculateBonus();
            }
            return sum;
        }

    Employee getById(long id){
        for (Employee employee : employees) {
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }


    Employee[] getByName(String name){
        int counter = 0;
        for (Employee employee : employees) {
            if (name.equals(employee.getName())) {
                counter++;
            }
        }
        Employee[] empl = new Employee[counter];
        if(counter != 0){
            for (int i = employees.length - 1; i >= 0 ; i--) {
                if (name.equals(employees[i].getName()))
                    empl[counter - 1] = employees[i];
                counter--;
            }
            }
            return  empl;
        }

    Employee[] sortByName(){
        Employee tempEmployee;
        int counter = -1;
        while (counter !=0) {
            counter = 0;
            for (int i = 0; i < employees.length - 1; i++) {
                int temp = employees[i].getName().compareTo(employees[i + 1].getName());
                if (temp > 0) {
                  counter ++;
                    tempEmployee = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = tempEmployee;
                }
            }

        }
        return employees;
        }

    Employee[] sortByNameAndSalary() {
        EmployeeService empService = new EmployeeService(employees);
        Employee[] employ = empService.sortByName();
        Employee tempEmployee;
        int counter = -1;
        while (counter != 0) {
            counter = 0;
            for (int i = 0; i < employ.length - 1; i++) {
                if (employ[i].getName().equals(employ[i+1].getName()) && employ[i].getSalary() > employ[i + 1].getSalary()) {
                    counter++;
                    tempEmployee = employ[i];
                    employ[i] = employ[i + 1];
                    employ[i + 1] = tempEmployee;
                }
            }
        }
        return employ;
    }

    Employee edit(Employee employee){
       long id = employee.getId();
       Employee old = getById(id);
        for (int i = 0; i < employees.length; i++) {
            if(old.getId() == employees[i].getId()){
                employees[i] = employee;
            }
        }
       return old;
    }

    Employee remove(long id){
       Employee employeeToRemove = getById(id);
        Employee[] newEmployees = new Employee[employees.length-1];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if(!employees[i].equals(employeeToRemove)){
                newEmployees[j] = employees[i];
                j++;
            }
        }
        employees = newEmployees;
        return employeeToRemove;
    }
        }



