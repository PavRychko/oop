public class Manager extends Employee {

    Manager(Employee employee) {
        super(employee.getId(), employee.getName(), employee.getSalary(), employee.getGender());
    }

    public Manager(long id, String name, double salary, String gender) {
        super(id, name, salary, gender);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
