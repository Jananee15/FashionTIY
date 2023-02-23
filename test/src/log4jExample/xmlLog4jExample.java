package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class xmlLog4jExample {

	
		static Logger logger= Logger.getLogger(xmlLog4jExample.class);
		
		public static void main(String[] args) {
			
			
			DOMConfigurator.configure("log4jxml.xml");
			logger.debug("This is a debug");
			logger.info("This is a info");
			logger.warn("This is a warn");
			logger.error("This is a error");
			logger.fatal("This is a fatal");
	}

}
