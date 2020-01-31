import java.security.spec.RSAOtherPrimeInfo; import java.util.Arrays;

public class Employee {
    // Поля ФИО, должность, телефон, зарплата, возраст;
    private String fullName;
    private String jobTitle;
    private String phone;
    private int salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee (String fullName, String jobTitle, String phone, int 
salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать методы, которые возвращают 
значение каждого поля;
    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //
    public static void createEmployees() {
        for (int i = 0; i <= 5; i++) {
            Employee j = new Employee("Name"+i, "job"+i, "phone"+i, 
1000+i, 20+i);
            System.out.println(j);
        }
    }

    //С помощью цикла вывести информацию только о сотрудниках старше 40 
лет
    static void getEmployeesOverForty(Employee[] employees) {
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].age > 40) {
                System.out.println(employees[i].fullName);
            }
        }
    }

    //Создать метод, повышающий зарплату всем сотрудникам старше 45 лет 
на 5000
    static void setSalaryOverFortyFive(Employee[] employees) {
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].age > 45) {
                employees[i].salary = employees[i].salary + 5000;
                System.out.println(employees[i].salary);
            }
        }
    }

    //Средние арифметические возраста
    static void getAverageAge(Employee[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total = total + array[i].age;
        }
        System.out.println("Average age " + total / array.length);
    }

    //Средние арифметические зарплаты
    static void getAverageSalary(Employee[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total = total + array[i].salary;
        }
        System.out.println("Average salary " + total / array.length);
    }

    public static void main(String[] args) {
        //Вывести при помощи методов из пункта 3 ФИО и должность.
        Employee krasnovoa = new Employee("Krasnov Oleg Aleksandrovich", "Developer", "+7 917 123-45-67", 2000,37);
        String name = krasnovoa.getFullName();
        String job = krasnovoa.getJobTitle();
        System.out.printf("Name: %s, Job title: %s\n", name, job);

        //Создать массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "Developer", "+7 917 123-45-67", 500,19);
        employees[1] = new Employee("Petrov Petr Petrovich", "HR", "+7 917 123-45-67", 1000,49);
        employees[2] = new Employee("Nikolaev Nikolai Nikolaevich", "Developer", "+7 917 123-45-67", 2000,47);
        employees[3] = new Employee("Aleksandrov Aleksandr Aleksandrovich", "Developer", "+7 917 123-45-67", 2000,25);
        employees[4] = new Employee("Semenov Semen Semenovich", "Manager", "+7 917 123-45-67", 2500,31);

        getEmployeesOverForty(employees);
        setSalaryOverFortyFive(employees);
        getAverageAge(employees);
        getAverageSalary(employees);
        }
    }

    static void getStaus() {
        
    }
