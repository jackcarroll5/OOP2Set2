/*This class definition will set up a fraction featuring a numerator and denominator*/

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction()
    {
      setNumerator(0);
      setDenominator(1);
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int numerator )
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }


    public String toString()
    {
      return getNumerator() + "/" + getDenominator();
    }

    public static int add(int numerator,int denominator)
    {
       return numerator/denominator + 10/20;
    }

    public static int subtract(int numerator,int denominator)
    {
        return numerator/denominator - 10/20;
    }

    public static int multiply(int numerator,int denominator)
    {
        return (numerator/denominator * 10/20);
    }

    public static int divide(int numerator,int denominator)
    {
        return (numerator/denominator / 10/20);
    }

}
