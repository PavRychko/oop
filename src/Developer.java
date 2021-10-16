import java.util.Random;

public class Developer extends Employee{
    int fixedBugs;


    public Developer(long id, String name, double salary, String gender, int fixedBugs) {
        super(id, name, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    Developer(Employee employee, int fixedBugs){
    super(employee.getId(), employee.getName(), employee.getSalary(), employee.getGender());
    this.fixedBugs = fixedBugs;
    }

    @Override
    public double getSalary() {
        Random rand = new Random();
        return salary;
    }

    public double getSalaryWithBonuses() {
        Random rand = new Random();
        return (salary + (fixedBugs * 10)) * (rand.nextBoolean() ? 2 : 0);
    }




}
