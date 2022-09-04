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
            if (element != null) {
                sum += element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату за месяц: " + sum + " рублей.");
    }
    public static void searchMaxSalary() {
        int maxSalary = -1;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeWithMaxSalary = employee;
                }
            }
        }
        if (employeeWithMaxSalary != null) {
            System.out.println("Сотрудник с мах зп: " + employeeWithMaxSalary.getFullName());
        }
    }


    public static void searchMinSalary() {
        int minSalary = employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник с мин зп: " + employeeWithMinSalary.getFullName());
        }
    }
    public static void meanSalary() {
        int sum = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        float mean = sum / employees.length;
        System.out.println("Средняя зарплата сотрудников: " + mean + " рублей.");
    }

    public static void listEmployees () {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName() + ".");
            }
        }
    }

    public static void salaryIncrease(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary  = (employee.getSalary() * percent + employee.getSalary());
                employee.setSalary(newSalary);
            }
        }
    }

    public static void main(String[] args) {
        Ledger book1 = new Ledger(10);
        add(new Employee("Иванов Иван Иванович", 1, 50051));
        add(new Employee("Сидоров Степан Степанович", 1, 170000));
        add(new Employee("Попов Иван Дмитриевич", 1, 60000));
        add(new Employee("Семёнов Семён Семёнович", 2, 63000));
        add(new Employee("Васильев Василий Васильевич", 3, 55000));
        add(new Employee("Петров Пётр Петрович", 3, 65000));
        add(new Employee("Дмитриев Дмитрий Дмитриевич", 4, 7000));
        add(new Employee("Львов Лев Львович",5, 100000));
        add(new Employee("Смирнов Николай Николаевич",5, 90000));
        add(new Employee("Новиков Павел Николаевич", 5, 95001));

        monthlyExpenses();
        System.out.println();
        searchMaxSalary();
        searchMinSalary();
        System.out.println();
        meanSalary();
        System.out.println();
        listEmployees();
        System.out.println();
        salaryIncrease(0.01);
        printAllEmployees();



    }
}