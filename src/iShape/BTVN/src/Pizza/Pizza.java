package Pizza;

public class Pizza {
     double _price;
     IShape _shape;
    public double getPrice() {
        return _price;
    }
    public IShape getShape() {
        return _shape;
    }

    public Pizza(double _price, IShape _shape) {
        this._price = _price;
        this._shape = _shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "_price=" + _price +
                ", _shape=" + _shape +
                '}';
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public IShape get_shape() {
        return _shape;
    }

    public void set_shape(IShape _shape) {
        this._shape = _shape;
    }

}
