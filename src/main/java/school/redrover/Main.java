package school.redrover;

import static org.apache.commons.lang3.StringUtils.abbreviate;
import static school.redrover.HW11.MethodsMath.multiply;

public class Main {
    public static void main(String[] args) {
        System.out.println(multiply(2, 2) == 5);
        System.out.println(abbreviate("Hello world!",0,10));
    }
}