/*This program will inititate a class called Animal where it will have attributes like the
age, the type, the continents the animal is found and the age.
 */


public class Animal {

    private String type;
    private String[] continents = new String[7];
    private float weight;
    private int age;

  public Animal()
    {
       setType("No Type Specified");
       setContinents(null);
       setWeight(0.0f);
       setAge(0);
    }

    public Animal(String type,String[] continents,float weight,int age)
    {
      setType(type);
      setContinents(continents);
      setWeight(weight);
      setAge(age);
    }

   public void setType(String type)
   {
       this.type = type;
   }

   public void setContinents(String[] continents)
   {
       this.continents = continents;
   }

   public void setWeight(float weight)
   {
       this.weight = weight;
   }

   public void setAge(int age)
   {
       this.age = age;
   }

   public String getType()
   {
       return type;
   }

   public String[] getContinents()
   {
       return continents;
   }

   public float getWeight()
   {
       return weight;
   }

   public int getAge()
   {
       return age;
   }


    public String toString()
    {
        String returning = "";

        if(continents != null)
        {
            for (int i = 1; i < continents.length; i++)
            {
                if (continents[i] != null)
                {
                    returning += " " + continents[i] + ",";
                }

            }
        }
       return String.format("\nName: %-20s  \nContinents: %-20s \nWeight: %5.2f \nAge: %-4d",getType(),returning,getWeight(),getAge());
    }
}
