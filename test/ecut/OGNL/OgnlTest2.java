package ecut.OGNL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ecut.OGNL.entity.Customer;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest2 {

	private OgnlContext root;

	/* @Before 每次test都执行一次，@BeforeClass仅执行一次，方法得是静态的 */
	public @Before void init() throws OgnlException {
		root = new OgnlContext();
		Ognl.setValue("customer", root, new Customer());
		Ognl.setValue("customer.username", root, "张三丰");
	}

	public @Test void testGetValue() throws OgnlException {
		Object value = Ognl.getValue("customer.username", root);
		System.out.println(value);
	}

	public @Test void testSetValue() throws OgnlException {
		Object value = Ognl.getValue("customer.username", root);
		System.out.println(value);
		Ognl.setValue("customer.username", root, "张君宝");
		value = Ognl.getValue("customer.username", root);
		System.out.println(value);
	}

	public @After void destory() {
	}

}
