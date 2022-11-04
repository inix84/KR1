//package course;

public class Employee { // класс Сотрудник

    private int department; //отдел (от 1 до 5), может меняться
    private String surname;; // Фамилия, может меняться
    private final String name;; // Имя
    private final String patronymic;; // Отчество
    private int salary; // зарплата, может меняться
    public static int counter = 0; // счетчик обращений к конструктору, привязан к классу (статичный)

    private final int id; // номер сотрудника


    public Employee(int department, String surname,String name,String patronymic,int salary) { // метод Сотрудник, определяются поля для класса
        this.department = department;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.id = ++counter; // увеличивается при каждом обращении (создании сотрудников)

    }

    public int getDepartment() { // геттер Отдела, считывать
        return this.department;
    }

    public void setDepartment(int department) { // сеттер отдела, менять отдел
        this.department = department;
    }

    public String getSurname() { // геттер Фамилии, считывать
        return this.surname;
    }

    public void setSurname(String surname) { // сеттер Фамилии, менять
        this.surname = surname;
    }

    public String getName() { // геттер Имени, читать
        return this.name;
    }

    public String getPatronymic() { // геттер Отчества, читать
        return this.patronymic;
    }

    private int getId() { // геттер номера сотрудника, считывать
        return id;
    }

    public int getSalary() { // геттер зарплаты, считывать
        return this.salary;
    }

    public void setSalary(int salary) { // сеттер зарплаты, менять
        this.salary = salary;
    }

    public int getCounter() { // для среднего надо возврат числа счетчика текущее
        return counter;
    }
    @Override
    public String toString() {
        return "Сорудник - " +
                "Отдел - " + department +
                ", Фамилия - " + surname +
                ", Имя - " + name +
                ", Отчество - " + patronymic +
                ", зарплата = " + salary +
                ", id = " + id +
                '}';
    }
}




