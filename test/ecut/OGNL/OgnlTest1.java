package ecut.OGNL;

import java.util.Map;

import ecut.OGNL.entity.Customer;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest1 {

	public static void main(String[] args) throws OgnlException {
		/*OGNL是通常要结合Struts 2的标志一起使用，如<s:property value="#xx" /> 
		struts页面中不能单独使用，el可以单独使用 ${sessionScope.username} */
		OgnlContext context = new OgnlContext();
		//OgnlContext 实现了Map接口
		System.out.println( context instanceof Map );
		
		// Ognl.setValue( expression , root, value );
		Ognl.setValue( "customer" , context , new Customer() );  // Customer c = new Customer(); context.put( "customer" ,  c ) ;
		
		Ognl.setValue( "customer.username" , context , "张三丰"  ); // c.setUsername( "张三丰" );
		
		// JSP 表达式 : <%= c.getUsername() %>
		// EL 表达式: ${ customer.username }
		// OGNL 表达式 : customer.username(支持OGNL的环境，才可以使用)
		
		Object value = Ognl.getValue( "customer.username" , context ) ; // Ognl.getValue(expression, root)
		System.out.println( value );
		
	}

}
