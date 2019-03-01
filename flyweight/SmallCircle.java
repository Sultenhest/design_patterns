package flyweight;

public class SmallCircle implements Shape {
    final ShapeSize shapeSize = ShapeSize.SMALL; //intrinsic state - shareable
    private String color;                        //extrinsic state - supplied by client

    public SmallCircle(String color) {
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
