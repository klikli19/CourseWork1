import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    public boolean add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void printAllEmployees() {
        System.out.println("Данные сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public void monthlyExpenses() {
        int sum = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату за месяц: " + sum + " рублей.");
    }

    public void searchMaxSalary() {
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


    public void searchMinSalary() {
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

    public void meanSalary() {
        int sum = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        float mean = sum / employees.length;
        System.out.println("Средняя зарплата сотрудников: " + mean + " рублей.");
    }

    public void listEmployees() {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName() + ".");
            }
        }
    }

    public void salaryIncrease(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = (employee.getSalary() * percent + employee.getSalary());
                employee.setSalary(newSalary);
            }
        }
    }

    public void findEmpWithMinSalaryInDepartment(int department) {
        int minSalary = employees[department].getSalary();
        Employee employeeWithMinSalary = employees[department];
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
                }
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник отдела № " + department + " с мин зп: "
                    + employeeWithMinSalary.getFullName());
        }
    }

    public void findEmpWithMaxSalaryInDepartment(int department) {
        int maxSalary = -1;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
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

    public void sumSalaryOfDepartment(int department) {
        int sum = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зп по отделу № " + department + " составляет: " + sum + " рублей.");
    }

    public void listEmpOfDepartment(int department) {
        System.out.println("Список сотрудников отдела № " + department);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }

    public void meanSalaryOfDepartment(int department) {
        int sum = 0;
        int count = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
                count++;
            }
        }
        float mean = sum / count;
        System.out.println("Средняя зарплата сотрудников отдела № " + department + " составляет: " + mean + " рублей.");
    }

    public void findEmpSalary1(int salary) {
        System.out.println("Сотрудники с зп меньше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }

    public void findEmpSalary2(int salary) {
        System.out.println("Сотрудники с зп больше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                System.out.println("ID: " + employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }

    public void salaryIncreaseOfDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = (employee.getSalary() * percent + employee.getSalary());
                employee.setSalary(newSalary);
            }
        }
    }
}