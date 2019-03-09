package ecut.interceptors.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ParamInterceptor implements Interceptor {

	private static final long serialVersionUID = 6273500806976834662L;
	
	private String interceptorParam ;
	
	public ParamInterceptor () {
		System.out.println( "创建实例ParamInterceptor" );
		System.out.println( "实例化 ParamInterceptor ，interceptorParam : " + interceptorParam );
	}

	@Override
	public void init() {
		System.out.println( "初始化 ParamInterceptor 实例 ， interceptorParam : " + interceptorParam );
	}

	@Override
	public String intercept( ActionInvocation invocation ) throws Exception {
		System.out.println( this  + " ，" + interceptorParam );
		ActionContext context = invocation.getInvocationContext();
		System.out.println( "准备执行: " + context.getName() );
		String resultName = invocation.invoke();
		System.out.println( "执行结束: " + context.getName() + " , 返回的 Result 名称是 : " + resultName );
		return resultName ;
	}
	
	@Override
	public void destroy() {
	}

	public String getInterceptorParam() {
		return interceptorParam;
	}

	public void setInterceptorParam(String interceptorParam) {
		this.interceptorParam = interceptorParam;
	}

}
