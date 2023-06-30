package Interface;

public interface EmployeeInterface {
    Employee search(String name);
    Employee oldestEmployee();
    Employee smallestEmployee();
    void addEmployee(Employee e);
    void deleteEmployee(int id);
    void printEmployee();
}
