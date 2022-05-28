public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return this.getAge() > 18;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void increaseAge(int increase) {
        if (increase < 0) {
            throw new IllegalArgumentException("Increase is less, than zero");
        }
        this.age = age + increase;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name " + this.name + " Years " + this.age;
    }
}