package factory_method;

public class ApplePhoneFactory extends BasePhoneFactory {
    @Override
    public Phone createPhone(String phoneName) {
        Phone phone;

        if (phoneName.toLowerCase().equals("one")) {
            phone = new iPhoneOne();
        } else if ( phoneName.toLowerCase().equals("two") ) {
            phone = new iPhoneTwo();
        } else {
            throw new IllegalArgumentException("That phone doesn't exist");
        }

        return phone;
    }
}
