import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employeeIvan = new Employee( "Иван Иванов", "юридический отдел", 50_145);
        Employee employeeFedor = new Employee( "Федор Румянцев", "техничский отдел", 70_445);
        Employee employeeAnastasia = new Employee( "Анастасия Сидорова", "финансовый отдел", 56_132);
        Employee employeeAndrey = new Employee("Андрей Копылов", "отдел закупок", 52_545);
        Employee employeeViktor = new Employee("Виктор Станиславский", "отдел маркетинга", 65_346);

        Employee[] employees = new Employee[10];

        employees[0] = employeeIvan;
        employees[1] = employeeFedor;
        employees[2] = employeeAnastasia;
        employees[3] = employeeAndrey;
        employees[4] = employeeViktor;



//        создание экземпляра объекта
        EmployeeBook employeeBook = new EmployeeBook(employees);


//        вывод списка всех сотрудников
        employeeBook.outputAllEmployees();

//        сумма затрат на зарплаты
        employeeBook.computedSumAmountOfWages();

//        средняя зарплата сотрудников
        employeeBook.computedAverageSumAmountOfWages();

//        нахождение сотрудника с минимальной и максимальной зарплатой
        employeeBook.getEmployeeWithMinAndMaxSalary();


//      добавление сотрудника
        employeeBook.addEmployee("Александ Македонский", "военное ведомство", 123_456);
        employeeBook.addEmployee("Иван Васильевич", "Государство Российское", 125_456);
        employeeBook.addEmployee("Иван Васильевич", "Государство Российское", 125_456);


//      удаление сотрудника по id
        employeeBook.removeEmployee(1);

        employeeBook.outputAllEmployees();
        employeeBook.computedSumAmountOfWages();

        employeeBook.computedAverageSumAmountOfWages();


//        изменение данных сотрудника
        employeeBook.changeEmployee("Иван Иванов", "юридический отдел", 45_500 );

//        вывод сотрдуников с их отделами
        employeeBook.printAllEmployeesFromDepartment("юридический отдел");


    }
}