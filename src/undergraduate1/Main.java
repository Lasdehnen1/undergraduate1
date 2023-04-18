package undergraduate1;

public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main (String[] args) {


        employee[0] = new Employee("Никитин Никита Никитич", 3, 35000);
        employee[1] = new Employee("Петров Петр Петрович", 1, 67000);
        employee[2] = new Employee("Ильин Илья Ильич", 5, 9000);
        employee[3] = new Employee("Иванов Иван Иванович", 2, 56000);
        employee[4] = new Employee("Андреев Андрей Андреевич", 4, 33000);
        employee[5] = new Employee("Артуров Артур Артурович", 1, 79000);
        employee[6] = new Employee("Романов Роман Романович", 3, 85000);
        employee[7] = new Employee("Дмитриев Дмитрий Дмитриевич", 2, 53000);
        employee[8] = new Employee("Антонов Антон Антонович", 4, 65000);
        employee[9] = new Employee("Николаев Николай Николаевич", 5, 35000);

        printAllList();
        calculateSalaryExpence();
        findMinSalaryEmployee();
        findMaxSalaryEmployee();
        calculateAverageSalary();
        printAllFullNames();
        indexAllSalaries();

        findMinSalaryEmployeeByDepartment();
        findMaxSalaryEmployeeByDepartment();
        calculateSalaryExpenceByDepartment();
        calculateAverageSalaryByDepartment();
        indexAllSalariesByDepartment();
        printAllListByDepartment();
        findSalaryLessThanParameter();
        findSalaryMoreThanParameter();


    }

        public static void printAllList() {
            for (Employee employee : employee) {
                System.out.println(employee);
            }
            System.out.println();
        }

        public static void calculateSalaryExpence() {
            double sum = 0;

            for (Employee employee : employee) {
                sum += employee.getSalary();
            }
            System.out.println("Общая сумма затрат на зарплаты за месяц: " + sum);
            System.out.println();
        }

        public static void findMinSalaryEmployee() {
            double minSalary = Integer.MAX_VALUE;
            Employee minSalaryEmployee = employee[0];
            for (Employee employee : employee) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                    }
                }

            System.out.println("Минимальная зарплата: " + minSalaryEmployee.getFullName());
            System.out.println();
        }

        public static void findMaxSalaryEmployee() {
            double maxSalary = Integer.MIN_VALUE;
            Employee maxSalaryEmployee = employee[0];
            for (Employee employee : employee) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }

            }
            System.out.println("Максимальная зарплата: " + maxSalaryEmployee.getFullName());
            System.out.println();

        }

        public static void calculateAverageSalary() {
            double sum = 0;
            double counter = 0;
            for (Employee employee : employee) {
                sum += employee.getSalary();
                counter++;
            }
            System.out.println("Среднее значение зарплат: " + sum/counter);
            System.out.println();
        }

        public static void printAllFullNames() {
            for (Employee employee : employee) {
                System.out.println(employee.getFullName());
            }
            System.out.println();
        }

        public static void indexAllSalaries() {
            double salaryIndex = 0.05;
            for (Employee employee : employee) {
                double index = employee.getSalary() * salaryIndex;
                employee.setSalary(index + employee.getSalary());
                System.out.println(employee);
                }
            System.out.println();
        }

        public static void findMinSalaryEmployeeByDepartment() {
            int department = 1;
            double minSalary = Integer.MAX_VALUE;
            Employee minSalaryEmployee = employee[0];
            for (Employee employee : employee) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() < minSalary) {
                        minSalary = employee.getSalary();
                        minSalaryEmployee = employee;
                    }

                }
            }
            System.out.println("Минимальная зарплата в отделе " + department + ": " + minSalaryEmployee);
            System.out.println();
        }

        public static void findMaxSalaryEmployeeByDepartment() {
            double maxSalary = Integer.MIN_VALUE;
            Employee maxSalaryEmployee = employee[0];
            int department = 5;
            for (Employee employee : employee) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        maxSalaryEmployee = employee;
                    }
                }
            }
            System.out.println("Максимальная зарплата в отделе " + department + ": " + maxSalaryEmployee);
            System.out.println();
        }

        public static void calculateSalaryExpenceByDepartment() {
            int department = 3;
            double sum = 0;
            for (Employee employee : employee) {
                if (department == employee.getDepartment()) {
                    sum += employee.getSalary();
                }
            }
            System.out.println("Общая сумма затрат на зарплаты за месяц в отделе " + department + ": " + sum);
            System.out.println();

        }

        public static void calculateAverageSalaryByDepartment() {
            double sum = 0;
            double counter = 0;
            int department = 4;
            for (Employee employee : employee) {
                if (department == employee.getDepartment()) {
                    sum += employee.getSalary();
                    counter++;
                }
            }
            System.out.println("Среднее значение зарплат в отделе " + department + ": " + sum/counter);
            System.out.println();
        }

        public static void indexAllSalariesByDepartment() {
            double salaryIndex = 0.1;
            int department = 2;
            for (Employee employee : employee) {
                if (department == employee.getDepartment()) {
                    double index = employee.getSalary() * salaryIndex;
                    employee.setSalary(index + employee.getSalary());
                    System.out.println(employee);
                }
            }
            System.out.println();
        }

        public static void printAllListByDepartment() {
            int department = 1;
            for (Employee employee : employee) {
                if (department == employee.getDepartment()) {


                    System.out.println(employee.toString2());
                }
            }
            System.out.println();
        }

        public static void findSalaryLessThanParameter() {
            double parameter = 50000;
            Employee employeeSalary = employee[0];
            for (Employee employee : employee) {
                if (employee.getSalary() < parameter) {
                    employeeSalary = employee;
                    System.out.println(employee.toString2());
                }
            }
            System.out.println();
        }

        public static void findSalaryMoreThanParameter() {
            double parameter = 50000;
            Employee employeeSalary = employee[0];
            for (Employee employee : employee) {
                if (employee.getSalary() >= parameter) {
                    employeeSalary = employee;
                    System.out.println(employee.toString2());
                }
            }
            System.out.println();
        }








}