import java.util.Arrays;

public class EmployeeBook {
    private final Employees[] employees;
    private final Employees[] arrayForAddEmployees;
    private int size;

    public EmployeeBook() {



        Employees employeeIvan = new Employees("1", "Иван Иванов", "юридический отдел", 50_145);
        Employees employeeFedor = new Employees("2", "Федор Румянцев", "техничский отдел", 70_445);
        Employees employeeAnastasia = new Employees("3", "Анастасия Сидорова", "финансовый отдел", 56_132);
        Employees employeeAndrey = new Employees("4", "Андрей Копылов", "отдел закупок", 52_545);
        Employees employeeViktor = new Employees("5", "Виктор Станиславский", "отдел маркетинга", 65_346);

        this.employees = new Employees[5];

        this.employees[0] = employeeIvan;
        this.employees[1] = employeeFedor;
        this.employees[2] = employeeAnastasia;
        this.employees[3] = employeeAndrey;
        this.employees[4] = employeeViktor;


//      новый массив для добавления сотрудников
        this.arrayForAddEmployees = new Employees[5];

    }




//    вспомогательный метод, сортирует зарплаты сотрудников
    private int[] sortArray() {
        int[] arrayWithSalaryOfEmployees = new int[5];
        for(int i = 0; i <= employees.length - 1; i++ ) {
            arrayWithSalaryOfEmployees[i] = employees[i].getSalaryEmployee();
        }
        Arrays.sort(arrayWithSalaryOfEmployees);
        return arrayWithSalaryOfEmployees;
    }


//    вывод всех сотрудников
    public void outputAllEmployees() {
        System.out.println("Список всех сотрдуников: ");
        for(int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getFullNameEmployee() + ", ");
        }
    }


//   подсчет суммы всех зарплат сотрудников
    public void computedSumAmountOfWages() {
        System.out.println();
        int sum = 0;
        for(int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryEmployee();
        }
        System.out.println("Сумма всех зарплат сотрудников " + sum);

    }

//    подсчет средней суммы зарплаты сотрудников
    public void computedAverageSumAmountOfWages() {
        double averageSum = 0;
        for(int i = 0; i < employees.length; i++) {
            averageSum += employees[i].getSalaryEmployee();
        }
        averageSum /= employees.length;

        System.out.println("Средняя сумма зарплат сотрдуников " + averageSum);

    }


//   поиск сотрудника с минимальной и максимальной зарплатой
    public void getEmployeeWithMinAndMaxSalary() {
        int[] arrSortWithEmployee = sortArray();

        for(int i = 0; i < employees.length - 1; i++) {
            if( employees[i].getSalaryEmployee() == arrSortWithEmployee[0] ) {
                System.out.println("Сотрудник с минимальной зарплатой - " + employees[i].getFullNameEmployee());
            } else if (employees[i].getSalaryEmployee() == arrSortWithEmployee[arrSortWithEmployee.length - 1]) {
                System.out.println("Сотрудник с максимальной зарплатой - " + employees[i].getFullNameEmployee());
            }

        }
    }







// добавление нового сотрудника
    public void addEmployee(String employeeId, String fullNameEmployee, String department, int salary) {
        if (Employees.count >= employees.length) {
            System.out.println("FirstEmployee book is full. Adding a new employee to addEmployees array.");
        }
        Employees newEmployees = new Employees(employeeId, fullNameEmployee, department, salary);
        arrayForAddEmployees[size++] = newEmployees;
        System.out.println(newEmployees);
    }

//    удаление сотрудника

    public void removeEmployee(String employeeId) {
        for (int i = 0; i < arrayForAddEmployees.length; i++) {
            if (arrayForAddEmployees[i].getId().equals(employeeId)) {
                System.out.println("Сотрудник(ца) " + arrayForAddEmployees[i].getId() + " удален(а)");
                System.arraycopy(arrayForAddEmployees, i + 1, employees, i, size - i - 1);
                arrayForAddEmployees[size - 1] = null;
                size--;
                return;
            }
        }
    }


//    изменение данных сотрудника

    public void changeEmployee(String employeeId, String fullNameEmployee, String department, int salary) {
        for (int i = 0; i < size; i++) {
          if(arrayForAddEmployees[i].getFullNameEmployee().equals(fullNameEmployee)) {
              arrayForAddEmployees[i] = new Employees(employeeId, fullNameEmployee, department, salary);
              System.out.println("Данные сотрудника изменены на: " + arrayForAddEmployees[i].toString());
          }
        }
        System.out.println("Сотрудник " + fullNameEmployee + " не найден");
    }

//   вывод всех сотрудников с их департаментами
    public void printAllEmployeesFromDepartment(String department) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getDepartmentEmployee() == department) {
                System.out.println("Сотрудники " + employees[i].getFullNameEmployee() + ": " + employees[i].getDepartmentEmployee());
            }
        }
    }

}
