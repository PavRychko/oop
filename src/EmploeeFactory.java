import java.util.Random;

public class EmploeeFactory {

    public Employee[] generateEmployees(int size){
        Employee[] empArray = new Employee[size];
        String[] names ={"Ivan", "Petro", "Viktor", "Olga"};
        Random rand = new Random();
        for (int i = 0; i < empArray.length; i++) {
            int minSalary = 1000;
            String name = names[rand.nextInt(names.length)];
            int salary = rand.nextInt(3000) + minSalary;
            String gender = "Male";
            if(name.equals("Olga")) {
                gender = "Female";
            }
            int fixedBugs = rand.nextInt(100);
            double defaultBugRate =  rand.nextDouble();
            empArray[i] = new Employee(i+1, name, salary, gender, fixedBugs, defaultBugRate );
        }

        return empArray;
    }







}
