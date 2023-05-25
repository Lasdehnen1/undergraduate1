package undergraduate1;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];


    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    public void deleteExEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == employee) {
                employees[i] = null;
                return;
            }
        }

    }

    public void changeSalary(String employee, double newSalary) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(employee)) {
                employees[i].setSalary(newSalary);
                return;
            }
        }
    }

    public void changeDepartment(String employee, int newDepartment) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(employee)) {
                employees[i].setDepartment(newDepartment);
                return;
            }
        }
    }


    public void printAllDepartmentEmployee() {
        for (Employee employee: employees) {
            if (employee != null) {
                System.out.println("Ф.И.О.: " + employee.getFullName() + "; Отдел: " + employee.getDepartment());
            }
        }
    }

    public void printAllList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

    }

    public void calculateSalaryExpence() {
        double sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Общая сумма затрат на зарплаты за месяц: " + sum);

    }

    public void findMinSalaryEmployee() {
        double minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }

        }

        System.out.println("Минимальная зарплата: " + minSalaryEmployee.getFullName());

    }

    public void findMaxSalaryEmployee() {
        double maxSalary = Integer.MIN_VALUE;
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalaryEmployee.getFullName());


    }

    public void calculateAverageSalary() {
        double sum = 0;
        double counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                counter++;
            }
        }
        System.out.println("Среднее значение зарплат: " + sum / counter);
    }

    public void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexAllSalaries(double salaryIndex) {
        for (Employee employee : employees) {
            if (employee != null) {
                double index = employee.getSalary() * salaryIndex;
                employee.setSalary(index + employee.getSalary());
                System.out.println(employee);
            }
        }
    }

    public void findMinSalaryEmployeeByDepartment(int department) {

        double minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() < minSalary) {
                        minSalary = employee.getSalary();
                        minSalaryEmployee = employee;
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе " + department + ": " + minSalaryEmployee);

    }

    public void findMaxSalaryEmployeeByDepartment(int department) {
        double maxSalary = Integer.MIN_VALUE;
        Employee maxSalaryEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        maxSalaryEmployee = employee;
                    }
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе " + department + ": " + maxSalaryEmployee);

    }

    public void calculateSalaryExpenceByDepartment(int department) {

        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (department == employee.getDepartment()) {
                    sum += employee.getSalary();
                }
            }
        }
        System.out.println("Общая сумма затрат на зарплаты за месяц в отделе " + department + ": " + sum);


    }

    public void calculateAverageSalaryByDepartment(int department) {
        double sum = 0;
        double counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (department == employee.getDepartment()) {
                    sum += employee.getSalary();
                    counter++;
                }
            }
        }
        System.out.println("Среднее значение зарплат в отделе " + department + ": " + sum / counter);

    }

    public void indexAllSalariesByDepartment(int department, double salaryIndex) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (department == employee.getDepartment()) {
                    double index = employee.getSalary() * salaryIndex;
                    employee.setSalary(index + employee.getSalary());
                    System.out.println(employee);
                }
            }
        }
    }


    public void printAllListByDepartment(int department) {

        for (Employee employee : employees) {
            if (employee != null) {
                if (department == employee.getDepartment()) {
                    System.out.println("ID: " + employee.getId() + "; Ф.И.О.: " + employee.getFullName()  + "; Зарплата: " + employee.getSalary());
                }
            }
        }

    }

    public void findSalaryLessThanParameter(double parameter) {

        Employee employeeSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < parameter) {
                    employeeSalary = employee;
                    System.out.println("ID: " + employee.getId() + "; Ф.И.О.: " + employee.getFullName()  + "; Зарплата: " + employee.getSalary());
                }
            }
        }
    }

    public void findSalaryMoreThanParameter(double parameter) {
        Employee employeeSalary = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= parameter) {
                    employeeSalary = employee;
                    System.out.println("ID: " + employee.getId() + "; Ф.И.О.: " + employee.getFullName()  + "; Зарплата: " + employee.getSalary());
                }
            }
        }
    }
}




























