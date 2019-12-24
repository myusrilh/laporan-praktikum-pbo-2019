/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author asus
 */
public class MessageProcessor1841720184Yusril {
    String sender, recipient, message;

    public String getSenderYusril() {
        return sender;
    }

    public void setSenderYusril(String sender) {
        this.sender = sender;
    }

    public String getRecipientYusril() {
        return recipient;
    }

    public void setRecipientYusril(String recipient) {
        this.recipient = recipient;
    }

    public String getMessageYusril() {
        return message;
    }

    public void setMessageYusril(String message) {
        this.message = message;
    }
    
    public String messageFormatYusril(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", this.recipient, this.sender, this.message);
        return message;
    }
    
    public void showMessageYusril(){
        System.out.println(messageFormatYusril());
    }
    
}
