import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1 circle area dn perimeter
        Scanner read = new Scanner(System.in);
        System.out.println("To calculate the area and perimeter of he circle,\nplease enter the radius of the circle:");
        double r = read.nextDouble();
        System.out.println("Radius : "+r);
        double Pi = 3.14;
        //Area of the circle
        double A = Pi*Math.pow(r ,2);
        //Perimeter o the circle
        double P = 2*Pi*r;
        System.out.println("Area of the circle is "+A);
        System.out.println("Perimeter of the circle is "+P);
        System.out.println("\n");
    }
}