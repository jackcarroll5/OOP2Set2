
/*This driver will display a message that is sent by the sender to the recipient
* where a constructor will be used*/
public class Problem2 {
    public static void main(String[] args) {

     Message message1 = new Message();
        Message message2 = new Message("James O'Donoghue","Colm Cooper","Let's really fight for Sam next year, the minors will " +
                "be fantastic additions to the team.");

        System.out.println(message1.toString());
        System.out.println("\n\n" + message2.toString());


    }
}
