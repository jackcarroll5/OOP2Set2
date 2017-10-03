/*This class will set up the cans and tokens for a vending machine*/

public class VendingMachine {

    private int cans;
    private int tokens;


    public VendingMachine()
    {
        setCans(0);
        setTokens(0);
    }

    public VendingMachine(int cans, int tokens)
    {
       setCans(cans);
       setTokens(tokens);
    }

    public void setCans(int cans)
    {
        this.cans = cans;
    }

    public void setTokens(int tokens)
    {
        this.tokens = tokens;
    }

    public int getCans()
    {
        return cans;
    }

    public int getTokens()
    {
        return tokens;
    }

    public static int tokenInsert(int tokens)
    {
        if (tokens > 0)
        {
        return tokens + 1;
        }
        else{
            return 0;
        }
    }

    public void canLoss(int cans)
    {
      setCans(cans);
    }


    public void fillUp(int cans)
    {
       setCans(getCans() + cans);
    }

    public static int getCanCount(int cans)
    {
       return cans;
    }

    public void fillUpT(int tokens)
    {
        setTokens(getTokens() + tokens);
    }

    public static int getTokenCount(int tokens)
    {
       return tokens;
    }

    public String toString()
    {
        return "Cans: " + getCans() + "\nTokens: " + getTokens();
    }

}
