package ecut.results.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.opensymphony.xwork2.Action;

import ecut.results.entity.Customer;

public class RegisterAction implements Action {
	
	private static final Logger logger = LogManager.getLogger();
	
	private String username ;
	private String password ;
	private String confirm ;
	
	private Customer customer ;

	@Override
	public String execute() throws Exception {
		
		if( customer != null ) {
			logger.info( "customer username : " + customer.getUsername() );
			logger.info( "customer password : " + customer.getPassword() );
			logger.info( "customer confirm : " + customer.getConfirm() );
		} else {
			logger.info( "username : " + username );
			logger.info( "password : " + password );
			logger.info( "confirm : " + confirm );
		}
		
		return SUCCESS;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	
}
