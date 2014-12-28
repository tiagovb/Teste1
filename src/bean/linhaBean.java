package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean(name="linhaBean")
@SessionScoped
public class linhaBean {
	private CartesianChartModel linhaModel;

	public CartesianChartModel getLinhaModel() {
		return linhaModel;
	}
	
	public linhaBean(){
		popularLinhaModel();
	}

	private void popularLinhaModel() {
		linhaModel = new CartesianChartModel();
		
		ChartSeries candidato1 = new ChartSeries();
		
		candidato1.setLabel("Candidato 1");
		candidato1.set("Pesquisa 1", 10);
		candidato1.set("Pesquisa 2", 20);
		candidato1.set("Pesquisa 3", 40);
		candidato1.set("Pesquisa 4", 25);
		
ChartSeries candidato2 = new ChartSeries();
		
		candidato2.setLabel("Candidato 2");
		candidato2.set("Pesquisa 1", 20);
		candidato2.set("Pesquisa 2", 40);
		candidato2.set("Pesquisa 3", 30);
		candidato2.set("Pesquisa 4", 18);
		
ChartSeries candidato3 = new ChartSeries();
		
		candidato3.setLabel("Candidato 3");
		candidato3.set("Pesquisa 1", 40);
		candidato3.set("Pesquisa 2", 30);
		candidato3.set("Pesquisa 3", 20);
		candidato3.set("Pesquisa 4", 15);
		
		
		linhaModel.addSeries(candidato1);
		linhaModel.addSeries(candidato2);
		linhaModel.addSeries(candidato3);		
	}
	
}
