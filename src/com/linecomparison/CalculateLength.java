package com.linecomparison;
import java.util.Scanner;
public class CalculateLength {
    public double lengthCalculate(double x1,double y1, double x2, double y2){
        double length = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.sqrt(length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateLength length = new CalculateLength();
        double x1, y1, x2, y2;
        System.out.println("Enter x and y coordinates of the first point: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.println("Enter x and y coordinates of the second point: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        System.out.println("The length of the line is " + length.lengthCalculate(x1,y1,x2,y2));
    }
}
