package AbstractClass;

public class Chocolate extends Food{
    int weight;

    public Chocolate() {
    }

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    double getCalories() {
        return weight * 740;
    }
}
