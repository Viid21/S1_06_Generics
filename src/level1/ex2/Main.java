package level1.ex2;

import level1.ex2.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(12, "Andres", "Garcia");
        GenericMethods.genericMethod(person.toString(), 257342, "potato");
    }
}
