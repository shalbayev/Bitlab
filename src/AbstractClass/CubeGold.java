package AbstractClass;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double getVolume(){
        return Math.pow(side,3);
    }
}
