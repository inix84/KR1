//package course;

public class Main {
    private static final Employee[] employees = new Employee[5];
    public static void main(String[] args) {
        employees[0] = new Employee("1. Иванов Иван Иванович", 100);
        employees[1] = new Employee("2. Иванов Иван Иванович",200);
        employees[2] = new Employee("3. Иванов Иван Иванович",300);
        employees[3] = new Employee("4. Иванов Иван Иванович",400);
        employees[4] = new Employee("5. Иванов Иван Иванович",500);
        System.out.println("Сумма всех зарплат:" + calculateSumSalary() );
        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary();

        //if (employeeWithMaxSalary == null) {
           // System.out.println("Нет сотрудника с максимальной зарплатой: ");
        //} else {
            System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
       // }
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeWithMaxSalary () {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee !=null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
}