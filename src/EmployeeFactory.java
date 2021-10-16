import java.util.Random;

public class EmployeeFactory {


    public Employee[] generateEmployees(int size) {
        Employee[] empArray = new Employee[size];
        String[] maleNames = {"Ivan", "Petro", "Viktor"};
        String[] femaleNames = {"Olga", "Vita", "Katya"};
        int minSalary = 1000;
        Random rand = new Random();
        for (int i = 0; i < empArray.length; i++) {
            int genderReveal = rand.nextInt();
            String gender = "male";
            String name = maleNames[rand.nextInt(maleNames.length)];
            if(genderReveal % 2 == 0){
               gender = "female";
                name = femaleNames[rand.nextInt(femaleNames.length)];
            }
            int salary = rand.nextInt(3000) + minSalary;
           Employee employee =  new Employee(i+1, name, salary, gender);
            switch (rand.nextInt(3)){
                case 0 :
                    empArray[i] = new Designer(employee, rand.nextDouble() * 10, rand.nextInt(23));
                case 1 :
                    empArray[i] = new Developer(employee, rand.nextInt(40));
                case 2 :
                    empArray[i] = new Manager(employee);
                }
            }
        return empArray;
    }
}
