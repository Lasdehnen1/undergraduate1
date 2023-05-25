package undergraduate1;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main (String[] args) {


        Employee employee1 = new Employee("Никитин Никита Никитич", 3, 35000);
        Employee employee2 = new Employee("Петров Петр Петрович", 1, 67000);
        Employee employee3 = new Employee("Ильин Илья Ильич", 5, 9000);
        Employee employee4 = new Employee("Иванов Иван Иванович", 2, 56000);
        Employee employee5 = new Employee("Андреев Андрей Андреевич", 4, 33000);
        Employee employee6 = new Employee("Артуров Артур Артурович", 1, 79000);
        Employee employee7 = new Employee("Романов Роман Романович", 3, 85000);
        Employee employee8 = new Employee("Дмитриев Дмитрий Дмитриевич", 2, 53000);
        Employee employee9 = new Employee("Антонов Антон Антонович", 4, 65000);
        Employee employee10 = new Employee("Николаев Николай Николаевич", 5, 35000);



        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addNewEmployee(employee1);
        employeeBook.addNewEmployee(employee2);
        employeeBook.addNewEmployee(employee3);
        employeeBook.addNewEmployee(employee4);
        employeeBook.addNewEmployee(employee5);
        employeeBook.addNewEmployee(employee6);
        employeeBook.addNewEmployee(employee7);
        employeeBook.addNewEmployee(employee8);
        employeeBook.addNewEmployee(employee9);
        employeeBook.addNewEmployee(employee10);

        System.out.println();
        employeeBook.printAllList();
        System.out.println();
        employeeBook.calculateSalaryExpence();
        System.out.println();
        employeeBook.findMinSalaryEmployee();
        System.out.println();
        employeeBook.findMaxSalaryEmployee();
        System.out.println();
        employeeBook.calculateAverageSalary();
        System.out.println();
        employeeBook.printAllFullNames();
        System.out.println();
        employeeBook.indexAllSalaries(0.05);
        System.out.println();
        employeeBook.findMinSalaryEmployeeByDepartment(2);
        System.out.println();
        employeeBook.findMaxSalaryEmployeeByDepartment(4);
        System.out.println();
        employeeBook.calculateSalaryExpenceByDepartment(5);
        System.out.println();
        employeeBook.calculateAverageSalaryByDepartment(3);
        System.out.println();
        employeeBook.indexAllSalariesByDepartment(3, 0.05);
        System.out.println();
        employeeBook.printAllListByDepartment(1);
        System.out.println();
        employeeBook.findSalaryLessThanParameter(40000);
        System.out.println();
        employeeBook.findSalaryMoreThanParameter(50000);
        System.out.println();

        employeeBook.deleteExEmployee(employee4);
        employeeBook.changeSalary("Николаев Николай Николаевич", 55000);
        employeeBook.changeDepartment("Николаев Николай Николаевич", 1);


        employeeBook.printAllDepartmentEmployee();


    }
}