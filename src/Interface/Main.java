package Interface;

public class Main {
    public static void main(String[] args) {
        Programmers programmers = new Programmers(1, "bitlab2015", 50000, 20000, 0.9);
        System.out.println(programmers.getWorkerData());
        System.out.println("SALARY: "+programmers.getSalary());
        System.out.println((int)0.9);
    }
}
