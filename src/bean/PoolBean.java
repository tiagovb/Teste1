package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "poolBean")
@SessionScoped
public class PoolBean {

	java.util.Date data;

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void incrementar() {
		count++;
	}

	public java.util.Date getData() {
		return new java.util.Date();
	}
}
