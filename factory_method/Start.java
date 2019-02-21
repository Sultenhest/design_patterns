package factory_method;

public class Start {
    public static void main(String[] args) {
        ApplePhoneFactory apf = new ApplePhoneFactory();

        Phone one = apf.createPhone("one");
        Phone two = apf.createPhone("two");

        System.out.println( "iPhoneOne: " + one.getPhoneName() + " | " + one.getClass() );
        System.out.println( "iPhoneTwo: " + two.getPhoneName() + " | " + two.getClass() );
    }
}
