/*WAP in Java to demonstrate multiple inheritance using interfaces
 *--->Interface A
      --->has points as i/p parameters 
 *--->Interface B
      --->has length as i/p parameters
 *--->Create a class circle
      --->call both interfaces
      --->a circle has radius as length and center as a point
 *--->Display properties of 2 circles
      --->2 objects
      --->auto increment
      --->put values for each circle
      --->display the properties
 * O/P: -
      Circle 1: 
         Center coordinates = (x,y)
         Radius length = 2
      Circle 2:
         ---
         ---
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687

*/
import java.util.*;

// Interface A
interface A {
    void setPoint(int x, int y);
}

// Interface B
interface B {
    void setLength(int length);
}

// Circle class implementing both interfaces
class Circle implements A, B {
    private int x, y;                    // Center coordinates
    private int radius;                  // Radius length
    public int idNum;
    private static int nextID = 1;       // Auto-incremented ID

    Circle() {
        idNum = nextID++;
    }

    @Override
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setLength(int length) {
        this.radius = length;
    }

    public void displayProperties() {
        System.out.println("Circle " + idNum + ":");
        System.out.println("Center coordinates = (" + x + "," + y + ")");
        System.out.println("Radius length = " + radius);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of circles: ");
        int numberOfCircles = scanner.nextInt();

        Circle[] circles = new Circle[numberOfCircles];      //New Object created

        for (int i = 0; i < numberOfCircles; i++) {
            circles[i] = new Circle();

            System.out.println("Enter properties for Circle " + circles[i].idNum + ":");
            
            System.out.print("Enter x-coordinate: ");
            int x = scanner.nextInt();
            
            System.out.print("Enter y-coordinate: ");
            int y = scanner.nextInt();
            
            System.out.print("Enter radius length: ");
            int radius = scanner.nextInt();

            circles[i].setPoint(x, y);
            circles[i].setLength(radius);

            System.out.println();
        }

        System.out.println("Circle Properties:");
        for (Circle circle : circles) {
            circle.displayProperties();
        }

        scanner.close();
    }
}
