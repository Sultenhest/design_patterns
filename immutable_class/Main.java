package immutable_class;

public class Main {
    public static void main(String[] args) {
        Immutable immutableOne = new Immutable("Simon");
        Immutable immutableTwo = new Immutable("Simon2");

        System.out.println( immutableOne.getName() );
        System.out.println( immutableTwo.getName() );

        //immutable.name = "Cannot do this";
    }
}
