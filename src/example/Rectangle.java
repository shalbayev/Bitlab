package example;

public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    double getAre(){
        return width*height;
    }

    double getPerimeter(){
        return (width+height)*2;
    }
}
