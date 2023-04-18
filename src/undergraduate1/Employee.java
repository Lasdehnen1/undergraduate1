package undergraduate1;

public class Employee {


    private String fullName;
    private int department;
    private double salary;
    private static int counter = 1;
    private final int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }
    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ID: " + id + "; Ф.И.О.: " + fullName + "; Отдел: " + department + "; Зарплата: " + salary;
    }

    public String toString2() {
        return "ID: " + id + "; Ф.И.О.: " + fullName  + "; Зарплата: " + salary;
    }







}

