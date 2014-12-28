package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name="clienteBean")
@SessionScoped
public class ClienteBean {
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	private String nome;
	
	private String cargo;
	
	public void InserirCliente(ActionEvent actionEvent){
		try {
			Thread.sleep(3000);
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Cliente inserido com sucesso"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
