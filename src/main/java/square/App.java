package square;





import java.util.Arrays;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
    static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.log(Level.ALL,"sssssssssssssss");
        SquareIntegralCalculator calc = new SquareIntegralCalculator();
        calc.setLowerBound(0);
        calc.setUpperBound(1);

        logger.trace("this was a ");

        System.out.println( calc.calculate() );
    }
}
