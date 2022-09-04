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
    public static void findEmpWithMinSalaryInDepartment (int department) {
        int minSalary = employees[department].getSalary();
        Employee employeeWithMinSalary = employees[department];
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary ) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник отдела № " + department  + " с мин зп: "
                    + employeeWithMinSalary.getFullName());
        }
    }
    public static void findEmpWithMaxSalaryInDepartment(int department) {
        int maxSalary = -1;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null&& employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeWithMaxSalary = employee;
                }
            }
        }
        if (employeeWithMaxSalary != null) {
            System.out.println("Сотрудник отдела № " + department + " с мах зп: " + employeeWithMaxSalary.getFullName());
        }
    }

    public static void sumSalaryOfDepartment(int department) {
        int sum = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зп по отделу № " + department + " составляет: " + sum + " рублей.");
    }
    public static void listEmpOfDepartment (int department) {
        System.out.println("Список сотрудников отдела № " + department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }
    public static void meanSalaryOfDepartment(int department) {
        int sum = 0;
        int count = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
                count++;
            }
        }
        float mean = sum /count;
        System.out.println("Средняя зарплата сотрудников отдела № " + department + " составляет: " + mean + " рублей.");
    }
    public static void findEmpSalary1 (int salary) {
        System.out.println("Сотрудники с зп меньше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }
    public static void findEmpSalary2 (int salary) {
        System.out.println("Сотрудники с зп больше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                System.out.println("ID: " + employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }
    public static void salaryIncreaseOfDepartment (double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary  = (employee.getSalary() * percent + employee.getSalary());
                employee.setSalary(newSalary);
            }
        }
    }

    public static void main(String[] args) {
        Ledger book1 = new Ledger(10);
        add(new Employee("Иванов Иван Иванович", 1, 50051));
        add(new Employee("Сидоров Степан Степанович", 1, 1000));
        add(new Employee("Попов Иван Дмитриевич", 1, 60000));
        add(new Employee("Семёнов Семён Семёнович", 2, 63000));
        add(new Employee("Васильев Василий Васильевич", 3, 55000));
        add(new Employee("Петров Пётр Петрович", 3, 65000));
        add(new Employee("Дмитриев Дмитрий Дмитриевич", 4, 7000));
        add(new Employee("Львов Лев Львович",5, 100000));
        add(new Employee("Смирнов Николай Николаевич",5, 90000));
        add(new Employee("Новиков Павел Николаевич", 5, 95001));


        monthlyExpenses();
        salaryIncrease(0.02);
        searchMinSalary();
        searchMaxSalary();
        meanSalary();
        listEmployees();
        findEmpWithMinSalaryInDepartment(1);
        findEmpWithMaxSalaryInDepartment(3);
        printAllEmployees();
        sumSalaryOfDepartment(5);
        System.out.println();
        listEmpOfDepartment(5);
        System.out.println();
        findEmpSalary1(70000);
        System.out.println();
        findEmpSalary2(50000);
        meanSalaryOfDepartment(1);
        System.out.println();
        salaryIncreaseOfDepartment(0.01,1);
        listEmpOfDepartment(1);



    }
}