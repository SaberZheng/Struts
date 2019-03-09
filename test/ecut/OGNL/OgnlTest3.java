package ecut.OGNL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ecut.OGNL.entity.Customer;
import ecut.OGNL.action.CustomerAction;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest3 {
	
	private OgnlContext root ;

	public @Before void init() throws OgnlException {
		root = new OgnlContext();
		Ognl.setValue( "customerAction" , root , new CustomerAction() );  
	}

	public @Test void testGetValue() throws OgnlException {
		Object value = Ognl.getValue( "customerAction.customer" , root ) ;
		System.out.println( value );
	}

	public @Test void testSetValue() throws OgnlException {
		Object value = Ognl.getValue( "customerAction.customer" , root ) ;
		System.out.println( value );
		Ognl.setValue( "customerAction.customer" , root , new Customer()  ); 
		Ognl.setValue( "customerAction.customer.username" , root , "张翠山" ); 
		value = Ognl.getValue( "customerAction.customer.username" , root ) ;
		System.out.println( value );
	}

	public @After void destory() {
	}

}
