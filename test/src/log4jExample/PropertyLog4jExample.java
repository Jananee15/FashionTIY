package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyLog4jExample {

	static Logger logger= Logger.getLogger(PropertyLog4jExample.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4jExample.properties");
		logger.debug("This is a debug");
		logger.info("This is a info");
		logger.warn("This is a warn");
		logger.error("This is a error");
		logger.fatal("This is a fatal");
		
	}
}
