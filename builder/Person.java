package builder;

public class Person {
    private String name;
    private int age;
    private double weight;
    private int heightInCm;

    private Person(Builder builder) {
        name       = builder.name;
        age        = builder.age;
        weight     = builder.weight;
        heightInCm = builder.heightInCm;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public String toString() {
        return "Name:   " + getName() + "\n" +
               "Age:    " + getAge() + "\n" +
               "Weight: " + getWeight() + "\n" +
               "Height: " + getHeightInCm();
    }

    public static class Builder{
        private final String name;
        private int age;
        private double weight;
        private int heightInCm;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder withHeightInCm(int heightInCm) {
            this.heightInCm = heightInCm;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
