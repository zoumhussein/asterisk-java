package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiException;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.BaseAgiScript;
import org.asteriskjava.util.Log;
import org.asteriskjava.util.LogFactory;

public class HelloAgiScript extends BaseAgiScript
{
    private final Log logger = LogFactory.getLog(this.getClass());

    public void service(AgiRequest request, AgiChannel channel) throws AgiException
    {
        logger.info("Channel type: " + channel.getClass().getName());

        answer();
        hangup();
    }
}