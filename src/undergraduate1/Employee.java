package undergraduate1;

import java.util.Objects;

public class Employee {


    private String fullName;
    private int department;
    private double salary;



    private static int counter = 1;
    private int id;

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




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && Double.compare(employee1.salary, salary) == 0 && id == employee1.id && Objects.equals(fullName, employee1.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

}

