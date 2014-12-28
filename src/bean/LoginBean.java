package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {
	private String usuario;

	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void login(ActionEvent actionEvent) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage msg = null;

		boolean logado = false;

		if (usuario != null && usuario.equals("admin") && senha != null
				&& senha.equals("devmedia")) {
			logado = true;
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Seja bem-vindo", "Seja bem-vindo " + usuario);
		} else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Erro ao realizar login", "Login ou senha incorretos");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		context.addCallbackParam("logado", logado);
	}

}
