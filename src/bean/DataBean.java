package bean;

import java.text.SimpleDateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.DateSelectEvent;

@ManagedBean(name = "dataBean")
@RequestScoped
public class DataBean {

	java.util.Date data;

	String dataFormatada;

	public String getDataFormatada() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (data != null)
			return sdf.format(data);
		return "";
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}

	public java.util.Date getData() {
		return data;
	}

	public void setData(java.util.Date data) {
		this.data = data;
	}

	public void printData() {
		System.out.println(data);
	}

	public void mostrarMsgMudancaData(DateSelectEvent event) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Data Selecionada", sdf.format(event.getDate())));
	}
}
