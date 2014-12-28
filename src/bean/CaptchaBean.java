package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


@ManagedBean(name="captchaBean")
@SessionScoped
public class CaptchaBean {
	public void Enviar(ActionEvent event){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso", "Captcha validado com sucesso");
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
