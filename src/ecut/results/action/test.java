/*package ecut.results.action;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import ecut.results.entity.Customer;

public class test {
	public static void main(String[] args) throws IOException {
		Customer c = new Customer();
		c.setPassword("123456");
		c.setConfirm("123456");
		c.setUsername("Amy");
		ObjectMapper  mapper = new ObjectMapper ();
		String json = mapper.writeValueAsString(c);
		System.out.println(json);
		Customer customer = mapper.readValue(json, Customer.class);
		System.out.println(customer.getUsername()+","+customer.getPassword());
		
		Map<?,?> map = mapper.readValue(json, Map.class);
		for(Map.Entry<?, ?> entry: map.entrySet()){
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
	}
}
*/