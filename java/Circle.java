/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/

public class Exercise2 {
 
   private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
