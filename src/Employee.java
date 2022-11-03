//package course;

public class Employee {
    private int salary;
    private final String fullName;

    private final int id;

    private static int counter = 0;


    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.id = counter++;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    //@Override
    //public String toString() {
        //return "Employee {" +
             //   "salary = " + salary +
             //   ", fullName ' " + fullName + '\'' +
             //   '}';

    //}


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Employee {" +
                "salary = " + salary +
                ", fullName ' " + fullName + '\'' +
                ", id" + id +
                '}';
    }
}




