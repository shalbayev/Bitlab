package inheritancePolymorphism;

public class Mercedes extends Car {
    String classType;

    public Mercedes() {
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }
/*Например, если name = "Mercedes", model = "E280", maxSpeed = 240, year = 2013, volume = 2.8, classType = "E", то тогда текст вывода будет:

"Mercedes Car Mercedes E280 with max speed 240 km/h from 2013 year with engine volume 2.8 liters with E class is riding"*/
    @Override
    String ride() {
        return  name + " Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters with " + classType  + " class is riding";

    }
}
