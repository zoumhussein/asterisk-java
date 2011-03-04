package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.internal.AgiChannelFactory;
import org.asteriskjava.fastagi.internal.AgiReader;
import org.asteriskjava.fastagi.internal.AgiWriter;

public class ExampleChannelFactory implements AgiChannelFactory
{
    @Override
    public AgiChannel createAgiChannel(AgiRequest request, AgiWriter agiWriter, AgiReader agiReader)
    {
        return new ExampleChannel(request, agiWriter, agiReader);
    }
}
