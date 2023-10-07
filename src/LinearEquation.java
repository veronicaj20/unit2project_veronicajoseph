public class LinearEquation {
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;
    private int newX;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        firstX = x1;
        firstY = y1;
        secondX = x2;
        secondY = y2;
    }

    // returns the slope as a fraction
    public static String slopeAsFraction(double x1, double y1, double x2, double y2) {
        double num = y2 - y1;
        double denom = x2 - x1;
        return num + "/" + denom;
    }

    // returns the distance between the points
    public static double distance(double x1, double y1, double x2, double y2) {
        double calcDistance = Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));
        return Math.round(calcDistance * 100) / 100.0;
    }

    // gets the y intercept of the line
    public static double getYIntercept(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        return y1 - (slope * x1);
    }

    // solves the value for the y coord after receiving an x coord from the user
    public String solvedYCoordinate(double newX, double yIntercept, double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double x = newX * slope;
        double solvedYCoord = x + yIntercept;
        return "(" + newX + "," + solvedYCoord + ")";
    }

    // prints out all required information
    public String toString() {
        String slope = LinearEquation.slopeAsFraction(firstX, firstY, secondX, secondY);
        double slope2 = (double) (secondY - firstY) / (secondX - firstX);
        double distance = LinearEquation.distance(firstX, firstY, secondX, secondY);
        double yIntercept = LinearEquation.getYIntercept(firstX, firstY, secondX, secondY);
        String str = "First pair: (" + firstX + "," + firstY + ")" + '\n' +
                "Second pair: (" + secondX + "," + secondY + ")" + '\n' +
                "Slope of line: " + slope2 + '\n' + "Y-intercept: " + yIntercept + '\n'
                + "Slope intercept form: " + "y = " + slope + "x + " + yIntercept + '\n'
                + "Distance between points: " + distance;
        return str;
    }


}
