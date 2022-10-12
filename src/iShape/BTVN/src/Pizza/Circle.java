package Pizza;

public class Circle implements IShape {
     double _radius;



    public double get_radius() {
        return _radius;
    }

    public void set_radius(double _radius) {
        this._radius = _radius;
    }

    public Circle(double _radius) {
        this._radius = _radius;
    }

    public double getArea() {
        return Math.PI * _radius * _radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_radius=" + _radius +
                '}';
    }
}
