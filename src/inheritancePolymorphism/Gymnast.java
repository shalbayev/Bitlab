package inheritancePolymorphism;

public class Gymnast extends Sportsman{
    protected int height;
    protected int weight;
    protected String style;
    public Gymnast(){

    }
    public Gymnast(String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    String play() {
        return "Gymnast " + fullName + " from " + country + " " + age + " years old, " + weight + " kg, " + height + " cm, with " + style + " style is jumping.";
    }
}
