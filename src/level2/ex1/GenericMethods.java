package level2.ex1;

public class GenericMethods {
    public static <T> void genericMethod(T arg1, T arg2, String fruit){
        System.out.println(arg1 + ", " + arg2 + ", " + fruit + ".");
    }
}