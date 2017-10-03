/*This driver will show numerous equations involving fractions and creating the
* Fraction objects.*/

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
            int numerator = 0,denominator = 0;

        Scanner input = new Scanner(System.in);

        Fraction fraction1 = new Fraction();
        System.out.println("Testing the no-argument constructor.... " + fraction1);

        Fraction fraction2 = new Fraction(15,25);
        System.out.println("Testing the 2-argument constructor.... " + fraction2);

        Fraction fraction3 = new Fraction(10,20);

        System.out.println("Value of " + fraction2 + " + " + fraction3 + " is " + Fraction.add(fraction2,fraction3));

        System.out.println("Value of " + fraction2 + " - " + fraction3 + " is " + Fraction.subtract(fraction2,fraction3));

        System.out.println("Value of " + fraction2 + " * " + fraction3 + " is " + Fraction.multiply(fraction2,fraction3));

        System.out.println("Value of " + fraction2 + " / " + fraction3 + " is " + Fraction.divide(fraction2,fraction3));


    }
}
