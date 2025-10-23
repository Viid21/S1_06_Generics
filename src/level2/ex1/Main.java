package level2.ex1;

import level2.ex1.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(12, "Andres", "Garcia");
        GenericMethods.genericMethod(person, 257342, "apple");
    }
}
