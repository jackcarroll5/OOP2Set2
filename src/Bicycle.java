/*This class definition will contain an ownner's name, value and make of a bicycle*/

public class Bicycle {

    private String owner;
    private float value;
    private String make;

    public Bicycle()
    {
     setOwner("No name");
     setValue(0);
     setMake("No make");
    }


    public Bicycle(String owner,float value,String make)
    {
      setOwner(owner);
       setValue(value);
       setMake(make);
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

   public void setValue(float value)
   {
       this.value = value;
   }

   public void setMake(String make)
   {
       this.make = make;
   }

    public String getOwner()
    {
        return owner;
    }

    public float getValue()
    {
        return value;
    }

    public String getMake()
    {
        return make;
    }


    public String toString()
    {
      return "\nOwner: " + getOwner() + "\nValue: " + getValue() + "\nMake: " + getMake();
    }

}
