package Pizza;

public class Rectangle implements IShape {
     double _width;
     double _height;
    public Rectangle(double w, double h) {
        _width = w;
        _height = h;
    }
    public double getArea() {
        return _width * _height;
    }

    public double get_width() {
        return _width;
    }

    public void set_width(double _width) {
        this._width = _width;
    }

    public double get_height() {
        return _height;
    }

    public void set_height(double _height) {
        this._height = _height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "_width=" + _width +
                ", _height=" + _height +
                '}';
    }
}