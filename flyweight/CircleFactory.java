package flyweight;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Shape> shapesMap = new HashMap<>();

    private static Shape getShape(String color, ShapeSize shapeSize) {
        String key = color + "-" + shapeSize;
        Shape shape = shapesMap.get(key);

        if(shape != null) {
            System.out.println("FOUND : " + key + " circle");
            return shape;
        }

        System.out.println("CREATING : " + key + " circle");

        switch ( shapeSize ) {
            case SMALL:  shape = new SmallCircle( color );
                break;
            case MEDIUM: shape = new MediumCircle( color );
                break;
            case LARGE:  shape = new LargeCircle( color );
                break;
        }

        shapesMap.put(key, shape);

        return shape;
    }

    public static Shape getSmallShape(String color) {
        return getShape(color, ShapeSize.SMALL);
    }

    public static Shape getMediumShape(String color) {
        return getShape(color, ShapeSize.MEDIUM);
    }

    public static Shape getLargeShape(String color) {
        return getShape(color, ShapeSize.LARGE);
    }
}
