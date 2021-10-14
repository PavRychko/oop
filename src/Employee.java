

public class Employee {

    long id;
    String name;
    int salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;

    public Employee() {
    }

    public Employee(long id, String name, int salary, String gender, int fixedBugs, double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    double calculateBonus(){
        return (getFixedBugs() * getDefaultBugRate() * 100);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }
}
