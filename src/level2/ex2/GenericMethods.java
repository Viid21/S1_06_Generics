package level2.ex2;

import java.util.List;

public class GenericMethods {
    public static void genericMethod(List<?> objects){
        System.out.println(objects.toString());
    }
}