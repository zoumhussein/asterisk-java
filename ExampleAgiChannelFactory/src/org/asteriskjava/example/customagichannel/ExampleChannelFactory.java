package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.internal.AgiChannelFactory;
import org.asteriskjava.fastagi.internal.AgiReader;
import org.asteriskjava.fastagi.internal.AgiWriter;
import org.asteriskjava.util.SocketConnectionFacade;

public class ExampleChannelFactory implements AgiChannelFactory {

	@Override
	public AgiChannel Create(AgiRequest request, SocketConnectionFacade socket) {
		return new ExampleChannel(request, socket);
	}

	@Override
	public AgiChannel Create(AgiRequest request, AgiWriter agiWriter,
			AgiReader agiReader) {
		return new ExampleChannel(request, agiWriter, agiReader);
	}

}
