package ecut.results.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	
	private boolean t ;

	@Override
	public String execute() throws Exception {
		System.out.println(t);
		if( t ) {
			throw new RuntimeException( "出错了" );
		}
		return SUCCESS;
	}
	//jsp中的属性名要和get方法保持一致
	public boolean getThrow(){
		return this.t ;
	}
	
	public void setThrow( boolean t ) {
		this.t = t ;
	}

}
