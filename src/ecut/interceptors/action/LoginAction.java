package ecut.interceptors.action;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction implements Action {
	
	private static Logger logger = LogManager.getLogger();

	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		logger.info( "username : " + username );
		logger.info( "password : " + password );
		
		ActionContext context = ActionContext.getContext();
		
		Map<String,Object> sessionMap = context.getSession();
		
		sessionMap.put( "username" , username );
		
		return SUCCESS ;
	}
	
	
	public String logout() throws Exception {
		
		System.out.println("logout");
		ActionContext context = ActionContext.getContext();
		
		Map<String,Object> sessionMap = context.getSession();
		
		sessionMap.remove( "username");
		
		return SUCCESS ;
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

}
