package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "botaoDireitoBean")
@RequestScoped
public class BotaoDireitoBean {
	
	public void acessarWIFI(ActionEvent actionEvent){
		AdicionarMensagem("Conexão realizada com sucesso ao WIFI.");
	}
	
	public void salvar(ActionEvent actionEvent){
		AdicionarMensagem("Operação salva com sucesso.");
	}
	
	public void AdicionarMensagem(String mensagem){
		FacesMessage facesMensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,mensagem,null);
		FacesContext.getCurrentInstance().addMessage(null, facesMensagem);
	}
}
