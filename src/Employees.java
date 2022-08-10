public class Employees {

    private final String id;
    private String fullNameEmployee;
    private String department;
    private int salary;


    public Employees(String id, String fullNameEmployee, String department, int salary) {
        this.id = id;
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;

    }

    public String getId() {
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
}