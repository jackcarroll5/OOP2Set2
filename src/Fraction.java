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

    public static Fraction add(Fraction f1,Fraction f2)
    {
        int numerator = f1.getNumerator() + f2.getNumerator();
        int denominator = f1.getDenominator() + f2.getDenominator();

        Fraction ans = new Fraction(numerator,denominator);

        return ans;
    }

    public static Fraction subtract(Fraction f1,Fraction f2)
    {
        int numerator = f1.getNumerator() - f2.getNumerator();
        int denominator = f1.getDenominator() - f2.getDenominator();

        Fraction ans = new Fraction(numerator,denominator);

        return ans;
    }

    public static Fraction multiply(Fraction f1,Fraction f2)
    {
        int numerator = f1.getNumerator() * f2.getNumerator();
        int denominator = f1.getDenominator() * f2.getDenominator();
                                                                               //fi.multiply(f2);
        Fraction ans = new Fraction(numerator,denominator);

        return ans;
    }

    public static Fraction divide(Fraction f1,Fraction f2)
    {
        int numerator = f1.getNumerator() / f2.getNumerator();
        int denominator = f1.getDenominator() / f2.getDenominator();

        Fraction ans = new Fraction(numerator,denominator);

        return ans;
    }

}
