package unittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageProcessorTest1841720184Yusril {

    MessageProcessor1841720184Yusril mProcessor;

// ini untuk junit dengan versi yang lebih lama/ kurang dari 4
//    public MessageProcessorTest1841720184Yusril(MessageProcessor1841720184Yusril mProcessor) {
//        mProcessor = new MessageProcessor1841720184Yusril();
//        mProcessor.setSenderYusril("Ronaldo");
//        mProcessor.setRecipientYusril("Rafael");
//        mProcessor.setMessageYusril("Whats up bro?");
//    }
    
    // ini untuk junit dengan versi 4 ke atas
    public MessageProcessorTest1841720184Yusril() {
    }

    @Before
    public void prepareTestData() {
        mProcessor = new MessageProcessor1841720184Yusril();
        mProcessor.setSenderYusril("Ronaldo");
        mProcessor.setRecipientYusril("Rafael");
        mProcessor.setMessageYusril("Whats up bro?");
    }

    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo."
                + "\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatYusril());
    }

}
