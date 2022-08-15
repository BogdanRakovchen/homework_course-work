public class Employee {

    private final int id;
    private String fullNameEmployee;
    private String department;
    private int salary;

    public static int count = 1;

    public Employee(String fullNameEmployee, String department, int salary) {
        this.id = count++;
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public int getSalaryEmployee() {
        return salary;
    }

    public String getDepartmentEmployee() {
        return department;
    }

    @Override
    public String toString() {
        return id + " " + fullNameEmployee + " " + department + " " + salary;
    }

    public static String convertIntegerIdToStringId(int employeeId) {
        return "" + employeeId;
    }
}