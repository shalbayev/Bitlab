package newfolder2;

public class Phone {
    private String name;
    private String model;
    private int price;

    Phone() {

    }

    Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getModel() {
        return model;
    }

    int getPrice() {
        return price;
    }

    void setName(String name) {
        this.name = name;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(int price) {
        this.price = price;
    }


    String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price <= 1000 && price >= 500) {
            return "MEDIUM";
        } else return "SIMPLE";
    }
}
