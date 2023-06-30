package AbstractClass;

public class Coke extends Food{
    double volumeLiters;
    boolean isSparkling;

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean getIsSparkling() {
        return isSparkling;
    }

    public void setIsSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    double getCalories() {
        if(isSparkling){
            return volumeLiters * 400;
        } else if (!isSparkling) {
            return volumeLiters * 100;

        }
        else return 0;
    }
}
