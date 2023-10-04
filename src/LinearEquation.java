public class LinearEquation {
    private double firstX;
    private double firstY;
    private double secondX;
    private double secondY;
    private String slope;
    private double distance;
    private double yIntercept;

    public LinearEquation(double firstX, double firstY, double secondX, double secondY) {
        double x1 = firstX;
        double x2 = secondX;
        double y1 = firstY;
        double y2 = secondY;
    }

    public String slopeAsFraction(double x1, double x2, double y1, double y2) {
        double num = y2 - y1;
        double denom = x2 - x1;
        slope = num + "/" + denom;
        return slope;
    }

    public double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));
    }

    public double getYIntercept(double slopeAsDouble, double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        yIntercept =  y1 - (slope * x1);
        return yIntercept;
    }

    public String toString() {
        String str = "First pair: (" + firstX + "," + firstY + ")" + '\n' +
                "Second pair: (" + secondX + "," + ")" + '\n' +
                "Slope of line: " + slope + '\n' + "Y-intercept: " + yIntercept + '\n'
                + "Slope intercept form: " + "y = "
    }
}
