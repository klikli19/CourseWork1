public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int id = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = getId();
    }


    public int getId () {
        return id++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + this.fullName + ". Отдел № " + this.department + ". Зарплата: " + this.salary + " рублей. " +
                "ID сотрудника: " + id++;
    }
}
