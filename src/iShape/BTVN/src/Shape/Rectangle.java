package Shape;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return this.width*this.length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}