package level3;

import level3.interfaces.Phone;
import level3.model.Smartphone;

public class Generics {
    public static <T extends Phone> void getPhone(T phone){
        phone.call();
    }

    public static <T extends Smartphone> void getSmartphone(T smartphone){
        smartphone.call();
        smartphone.makeFotos();
    }
}
