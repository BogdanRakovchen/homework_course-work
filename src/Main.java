import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        создание экземпляра объекта
        EmployeeBook employeeBook = new EmployeeBook();


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
        employeeBook.removeEmployee("1");

        employeeBook.outputAllEmployees();
        employeeBook.computedSumAmountOfWages();

        employeeBook.computedAverageSumAmountOfWages();


//        изменение данных сотрудника
        employeeBook.changeEmployee("1", "Иван Иванов", "юридический отдел", 45_500 );

//        вывод сотрдуников с их отделами
        employeeBook.printAllEmployeesFromDepartment("юридический отдел");


    }
}