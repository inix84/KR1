//package course;

public class Main {
    private static final Employee[] employees = new Employee[10]; //  данные о 10 сотрудниках
    public static void main(String[] args) {
        employees[0] = new Employee(1, "Счастливый", "Случай", "Внезапнович", 1_000_000);
        employees[1] = new Employee(1, "Счастливая", "Радость", "Долгождановна", 50_000);
        employees[2] = new Employee(2, "Сладкий", "Поцелуй", "Любимович", 30_000);
        employees[3] = new Employee(2, "Сладкая", "Боль", "Татуирововна", 25_000);
        employees[4] = new Employee(3, "Умный", "Петр", "Енотович", 10_000);
        employees[5] = new Employee(3, "Умная", "Февронья", "Белловна", 11_000);
        employees[6] = new Employee(4, "Уставший", "Герцог", "Ленивович", 80_000);
        employees[7] = new Employee(4, "Уснувшая", "Шалость", "Случаевна", 60_000);
        employees[8] = new Employee(5, "Шелдон", "Грегори", "/нет отчества/", 100_000);
        employees[9] = new Employee(5, "Шелдон", "Амалия", "/нет отчества/", 105_000);
        int num = employees.length;
        for (int i = 0; i < num; i++) {
            System.out.println(" " + employees[i]); // вывод данных всех сотрудников
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSumSalary() + " рублей");
        System.out.println("Средняя зарплата сотрудников: " + calculateAverageSalary() + " рублей");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
        System.out.println();
        System.out.println("Список сотрудников:");
        printEmployeeFullName(num);
    }
    public static int calculateSumSalary() { // метод на сумму зарплат
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeWithMinSalary() { // метод на поиск (emlp) нищего
        int min = Integer.MAX_VALUE; // присваиваем самое большое целое число
        Employee targetEmployee = null; // инвариант, конкретныйСотрудник (целевойСотрудник)  присвоить ноль
        for (Employee emlp : employees) { //для (типы Сотрудник) переменной search которая перебирает элементы массива указанного сверху
            if (emlp != null && emlp.getSalary() < min) { // если search не равно нулю и ее поле зарплата меньше минимального (нами найденного или установленного начального значения)
                min = emlp.getSalary(); // переприсваиваем мин на значение поля зп данного массива search
                targetEmployee = emlp; // кокретныйСотрудник присваиваем эту переменную (элемент массива Сотрудники)
            }
        }
        return targetEmployee; // возврат только значение КонтретногоСотрудника (элемента массива типа Сотрудник)
    }
    public static Employee getEmployeeWithMaxSalary() { // метод на поиск (emlp) мажора
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee emlp : employees) {
            if (emlp != null && emlp.getSalary() > max) {
                max = emlp.getSalary();
                targetEmployee = emlp;
            }
        }
        return targetEmployee;
    }
    public static double calculateAverageSalary() { // метод на подсчет среднего значения зарплат
      int еxists = 0; // инвариант количества людей
      for (Employee emlp : employees) { // цикл для проверки заполненности массива и подсчет не нулевых записей (Сотрудник Есть еxists).
          if (emlp != null) {
              еxists++;
          }
      }
      double average = (double) calculateSumSalary() / еxists;
      return average;
    }
    public static void printEmployeeFullName(int num) { // метод на вывод ФИО сотрудников
        for (int i = 0; i < num; i++) {
            System.out.println(i + 1 + ". " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
        }
    }
}