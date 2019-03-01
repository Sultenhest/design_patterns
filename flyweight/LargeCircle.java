package flyweight;// import statements

/**
 * @author Simon Konstantyner <sultenhest @ gmail.com>
 * @date March 01, 2019
 */

public class LargeCircle implements Shape {
    final ShapeSize shapeSize = ShapeSize.LARGE; //intrinsic state - shareable
    private String color;                        //extrinsic state - supplied by client

    public LargeCircle(String color) {
        setColor(color);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println( "Drawing a " + shapeSize + " " + color + " circle..." );
    }

    @Override
    public void getHashcode() {
        System.out.println( this.hashCode() );
    }
}
