package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.DragDropEvent;

@ManagedBean(name = "dragDropEscolhaCarrosBean")
@SessionScoped
public class DragDropEscolhaCarrosBean {
	private List<Carro> carrosDisponiveis;
	private List<Carro> carrosSelecionados;
	
	public DragDropEscolhaCarrosBean(){
		carrosSelecionados = new ArrayList<Carro>();
		carrosDisponiveis = new ArrayList<Carro>();
		carrosDisponiveis.add(new Carro("Classic",2010,"Ar"));
		carrosDisponiveis.add(new Carro("Cobalt",2013,"Completo"));
		carrosDisponiveis.add(new Carro("Gol",2012, "Ar, Direção"));
		carrosDisponiveis.add(new Carro("Fiat Uno",2011, "Básico"));
		carrosDisponiveis.add(new Carro("Peugeout",2012, "Ar, Direção, Vidro"));
		carrosDisponiveis.add(new Carro("Celta",2009,"Direção"));
		carrosDisponiveis.add(new Carro("Hilux SW4",2008, "Completo"));
		carrosDisponiveis.add(new Carro("Corolla",2005, "Completo"));
	}
	
	
	public List<Carro> getCarrosSelecionados() {
		return carrosSelecionados;
	}


	public List<Carro> getCarrosDisponiveis() {
		return carrosDisponiveis;
	}
	
	public void onCarroSelecionado(DragDropEvent ddEvent){
		Carro carro = ((Carro)ddEvent.getData());
		
		carrosDisponiveis.remove(carro);
		carrosSelecionados.add(carro);
		
		
		
	}
}
