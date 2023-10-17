import static org.junit.Assert.assertEquals;

import decathlon.*;
import heptathlon.*;
import decathlon.Deca400M;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UnitTests {

    private Class<?> classToTest;
    private double input;
    private int expected;

    public UnitTests(Class<?> classToTest, double input, int expected) {
        this.classToTest = classToTest;
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> testDataForCalculateCorrectResult() {
        return Arrays.asList(new Object[][]{
                {Deca100M.class, 5.0, 2640},
                {Deca110MHurdles.class, 14.83, 870},
                {Deca400M.class, 30, 1962},
                {DecaDiscusThrow.class, 53.26, 939},
                {DecaHighJump.class, 130.33, 252},
                {DecaJavelinThrow.class, 15, 95},
                {DecaLongJump.class, 503.4, 389},
                {DecaPoleVault.class, 540, 1035},
                {DecaShotPut.class, 30, 1731},
                {Hep100MHurdles.class, 13.50, 1050},
                {Hep200M.class, 24.56, 928},
                {HeptHightJump.class, 201.66, 1260},
                {HeptJavelinThrow.class, 60.59, 1066},
                {HeptLongJump.class, 325.56, 152},
                {HeptShotPut.class, 15.99, 927},
                //array elements: class that should be tested, input, expected
                // (class, input, expected)
                //currently the test won't execute if a value is outside of the boundary values.

        });
    }

    @Test
    public void testCalculateCorrectResult() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object instance = classToTest.getDeclaredConstructor().newInstance();
        //the Method call is used to receive calculateResult() and getScore() from each class.
        Method calculateResult = classToTest.getMethod("calculateResult", double.class);
        Method getResult = classToTest.getMethod("getScore");
        //calculateResult.invoke is calling the actual calculation from the specified class.
        calculateResult.invoke(instance, input);

        int actual = (int) getResult.invoke(instance);
        assertEquals(expected, actual);
    }
}