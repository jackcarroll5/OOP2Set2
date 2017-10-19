/* This class will be known as MyPoint where an x-y plane will be established.*/

public class MyPoint {
    private double xVal;
    private double yVal;

    public MyPoint()
    {
      setxVal(0);
      setyVal(0);
    }

    public MyPoint(double xVal,double yVal)
    {
     setxVal(xVal);
     setyVal(yVal);
    }

    public void setxVal(double xVal)
    {
        this.xVal = xVal;
    }

    public void setyVal(double yVal)
    {
        this.yVal = yVal;
    }

    public double getxVal()
    {
        return xVal;
    }

    public double getyVal()
    {
        return yVal;
    }

    public String toString()
    {
      return getxVal() + "," + getyVal();
    }

    public double moveHorizontally(double xVal)
    {
        this.xVal += xVal;
        return this.xVal;
    }

    public double moveVertically(double yVal)
    {
        this.yVal += yVal;
        return this.yVal;
    }

    public void translate(double xVal, double yVal)
    {
        this.xVal += xVal;
        this.yVal += yVal;
    }

    public double distanceFromOrigin(double xVal,double yVal)
    {
     double distance;

      distance = Math.sqrt((xVal * xVal) + (yVal * yVal));

      return distance;
    }
}