public class Designer extends Employee {
    double rate;
    int workedDays;


    public Designer(long id, String name, double salary, String gender, double rate, int workedDays) {
        super(id, name, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    Designer(Employee employee, double rate, int workedDays) {
        super(employee.getId(), employee.getName(), employee.getSalary(), employee.getGender());
        this.rate = rate;
        this.workedDays = workedDays;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public double getSalaryWithBonuses() {
        return salary + (rate * workedDays);
    }
}
