package classAndObjects;

public class Phone {
    String name;
    String model;
    int price;
    public Phone(String name, String model, int price){
        name = this.name;
        model = this.model;
        price = this.price;

    }
    public Phone(){

    }
    public String getData(){
        return name + " - "  + model + " for " + price + " KZT";
    }

}
