/*This driver will establish a Vending Machine to release a can once a token is put in.
* The machine is also updated with more cans. */

public class Problem10 {
    public static void main(String[] args) {
              int tokens = 0;
              int cans = 2;

       System.out.println("Customer 1 arrives....");
       VendingMachine customer1 = new VendingMachine();
       System.out.println("\nNumber of cans and tokens in the first machine:\n" +
       customer1);

       System.out.println("\n\nCalling second customer:");
       VendingMachine customer5 = new VendingMachine(2,2);



       System.out.println("\nWhen Customer 5 comes to the machine, there are\n"
       + customer5);

       System.out.println("\n\nInserting the token into the vending machine:");

     customer5.tokenInsert(tokens);
     customer5.canLoss(cans - 1);
        customer5.fillUpT(tokens + 1);


       System.out.println("\nAfter token is inserted, in the vending machine there are\n" +
                customer5);


       customer5.fillUp(cans);


       customer5.getCanCount(cans);
       customer5.getTokenCount(tokens);


       System.out.println("\nThe current values of the vending machine are\n"
       + customer5);


    }
}
