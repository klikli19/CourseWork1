public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private static int countId = 1;
    private final int id;
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = countId++;
    }

        public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + this.fullName + ". Отдел № " + this.department + ". Зарплата: " + this.salary + " рублей. " +
                "ID сотрудника: " +  id;
    }


}
