package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static streamApi.EmployeeStream.printUniqueLastNames;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car("Toyota1", 500, 3.8);
//        Car car2 = new Car("Mercedes1", 480, 3.5);
//        Car car3 = new Car("Mercedes2", 471, 3.4); //
//        Car car4 = new Car("Toyota2", 452, 3.1);
//        Car car5 = new Car("Toyota3",451 , 2.8);
//        Car car6 = new Car("Mercedes3", 385, 2.7); //
//        Car car7 = new Car("Mercedes4", 384, 2.6);
//        Car car8 = new Car("Mercedes5", 342, 2.4);
//        Car car9 = new Car("Toyota4", 290, 2.3);
//        Car car10 = new Car("Toyota5", 285, 2.1);
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//        cars.add(car5);
//        cars.add(car6);
//        cars.add(car7);
//        cars.add(car8);
//        cars.add(car9);
//        cars.add(car10);
//
//        CarCity city = new CarCity(cars);
//
//        ArrayList<Car> myList = city.filterCars(385,471,2.1,3.4);
//
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println("Name: " + myList.get(i).getName() + " Max Speed: " + myList.get(i).getMaxSpeed() + " Engine Volume: " + myList.get(i).getEngineVolume());
//        }

        Employee em =  new Employee("Temirlan","Shalbayev",22,900.000);
        Employee em2 =  new Employee("Arman","Irisbekov",22,100.000);
        Employee em3 =  new Employee("Erka","Zhakhansha",22,10.000);
        List<Employee> employees = new ArrayList<>();
        employees.add(em);
        employees.add(em2);
        employees.add(em3);
        printUniqueLastNames(employees);


    }
}
