package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "autoCompleteBeanAvancado")
@SessionScoped
public class AutoCompleteBeanAvancado {
	List<String> contatos;

	public AutoCompleteBeanAvancado() {
		contatos = new ArrayList<String>();

		contatos.add("wesley@devmedia.com.br");
		contatos.add("alberto@devmedia.com.br");
		contatos.add("joao@devmedia.com.br");
		contatos.add("luciano@devmedia.com.br");
		contatos.add("marta@devmedia.com.br");

	}

	public List<String> complete(String busca) {
		List<String> resultados = new ArrayList<String>();
		for (String contato : contatos) {
			if (contato.toUpperCase().contains(busca.toUpperCase())) {
				resultados.add(contato);
			}
		}
		return resultados;
	}

	private List<String> contatosSelecionados;

	public List<String> getContatosSelecionados() {
		return contatosSelecionados;
	}

	public void setContatosSelecionados(List<String> contatosSelecionados) {
		this.contatosSelecionados = contatosSelecionados;
	}
}
