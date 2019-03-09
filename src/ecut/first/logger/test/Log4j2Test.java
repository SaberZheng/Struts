package ecut.first.logger.test;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {
	
	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.log( Level.ALL ,  "all message" );// Level.ALL
		
		logger.trace( "trace message" ); // 对应 logger.log(  Level.TRACE , message );
		logger.debug( "debug message" ); // 对应 logger.log( Level.DEBUG, message );
		logger.info( "info message" ); // 对应  logger.log( Level.INFO, message );
		logger.warn( "warn message" ); // 对应  logger.log( Level.WARN, message );
		logger.error( "error message" ); // 对应  logger.log( Level.ERROR, message );
		logger.fatal( "fatal message" ); // 对应  logger.log( Level.FATAL , message );
		logger.log( Level.FATAL , "FATAL" );
		
		logger.log( Level.OFF , "off message" );// Level.OFF
		
	}

}
