package AbstractClass;

public class Burger extends Food {
    int meatAmount;
    int meatType;

    public Burger() {
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }

    @Override
    double getCalories() {
//        double result = 0;

        if (meatType == 1) {
            return getMeatAmount() * 560;
        } else if (meatType == 2) {
           return getMeatAmount() * 840;
        }
        else return 0;
    }
}
