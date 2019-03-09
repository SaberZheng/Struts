package ecut.results.entity;

import java.io.Serializable;

import org.apache.struts2.json.annotations.JSON;

public class Customer implements Serializable {

	private static final long serialVersionUID = 7499870485797565944L;

	private String username;
	private String password;
	private String confirm;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JSON(serialize = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JSON(serialize = false)
	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

}
