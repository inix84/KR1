//package course;

public class Main {
    private static final Employee[] employees = new Employee[10]; //  данные о 10 сотрудниках
    public static void main(String[] args) {
        employees[0] = new Employee(1,"Счастливый","Случай","Внезапнович",1_000_000);
        employees[1] = new Employee(1,"Счастливая","Радость","Долгождановна",50_000);
        employees[2] = new Employee(2,"Сладкий","Поцелуй","Любимович",30_000);
        employees[3] = new Employee(2,"Сладкая","Боль","Татуирововна",25_000);
        employees[4] = new Employee(3,"Умный","Петр","Енотович",10_000);
        employees[5] = new Employee(3,"Умная","Февронья","Белловна",11_000);
        employees[6] = new Employee(4,"Уставший","Герцог","Ленивович",80_000);
        employees[7] = new Employee(4,"Уснувшая","Шалость","Случаевна",60_000);
        employees[8] = new Employee(5,"Шелдон","Грегори","/нет отчества/",100_000);
        employees[9] = new Employee(5,"Шелдон","Амалия","/нет отчества/",105_000);

        int num = employees.length;
        for (int i=0;i<num;i++){
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

        for (int i=0;i<num;i++) {
            System.out.println(i+1 + ". " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
        }
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
    public static Employee getEmployeeWithMinSalary () { // метод на поиск (search) нищего
        int min = Integer.MAX_VALUE; // присваиваем самое большое целое число
        Employee targetEmployee = null; // инвариант, конкретныйСсотрудник (целевойСотрудник)  присвоить ноль
        for (Employee search : employees) { //для (типы Сотрудник) переменной search которая перебирает элементы массива указанного сверху
            if (search !=null && search.getSalary() < min) { // если search не равно нулю и ее поле зарплата меньше минимального (нами найденного или установленного начального значения)
                min = search.getSalary(); // переприсваиваем мин на значение поля зп данного массива search
                targetEmployee = search; // кокретныйСотрудник присваиваем эту переменную (элемент массива Сотрудники)
            }
        }
        return targetEmployee; // возврат только значение КонтретногоСотрудника (элемента массива типа Сотрудник)
    }
    public static Employee getEmployeeWithMaxSalary () { // метод на поиск (search) мажора
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee search : employees) {
            if (search !=null && search.getSalary() > max) {
                max = search.getSalary();
                targetEmployee = search;
            }
        }
        return targetEmployee;
    }

        public static double calculateAverageSalary() { // метод на подсчет среднего значения зарплат
        double Average = (double) calculateSumSalary()/employees.length;
        return Average;
    }

}