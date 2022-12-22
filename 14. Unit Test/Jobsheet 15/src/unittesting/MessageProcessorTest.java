package unittesting;

import org.junit.Assert;
import org.junit.Test;

import unittest.MessageProcessor;

public class MessageProcessorTest {
    MessageProcessor mProcessor;

    public MessageProcessorTest() {
        mProcessor = new MessageProcessor();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up bro?");
    }

    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
