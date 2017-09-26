/*This driver will ask a user to enter details to create a bicycle and carries out
* calculations.*/

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
      String name1,name2;
      float value1,value2;
      String make1,make2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name of the owner for bike 1:");
        name1 = input.nextLine();

        System.out.print("Please enter the value of the bicycle for bike 1:");
        value1 = input.nextInt();

        System.out.print("Please enter the name of the bicycle for bike 1:");
        make1 = input.nextLine();


        System.out.println("\n\nCalling the no-argument constructor");
        Bicycle bike2 = new Bicycle();
        System.out.println("\nThe Second Bicycle: " + bike2);

        System.out.print("Please enter the name of the owner for bike 2");
        name2 = input.nextLine();

        System.out.print("Please enter the value of the bicycle for bike 2");
        value2 = input.nextInt();

        System.out.print("Please enter the make of the bicycle for bike 2");
        make2 = input.nextLine();


        bike2.setOwner(name2);
        bike2.setValue(value2);
        bike2.setMake(make2);

        Bicycle bike1 = new Bicycle(name1,value1,make1);
        System.out.println("\nThe First Bicycle: " + bike1);

    }
}
