package AbstractClass;

public class SphereGold extends GoldShape {
    double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume(){
        return 4/3*3.14* (Math.pow(radius,3));
    }
}
