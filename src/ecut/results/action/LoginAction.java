package ecut.results.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import ecut.results.entity.Customer;

public class LoginAction implements Action , ModelDriven<Customer> {
	
	private static final Logger logger = LogManager.getLogger();
	
	private Customer customer ;

	@Override
	public String execute() throws Exception {
		System.out.println( this );
		logger.info( "username : " + customer.getUsername() );
		logger.info( "password : " + customer.getPassword() );
		return SUCCESS;
	}
	
	@Override
	public Customer getModel() {
		logger.info( "调用 getModel方法" );
		//首先实现接口ModelDriven，其次通过getModel方法告诉Struts将参数封装到那个对象去
		if( this.customer == null ) {
			logger.info( "创建对象" );
			this.customer = new Customer();
		} 
		return  this.customer ;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
