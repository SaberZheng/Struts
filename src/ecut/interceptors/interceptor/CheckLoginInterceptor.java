package ecut.interceptors.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 1、通过实现  com.opensymphony.xwork2.interceptor.Interceptor 接口 来实现自定义的拦截器类
 */
public class CheckLoginInterceptor implements Interceptor {

	private static final long serialVersionUID = -3115350062208083018L;
	
	public CheckLoginInterceptor() {
		System.out.println( "创建 CheckLoginInterceptor 的实例" );
	}

	@Override
	public void init() {
		System.out.println( "对 CheckLoginInterceptor 的实例进行初始化" );
	}

	@Override
	public String intercept( ActionInvocation invocation ) throws Exception {
		System.out.println( this);
		// 获得 Action 的上下文对象
		ActionContext context = invocation.getInvocationContext();
		// 获得正在被访问的 <action> 的名称
		String name = context.getName() ;
		System.out.println( "action name : " +  name +"准备执行");
		String resultName = "input" ;
		// 如果被访问的 <action> 的名称是 main
		if( "main".equals( name ) ) {
			Map<String,Object> sessionMap = context.getSession();
			if( sessionMap.containsKey( "username" ) ) {
				System.out.println( "即将执行: " + name  );
				resultName = invocation.invoke(); 
				System.out.println( name + "执行结束并返回: " + resultName );
			}
		} 
		
		if( "logout".equals( name ) ){
			resultName = invocation.invoke();
			System.out.println( name + "执行结束并返回: " + resultName );
		}
		
		return resultName ;
	}
	
	@Override
	public void destroy() {
	}

}
