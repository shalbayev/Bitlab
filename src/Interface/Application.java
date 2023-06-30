package Interface;

public class Application implements EmployeeInterface{
    Employee[] employees = new Employee[1000];
    int count = 0;
    @Override
    public Employee search(String name) {
        int index = 0;
        for (int i = 0; i < count; i++) {
            if(employees[i].getFullName().equals(name)){
                index = i;
            }
        }
        return employees[index];
    }

    @Override
    public Employee oldestEmployee() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < count; i++) {
            if(employees[i].getAge()>max){
                max = employees[i].getAge();
                index = i;
            }
        }
        return employees[index];
    }

    @Override
    public Employee smallestEmployee() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < count; i++) {
            if(employees[i].getAge()<min){
                min = employees[i].getAge();
                index = i;
            }
        }
        return employees[index];
    }

    @Override
    public void addEmployee(Employee e) {
        employees[count] = e;
        count++;
    }

    @Override
    public void deleteEmployee(int id) {
        employees[id] = null;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < count; i++) {
            if(employees[i]!=null){
                System.out.println(employees[i]);
            }
        }
    }
}
