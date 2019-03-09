package ecut.OGNL.action;

import ecut.OGNL.entity.Customer;

public class CustomerAction {
	
	private Customer customer ;

	public String execute() throws Exception {
		System.out.println( "execute" );
		return "execute" ;
	}
	
	public String login() throws Exception {
		System.out.println( "login" );
		return "login" ;
	}
	
	public String logout() throws Exception {
		System.out.println( "logout" );
		return "logout" ;
	}

	public Customer getCustomer() {
		System.out.println( "CustomerAction # getCustomer()" );
		return customer;
	}

	public void setCustomer(Customer customer) {
		System.out.println( "CustomerAction # setCustomer( Customer )" );
		this.customer = customer;
	}
	
}
