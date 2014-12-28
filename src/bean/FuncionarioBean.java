package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name="funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	private String nome;
	
	private String funcao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void SalvarFuncinario(ActionEvent actionEvent){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Olá " + nome + ". Você trabalha como " + funcao + "."));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
