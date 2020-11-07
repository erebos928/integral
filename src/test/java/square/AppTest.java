package square;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    SquareIntegralCalculator calculator = new SquareIntegralCalculator();
    @BeforeEach
    public void setup(){
        calculator.setUpperBound(2);
        calculator.setLowerBound(0);
    }
    @Test
    public void checkResult()
    {
        assertTrue(3.0 == calculator.calculate());
    }
}
