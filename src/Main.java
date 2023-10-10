import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your first coordinate point: ");
        String firstPoint = s.nextLine();
        System.out.print("Enter your second coordinate point: ");
        String secondPoint = s.nextLine();
        System.out.println();

        // gets integer values without parentheses and commas
        int commaIndex = firstPoint.indexOf(","); // retrieves the index of the commas
        int commaIndex2 = secondPoint.indexOf(",");
        int x1 = Integer.parseInt(firstPoint.substring(1, commaIndex));
        int y1 = Integer.parseInt(firstPoint.substring(commaIndex + 1, firstPoint.length() - 1));
        int x2 = Integer.parseInt(secondPoint.substring(1, commaIndex2));
        int y2 = Integer.parseInt(secondPoint.substring(commaIndex2 + 1, secondPoint.length() - 1));

        // creates an object and prints out required information
        LinearEquation points = new LinearEquation(x1, y1, x2, y2);
        System.out.println(points);

        // asks user for third x value to solve for respective y value
        System.out.print("Enter a third x-value: ");
        String inputtedX = s.nextLine();
        double newXVal = Double.parseDouble(inputtedX);
        double yInt = points.getYIntercept(x1, y1, x2, y2);
        double newYVal = points.solvedYCoordinate(newXVal, yInt, x1, y1, x2, y2);
        System.out.print("The solved coordinate point is: (" + newXVal + "," + newYVal + ")");




        



    }
}