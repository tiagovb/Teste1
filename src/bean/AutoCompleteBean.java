package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "autoCompleteBean")
@SessionScoped
public class AutoCompleteBean {
	List<String> clientes;

	public AutoCompleteBean() {
		clientes = new ArrayList<String>();

		clientes.add("Antonio");
		clientes.add("Antonia");
		clientes.add("Alberto");
		clientes.add("Albania");
		clientes.add("Alessandra");
		clientes.add("Alex");
		clientes.add("Alexsandro");
	}

	private String cliente;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<String> complete(String busca) {
		List<String> results = new ArrayList<String>();

		for (String cliente : clientes) {
			if (cliente.toUpperCase().contains(busca.toUpperCase()))
				results.add(cliente);
		}
		return results;

	}

}
