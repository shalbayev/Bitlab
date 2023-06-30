package inheritancePolymorphism;
//ctrl alt l
public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;
    public Car(){

    }
    public Car(String name, String model, int maxSpeed, int year, double volume){
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    /*Например, если name = "KIA", model = "RIO", maxSpeed = 220, year = 2012, volume = 2.2, то тогда текст вывода будет:

            "Car KIA RIO with max speed 220 km/h from 2012 year with engine volume 2.2 liters is riding."*/
    String ride(){
        return "Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters is riding";
    }
}