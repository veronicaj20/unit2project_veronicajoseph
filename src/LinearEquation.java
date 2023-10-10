public class LinearEquation {
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        firstX = x1;
        firstY = y1;
        secondX = x2;
        secondY = y2;
    }

    // returns the slope as a fraction
    public String slopeAsFraction(double x1, double y1, double x2, double y2) {
        double num = y2 - y1;
        double denom = x2 - x1;
        return num + "/" + denom;
    }

    // returns the slope as a double
    public double slope(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        return (double) Math.round(slope * 100) / 100;
    }

    // returns the distance between the points
    public double distance(double x1, double y1, double x2, double y2) {
        double calcDistance = Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));
        return (double) Math.round(calcDistance * 100) / 100;
    }

    // gets the y intercept of the line
    public double getYIntercept(double x1, double y1, double x2, double y2) {
        double slope = slope(x1, y1, x2, y2);
        return y1 - (slope * x1);
    }

    // solves the value for the y after receiving an x value from the user
    public double solvedYCoordinate(double newX, double yIntercept, double x1, double y1, double x2, double y2) {
        double slope = slope(x1, y1, x2, y2);
        double slopeTimesInput = newX * slope;
        return (double) Math.round((slopeTimesInput + yIntercept) * 100) / 100;
    }

    // prints out all required information
    public String toString() {
        double slope = slope(firstX, firstY, secondX, secondY);
        String slope2 = slopeAsFraction(firstX, firstY, secondX, secondY);
        double distance = distance(firstX, firstY, secondX, secondY);
        double yIntercept = getYIntercept(firstX, firstY, secondX, secondY);
        String str = "First pair: (" + firstX + "," + firstY + ")" + '\n' +
                "Second pair: (" + secondX + "," + secondY + ")" + '\n' +
                "Slope of line: " + slope + '\n' + "Y-intercept: " + yIntercept + '\n'
                + "Slope intercept form: " + "y = " + slope2 + "x + " + yIntercept + '\n'
                + "Distance between points: " + distance;
        return str;
    }


}
