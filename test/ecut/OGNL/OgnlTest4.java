package ecut.OGNL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ecut.OGNL.action.CustomerAction;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest4 {
	
	private OgnlContext root ;

	public @Before void init() throws OgnlException {
		root = new OgnlContext();
		Ognl.setValue( "customerAction" , root , new CustomerAction() );  
	}

	public @Test void testGetValue() throws OgnlException {
		Object value = Ognl.getValue( "customerAction.login()" , root ) ;
		System.out.println( value );
	}

	public @Test void testSetValue() throws OgnlException {
	}

	public @After void destory() {
	}

}
