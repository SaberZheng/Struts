package ecut.results.action;

import java.util.HashMap;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import ecut.results.entity.Customer;

public class JsonAction implements Action {

	private Customer customer;

	private Map<String, Integer> map;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String map() throws Exception {

		map = new HashMap<>();

		map.put("各种粉", 4);
		map.put("藜蒿炒腊肉", 5);
		map.put("瓦罐汤", 3);
		return SUCCESS;
	}

	public String bean() throws Exception {

		customer = new Customer();

		customer.setUsername("张三丰");
		customer.setPassword("hello2017");

		return SUCCESS;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

}
