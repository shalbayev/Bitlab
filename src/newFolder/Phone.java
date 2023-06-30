package newFolder;

public class Phone {
    String name;
    String model;
    int price;
    public Phone(){

    }
    public Phone(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }
    String getData(){
        return name + " - " + model + " for " + price + "KZT";
    }
}
