package level3.model;

import level3.interfaces.Phone;

public class Smartphone implements Phone {
    public void call(){
        System.out.println("Calling from the smartphone.");
    }

    public void makeFotos(){
        System.out.println("Making a photo from the smartphone.");
    }
}
