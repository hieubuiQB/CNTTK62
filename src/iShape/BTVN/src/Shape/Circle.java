package Shape;

public class Circle extends Shape{
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}