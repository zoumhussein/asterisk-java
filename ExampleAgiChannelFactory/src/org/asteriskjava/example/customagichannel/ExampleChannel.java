package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.AgiRequest;
import org.asteriskjava.fastagi.internal.AgiChannelImpl;
import org.asteriskjava.fastagi.internal.AgiReader;
import org.asteriskjava.fastagi.internal.AgiWriter;
import org.asteriskjava.util.SocketConnectionFacade;

public class ExampleChannel extends AgiChannelImpl {

	ExampleChannel(AgiRequest request, AgiWriter agiWriter, AgiReader agiReader) {
		super(request, agiWriter, agiReader);
	}

	ExampleChannel(AgiRequest request, SocketConnectionFacade socket) {
		super(request, socket);
	}
	
	public String getExampleValue() {
		return "example";
	}

}
