package inheritancePolymorphism;

public class Swimmer extends Sportsman{
    protected String style;
    protected double recordTime;
    public Swimmer(){

    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age,country);
        this.style = style;
        this.recordTime = recordTime;
    }
    /*Например, если fullName = "Ilyas Zhuanyshev", age = 30, country = "Kazakhstan", position = "butterfly", recordTime = 135, то тогда текст вывода будет:

            "Swimmer Ilyas Zhuanyshev from Kazakhstan, 30 years old with butterfly style swimmed in 135 seconds"*/
    @Override
    String play() {
        return "Swimmer " + fullName + " from " + country + ", " + age + " years old, with " + style + " style swimmed in " + recordTime + " seconds";
    }
}
