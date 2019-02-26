package builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Simon").withAge(26).build();
        System.out.println(person);
    }

    /*
     * Telescopic anti-pattern implementation of Person
     * Person person = new Person(parameter1, paramater2, parameter3, parameter4, ..., parameter24);
     * How can we possible remember the correct order of parameters and the amount of
     * constructor-method-overloading will be insane. So stop it.
     */
}
