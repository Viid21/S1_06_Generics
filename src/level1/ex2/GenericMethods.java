package level1.ex2;

public class GenericMethods {
    public static <T> void genericMethod(T arg1, T arg2, T arg3){
        System.out.println(arg1 + ", " + arg2 + ", " + arg3 + ".");
    }
}