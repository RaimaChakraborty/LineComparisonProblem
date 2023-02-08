package com.linecomparison;
import java.util.Scanner;
public class LineComparisonOnEndPoints {
    public double lengthCalculate(double x1,double y1, double x2, double y2){
        double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LineComparisonOnEndPoints length = new LineComparisonOnEndPoints();
        double x1, y1, x2, y2, x3, y3, x4, y4;
        System.out.println("Considering the first line");
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        System.out.println("Considering the second line");
        System.out.println("Enter x and y coordinates of the third point: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        System.out.println("Enter x and y coordinates of the fourth point: ");
        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();
        /*Storing the line length in two different variables */
        Double firstLine = length.lengthCalculate(x1,y1,x2,y2);
        Double secondLine = length.lengthCalculate(x3,y3,x4,y4);
        /*Using equals method to check equality of two lengths*/
        if(firstLine.equals(secondLine)){
            System.out.println("The lines are equal");
        }
        else{
            System.out.println("The lines are not equal");
        }
        /*Using compareTo method to compare length of two lines*/
        int compare = firstLine.compareTo(secondLine);
        if(compare > 0){
            System.out.println("The first line is greater than the second line.");
        }
        else if(compare < 0){
            System.out.println("The second line is greater than the first line.");
        }
        else {
            System.out.println("Both the lines are equal");
        }
    }
}
