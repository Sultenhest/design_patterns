package immutable_class;

public final class Immutable {
    private final String name;

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}