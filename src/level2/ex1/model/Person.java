package level2.ex1.model;

public class Person {
    String name;
    String surnames;
    int age;

    public Person(int age, String name, String surnames) {
        this.age = age;
        this.name = name;
        this.surnames = surnames;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                '}';
    }
}
