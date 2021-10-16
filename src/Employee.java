public class Employee {
    long id;
    String name;
    double salary;
    String gender;


    public Employee() {
    }

    public Employee(long id, String name, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

}
