package org.asteriskjava.example.customagichannel;

import org.asteriskjava.fastagi.DefaultAgiServer;
import org.asteriskjava.fastagi.internal.AgiChannelFactory;
import org.asteriskjava.util.Log;
import org.asteriskjava.util.LogFactory;

public class TestAgiServer {

	private static final Log logger = LogFactory.getLog(TestAgiServer.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AgiChannelFactory factory = new ExampleChannelFactory();
		DefaultAgiServer server = new DefaultAgiServer(factory);
		
		try {
			logger.info("starting agi server");
			server.startup();
		} catch (Exception e) {
			logger.error("error, starting server",e);
		} 
	}

}
