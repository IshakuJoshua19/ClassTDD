package Test.java;
import  Main.java.Maths;
import org.junit.*;

public class Mathtest {


    private Maths maths;

    @Before
    public void setup(){
        maths = new Maths();
    }


    @Test
    public void checkTheSumOfTwoNumbersEqualToThree(){
        int result = maths.addTwoNumbers(1,2);
        Assert.assertEquals(3,result);
    }

    @Test
    public void checkIfNumberIsPrime(){
        boolean isPrime = maths.numberIsPrime(7);
        Assert.assertTrue(isPrime);
    }
}

