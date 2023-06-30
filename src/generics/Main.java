package generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");
        List<String> stringContents = stringBox.getContents(); // ["Hello", "World"]
        System.out.println(stringContents);

        Box<Integer> intBox = new Box<>();
        intBox.add(1);
        intBox.add(2);
        List<Integer> intContents = intBox.getContents(); // [1, 2]
        System.out.println(intContents);

        Box<Object> objectBox = new Box<>();
        objectBox.add("Hello");
        objectBox.add(1);
        List<Object> objectContents = objectBox.getContents();
        System.out.println(objectContents);
    }
}
