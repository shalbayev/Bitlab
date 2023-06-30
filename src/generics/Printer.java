package generics;

public class Printer<T>{
    private T value;


    public Printer() {
    }

    public Printer(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    void printValue(){
        System.out.println("Value is " + value);
    }

    void refresh(){
        value = null;
    }
}
