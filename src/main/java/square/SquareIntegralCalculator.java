package square;



public class SquareIntegralCalculator {
    private double upperBound;
    private double lowerBound;
    public double calculate(){
        //Logger logger = Logger.getLogger(SquareIntegralCalculator.class.getName());
        //logger.warning("hvnvnbv");
        return Math.pow(upperBound,2) - Math.pow(lowerBound,2);
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }
}
