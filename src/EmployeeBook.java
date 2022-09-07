import java.util.Arrays;

public class EmployeeBook<employees> {
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
        double sum = 0;
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
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
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
            if (employee != null && employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employeeWithMinSalary = employee;
            }
        }
        if (employeeWithMinSalary != null) {
            System.out.println("Сотрудник с мин зп: " + employeeWithMinSalary.getFullName());
        }
    }

    public void meanSalary() {
        double sum = 0;
        for (Employee element : employees) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        double mean = sum / employees.length;
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
        if (employees[0] != null) {
            double minSalary = employees[0].getSalary();
            Employee employeeWithMinSalary =  employees[0];
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                        minSalary = employee.getSalary();
                        employeeWithMinSalary = employee;
                }
            }
            if (employeeWithMinSalary != null) {
                System.out.println("Сотрудник отдела № " + department + " с мин зп: "
                        + employeeWithMinSalary.getFullName());
            }
        }
    }

    public void findEmpWithMaxSalaryInDepartment(int department) {
        int maxSalary = -1;
        if (employees != null) {
            Employee employeeWithMaxSalary = null;
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        employeeWithMaxSalary = employee;
                }
            }
            if (employeeWithMaxSalary != null) {
                System.out.println("Сотрудник отдела № " + department + " с мах зп: " + employeeWithMaxSalary.getFullName());
            }
        }
    }

    public void sumSalaryOfDepartment(int department) {
        double sum = 0;
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
        double sum = 0;
        int count = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
                count++;
            }
        }
        double mean = sum / count;
        System.out.println("Средняя зарплата сотрудников отдела № " + department + " составляет: " + mean + " рублей.");
    }

    public void findEmpSalary1(double salary) {
        System.out.println("Сотрудники с зп меньше " + salary + " рублей:");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary() + ".");
            }
        }
    }

    public void findEmpSalary2(double salary) {
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
    public boolean deleteEmployee (int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }
    public Employee searchEmployeeByFullName (String fullName){
        Employee searchResult = null;
        for(Employee employee:employees){
            if (employee != null && employee.getFullName().equals(fullName)){
                searchResult = employee;
                System.out.println("Сотрудник найден. ID: " + employee.getId());
            }
        }
        return searchResult;
    }
    public Employee changeEmployeeSalary(int id, double salary){
        Employee searchResult = null;
        for(Employee employee:employees){
            if (employee != null && employee.getId() == id){
                searchResult = employee;
                employee.setSalary(salary);
            }
        }
        return searchResult;
    }

    public Employee changeEmployeeDepartment(int id, int department){
        Employee searchResult = null;
        for(Employee employee:employees){
            if (employee != null && employee.getId() == id){
                searchResult = employee;
                employee.setDepartment(department);

            }
        }
        return searchResult;
    }

    public void printAllEmployeesOfDepartment (int department) {
        System.out.println("Отдел № " + department);
        for(Employee employee: employees){
            if (employee != null && employee.getDepartment() == department){
                System.out.println(employee.getFullName());
            }
        }
    }

}