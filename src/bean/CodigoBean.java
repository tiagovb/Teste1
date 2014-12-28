package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="codigoBean")
@RequestScoped
public class CodigoBean {
	private String codEnvio;

	public String getCodEnvio() {
		return codEnvio;
	}

	public void setCodEnvio(String codEnvio) {
		this.codEnvio = codEnvio;
	}
}
