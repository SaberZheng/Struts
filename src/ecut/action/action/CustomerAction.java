package ecut.action.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class CustomerAction implements Action {
	
	private static final Logger logger = LogManager.getLogger();

	@Override
	public String execute() throws Exception {
		logger.info( "我执行了" );
		return SUCCESS;
	}
	
	public String register() throws Exception {
		logger.info( "register" );
		return SUCCESS;
	} 
	
	public String login() throws Exception {
		logger.info( "login" );
		return SUCCESS;
	} 
	
	public String logout() throws Exception {
		logger.info( "logout" );
		return SUCCESS;
	} 

}
