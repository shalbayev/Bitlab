package generics;

import java.util.List;

public class Box <T>{
    List<T> contents;

    public Box() {
    }

    public Box(List<T> contents) {
        this.contents = contents;
    }

    void add(T item){
        contents.add(item);
    }

    public void setContents(List<T> contents) {
        this.contents = contents;
    }

    public List<T> getContents() {
        return contents;
    }
}
