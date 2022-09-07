public class Ledger {
    public static void main(String[] args) {
        EmployeeBook book1 = new EmployeeBook(10);
        book1.add(new Employee("Иванов Иван Иванович", 1, 50051));
        book1.add(new Employee("Сидоров Степан Степанович", 1, 1000));
        book1.add(new Employee("Попов Иван Дмитриевич", 1, 60000));
        book1.add(new Employee("Семёнов Семён Семёнович", 2, 63000));
        book1.add(new Employee("Васильев Василий Васильевич", 3, 55000));
        book1.add(new Employee("Петров Пётр Петрович", 3, 65000));
        book1.add(new Employee("Дмитриев Дмитрий Дмитриевич", 4, 7000));
        book1.add(new Employee("Львов Лев Львович",5, 100000));
        book1.add(new Employee("Смирнов Николай Николаевич",5, 90000));
        book1.add(new Employee("Новиков Павел Николаевич", 5, 95001));
        System.out.println();
        book1.printAllEmployees();
        book1.findEmpWithMaxSalaryInDepartment(5);
        book1.deleteEmployee(5);
        book1.searchEmployeeByFullName("Смирнов Николай Николаевич");
        book1.changeEmployeeSalary(9, 140400);
        book1.searchMaxSalary();
        book1.printAllEmployeesOfDepartment(1);




    }
}