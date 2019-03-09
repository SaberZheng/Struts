package ecut.first.action;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisterAction {
	
	private static final Logger logger = LogManager.getLogger();
	
	private String username ;
	private String password ;
	private String confirm ;
	private char gender ;
	
	public String execute() throws Exception {
		
		System.out.println( "username : " + username );
		System.out.println( "password : " + password );
		System.out.println( "confirm : " + confirm );
		System.out.println( "gender : " + gender );
		
		logger.log( Level.ALL ,  "all message" );// Level.ALL
		
		logger.trace( "trace message" ); // 对应 logger.log(  Level.TRACE , message );
		logger.debug( "debug message" ); // 对应 logger.log( Level.DEBUG, message );
		logger.info( "info message" ); // 对应  logger.log( Level.INFO, message );
		logger.warn( "warn message" ); // 对应  logger.log( Level.WARN, message );
		logger.error( "error message" ); // 对应  logger.log( Level.ERROR, message );
		logger.fatal( "fatal message" ); // 对应  logger.log( Level.FATAL , message );
		logger.log( Level.FATAL , "FATAL" );
		
		logger.log( Level.OFF , "off message" );// Level.OFF
		
		return "成功" ;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
