import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {

        this.employees = employees;
    }




//    вспомогательный метод, сортирует зарплаты сотрудников
    private int[] sortArray() {
        int[] arrayWithSalaryOfEmployees = new int[5];
        for(int i = 0; i <= employees.length - 1; i++ ) {
            if( employees[i] == null ) {
                break;
            } else {
                arrayWithSalaryOfEmployees[i] = employees[i].getSalaryEmployee();
            }
        }
        Arrays.sort(arrayWithSalaryOfEmployees);
        return arrayWithSalaryOfEmployees;
    }


//    вывод всех сотрудников
    public void outputAllEmployees() {
        System.out.println("Список всех сотрдуников: ");
        for(int i = 0; i < employees.length ; i++) {
            if( employees[i] == null ) {
                break;
            } else {
                System.out.print(employees[i].getFullNameEmployee() + ", ");
            }
        }
    }


//   подсчет суммы всех зарплат сотрудников
    public void computedSumAmountOfWages() {
        System.out.println();
        int sum = 0;
        for(int i = 0; i < employees.length; i++) {
            if( employees[i] == null ) {
                break;
            } else {
                sum += employees[i].getSalaryEmployee();
            }
        }
        System.out.println("Сумма всех зарплат сотрудников " + sum);

    }

//    подсчет средней суммы зарплаты сотрудников
    public void computedAverageSumAmountOfWages() {
        float averageSum = 0;
        for(int i = 0; i < employees.length; i++) {
            if( employees[i] == null ) {
                break;
            } else {
                averageSum += employees[i].getSalaryEmployee();
            }
        }
        averageSum /= employees.length - 1;

        System.out.println("Средняя сумма зарплат сотрдуников " + averageSum);

    }


//   поиск сотрудника с минимальной и максимальной зарплатой
    public void getEmployeeWithMinAndMaxSalary() {
        int[] arrSortWithEmployee = sortArray();

        for(int i = 0; i < employees.length - 1; i++) {
            if( employees[i] == null ) {
                break;
            } else {
                if (employees[i].getSalaryEmployee() == arrSortWithEmployee[0]) {
                    System.out.println("Сотрудник с минимальной зарплатой - " + employees[i].getFullNameEmployee());
                } else if (employees[i].getSalaryEmployee() == arrSortWithEmployee[arrSortWithEmployee.length - 1]) {
                    System.out.println("Сотрудник с максимальной зарплатой - " + employees[i].getFullNameEmployee());
                }
            }
        }
    }







// добавление нового сотрудника
    public void addEmployee(String fullNameEmployee, String department, int salary) {
        if (Employee.count >= employees.length) {
            System.out.println("employeesBook is full ");
        }
        Employee newEmployees = new Employee(fullNameEmployee, department, salary);
        this.employees[Employee.count - 2] = newEmployees;
        System.out.println(newEmployees);
    }

//    удаление сотрудника

    public void removeEmployee(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if( employees[i] == null ) {
                break;
            } else {
                if (employees[i].getId() == employeeId) {
                    System.out.println("Сотрудник(ца) " + employees[i].getId() + " удален(а)");
                    System.arraycopy(employees, i + 1, employees, i, Employee.count - i - 1);
                    employees[Employee.count - 1] = null;
                    Employee.count--;
                    return;
                }
            }

        }
    }


//    изменение данных сотрудника

    public void changeEmployee(String fullNameEmployee, String department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                break;
            } else if( employees[i] != null ) {
                if(employees[i].getFullNameEmployee().equals(fullNameEmployee)) {
                    employees[i] = new Employee(fullNameEmployee, department, salary);
                    System.out.println("Данные сотрудника " + fullNameEmployee + " изменены: департамен - "
                            + department + ", зарплата - " + salary); }
            } else {
                System.out.println("Сотрудник " + fullNameEmployee + " не найден");

            }

        }
    }

//   вывод всех сотрудников с их департаментами
    public void printAllEmployeesFromDepartment(String department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                break;
            } else {
                if(employees[i].getDepartmentEmployee().equals(department)) {
                    System.out.println("Сотрудники: " + employees[i].getFullNameEmployee() + ": " + employees[i].getDepartmentEmployee());
                }
            }

        }
    }

}
