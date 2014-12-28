package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name="contextMenuGalleryBean")
@RequestScoped
public class contextMenuGalleryBean {
	
	public void enviar(ActionEvent actionEvent){
		AdicionarMensagem("Envio realizado com sucesso.");
	}
	
	public void AdicionarMensagem(String mensagem){
		FacesMessage facesMensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,mensagem,null);
		FacesContext.getCurrentInstance().addMessage(null, facesMensagem);
	}
}
