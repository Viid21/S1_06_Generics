package level2.ex2;

import level2.ex2.model.Fruit;
import level2.ex2.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> genericList = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        genericList.add(new Person(12, "Andres", "Garcia"));
        genericList.add(new Fruit("apple"));
        genericList.add(1);
        genericList.add("Bedroom");

        GenericMethods.genericMethod(genericList);
        GenericMethods.genericMethod(strings);
    }
}
