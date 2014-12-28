package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name="pizzaBean")
@SessionScoped
public class pizzaBean {
	
	private PieChartModel pizzaModel;
	
	public PieChartModel getPizzaModel() {
		return pizzaModel;
	}

	public pizzaBean(){
		criarPizzaModel();
	}

	private void criarPizzaModel() {
		pizzaModel = new PieChartModel();
		
		pizzaModel.set("Candidato 1", 50);
		pizzaModel.set("Candidato 2", 25);
		pizzaModel.set("Candidato 3", 15);
		pizzaModel.set("Candidato 4", 10);
		
	}
}
