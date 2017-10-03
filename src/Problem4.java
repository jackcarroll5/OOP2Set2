/*This driver will manipulate x and y values to move horizontally and vertically based on point
* objects.*/

public class Problem4 {
    public static void main(String[] args) {

        double distance;

        MyPoint value1 = new MyPoint();

        MyPoint value2 = new MyPoint(3,5);

        System.out.println("First Point: " + value1.toString());
        System.out.println("Second Point: " + value2.toString());


         value2.moveHorizontally(4);
        System.out.println("\nThe new point for Point 2 is " + value2);


         value1.moveVertically(1);
        System.out.println("\nThe new point for Point 1 is: " + value1);


        distance = value2.distanceFromOrigin(value2.getxVal(),value2.getyVal());
         System.out.println("\nThe distance from the origin is: " + distance);



    }
}
