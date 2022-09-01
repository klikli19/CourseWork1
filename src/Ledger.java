public class Ledger {
    static Employee[] employees;

    public Ledger(int size) {
        employees = new Employee[size];
    }

    public static boolean add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public static void printAllEmployees() {
        System.out.println("Данные сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void monthlyExpenses() {
        int sum = 0;
        for (Employee element : employees) {
            sum += element.getSalary();
        }
        System.out.println("Сумма затрат на зарплату за месяц: " + sum + " рублей.");
    }
    public static void searchMaxSalary() {
        int maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " рублей");
    }

    public static void searchMinSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary + " рублей");
    }

    public static void meanSalary() {
        int sum = 0;
        for (Employee element : employees) {
            sum += element.getSalary();
        }
        float mean = sum / employees.length;
        System.out.println("Средняя зарплата сотрудников: " + mean + " рублей.");
    }

    public static void listEmployees () {
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName() + ".");
            }
        }
}
    public static void main(String[] args) {
        Ledger book1 = new Ledger(10);
        add(new Employee("Иванов Иван Иванович", 1, 50000));
        add(new Employee("Сидоров Степан Степанович", 1, 70000));
        add(new Employee("Попов Иван Дмитриевич", 2, 60000));
        add(new Employee("Семёнов Семён Семёнович", 2, 63000));
        add(new Employee("Васильев Василий Васильевич", 3, 55000));
        add(new Employee("Петров Пётр Петрович", 3, 65000));
        add(new Employee("Дмитрием Дмитрий Дмитриевич", 4, 70000));
        add(new Employee("Львов Лев Львович",4, 80000));
        add(new Employee("Смирнов Николай Николаевич",5, 90000));
        add(new Employee("Новиков Павел Павлович",5, 95000));

        printAllEmployees();;
        System.out.println();
        monthlyExpenses();
        System.out.println();
        searchMaxSalary();
        System.out.println();
        searchMinSalary();
        System.out.println();
        meanSalary();
        System.out.println();
        listEmployees();


    }
}