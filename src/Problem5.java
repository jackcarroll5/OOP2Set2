/*This driver will ask a user to enter details to create a bicycle and carries out
* calculations.*/

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
      String name1,name3;
      float value1,value3,price,totalVal;
      String make1,make3;

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter the name of the owner for bike 1: ");
        name1 = input.nextLine();

        System.out.print("Please enter the value of the bicycle for bike 1: ");
        value1 = input.nextFloat();
        input.nextLine();

        System.out.print("Please enter the name of the bicycle for bike 1: ");
        make1 = input.nextLine();

        Bicycle bike1 = new Bicycle(name1,value1,make1);


        System.out.println("\n\nCalling the no-argument constructor: ");
        Bicycle bike3 = new Bicycle();
        System.out.println("The Second Bicycle: " + bike3);

        System.out.print("\n\nPlease enter the name of the owner for bike 2: ");
        name3 = input.nextLine();

        System.out.print("Please enter the value of the bicycle for bike 2: ");
        value3 = input.nextFloat();
        input.nextLine();

        System.out.print("Please enter the make of the bicycle for bike 2: ");
        make3 = input.nextLine();

      bike3.setOwner(name3);
      bike3.setValue(value3);
      bike3.setMake(make3);

      bike3.getOwner();
      bike3.getValue();
      bike3.getMake();


      price = bike1.getValue();
      bike1.setValue(value1 + 10);

        System.out.println("\n\nThe First Bicycle's values are: " + bike1);
        System.out.println("\n\nThe values for Bicycle 2 are: " + bike3);

        totalVal = bike1.getValue() + bike3.getValue();

        System.out.println("\nThe total value of the bikes is: \n" + totalVal);


    }
}
