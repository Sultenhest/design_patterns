package factory_method.ShapeExample;

public class ShapeFactory {
    public Shape createShape(String shape) {
        if( shape.toLowerCase().equals("triangle") ) {
            return new Triangle();
        } else if ( shape.toLowerCase().equals("circle") ) {
            return new Circle();
        }

        return null;
    }
}
