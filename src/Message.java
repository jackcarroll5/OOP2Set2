

public class Message {

    private String sender;
    private String recipient;
    private String message;

    public Message()
    {
        setSender("No Sender");
        setRecipient("No Recipient");
        setMessage("No Message");
    }

    public Message(String sender, String recipient,String message)
    {
       setSender(sender);
        setRecipient(recipient);
       setMessage(message);
    }


    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getSender()
    {
        return sender;
    }

    public String getRecipient()
    {
        return recipient;
    }


    public String getMessage()
    {
        return message;
    }

    public String toString()
    {
        return String.format("From: %-30s  \nTo: %-30s \nMessage: %-30s",getSender(),
                getRecipient(),getMessage());
    }

    public String append()
    {

        return "";
    }


}
