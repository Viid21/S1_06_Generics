package level3;

import level3.model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        Generics.getPhone(smartphone);
        Generics.getSmartphone(smartphone);
    }
}
