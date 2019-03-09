package ecut.results.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import ecut.results.entity.Customer;

public class CustomerAction implements Action , ModelDriven<Customer>{
	
	private Customer customer ;

	@Override
	public String execute() throws Exception {
		System.out.println( "execute" );
		return SUCCESS;
	}
	
	public String login() throws Exception {
		System.out.println( "login" );
		// 获得 当前正在执行的 Action 的 上下文对象
		ActionContext context = ActionContext.getContext();
		// 通过 ActionContext 的 getSession 来获得 与 HttpSession 对应的 Map 集合
		// 针对这个 Map 的 所有操作 都会立即 "同步" 到 HttpSession 对象中
		Map< String , Object > sessionMap = context.getSession();
		if( "zhangsanfeng".equals( customer.getUsername() ) && "hello2017".equals( customer.getPassword() ) ){
			sessionMap.put( "customer" ,  this.customer ) ; // 由拦截器去完成这个操作session.setAttribute( "customer" , this.customer );
			return SUCCESS;
		} else {
			sessionMap.put( "error_message" ,  "用户名或密码错误" );
			return  INPUT;
		}
		
	}
	
	public String logout() throws Exception {
		System.out.println( "logout" );
		ActionContext context = ActionContext.getContext();
		Map< String , Object > sessionMap = context.getSession();
		sessionMap.remove( "customer" ) ; // session.removeAttribute( "customer" );
		return SUCCESS;
	}

	@Override
	public Customer getModel() {
		if( this.customer == null ){
			this.customer = new Customer();
		}
		return this.customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
