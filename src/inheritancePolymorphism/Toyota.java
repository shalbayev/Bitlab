package inheritancePolymorphism;

public class Toyota extends Car{
    String manufacturer;

    public Toyota() {
    }
    /*Например, если name = "Toyota", model = "Camry", maxSpeed = 230, year = 2015, volume = 2.7, manufacturer = "Japan", то тогда текст вывода будет:

            "Toyota Car Toyota Camry with max speed 230 km/h from 2015 year with engine volume 2.7 liters manufactured from Japan is riding."*/
    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    @Override
    String ride() {
        return  name + " Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters manufactured from " + manufacturer + " is riding";

    }
}
