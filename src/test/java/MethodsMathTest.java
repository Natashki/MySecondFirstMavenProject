import org.testng.Assert;
import org.testng.annotations.Test;

import static school.redrover.HW11.MethodsMath.*;
import static org.apache.commons.lang3.StringUtils.abbreviate;

//import static school.redrover.Main.multiply;

public class MethodsMathTest {

    @Test
    public void testMultiply(){
//        System.out.println(multiply(2, 2) == 5);
        Assert.assertEquals(multiply(2, 2), 4);
    }

    @Test
    public void testPlus(){
        Assert.assertEquals(plus(2, 2), 4);
    }

    @Test
    public void testMinus(){
        Assert.assertEquals(minus(2, 2), 0);
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(divide(2, 2), 1);
    }

    @Test
    public void testAbb(){
        Assert.assertEquals(abbreviate("Привет всем кто живет на луне!", 0,10), "Привет ...");
        Assert.assertEquals(abbreviate("Привет всем кто живет на луне!", 0,20), "Привет всем кто ж...");
    }


}
