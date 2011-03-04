package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.internal.AgiChannelImpl;
import org.asteriskjava.fastagi.internal.AgiReader;
import org.asteriskjava.fastagi.internal.AgiWriter;

public class ExampleChannel extends AgiChannelImpl
{

    ExampleChannel(AgiRequest request, AgiWriter agiWriter, AgiReader agiReader)
    {
        super(request, agiWriter, agiReader);
    }

    public String getExampleValue()
    {
        return "example";
    }
}
