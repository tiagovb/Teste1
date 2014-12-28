package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

@ManagedBean(name = "DataGridBean")
@SessionScoped
public class DataGridBean {
	private List<ProdutoBean> produtos;

	public List<ProdutoBean> getProdutos() {
		return produtos;
	}

	private SelectItem[] listaCategorias;

	private ProdutoBean produtoSelecionado;

	private ProdutoBean[] produtosSelecionados;

	public ProdutoBean[] getProdutosSelecionados() {
		return produtosSelecionados;
	}

	public void setProdutosSelecionados(ProdutoBean[] produtosSelecionados) {
		this.produtosSelecionados = produtosSelecionados;
	}

	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(ProdutoBean produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public SelectItem[] getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(SelectItem[] listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public void setProdutos(List<ProdutoBean> produtos) {
		this.produtos = produtos;
	}

	public DataGridBean() {
		produtos = new ArrayList<ProdutoBean>();

		produtos.add(new ProdutoBean(1, "PS3", 999, 250, "Console"));
		produtos.add(new ProdutoBean(2, "XBOX", 799, 190, "Console"));
		produtos.add(new ProdutoBean(3, "WII", 699, 150, "Console"));
		produtos.add(new ProdutoBean(4, "IPhone 4S", 1699, 350, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(5, "Galaxy S3", 2199, 262, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(6, "IPad 3", 1799, 290, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(7, "IPhone 5", 2399, 120, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(8, "Notebool DELL XPS", 2999, 210,
				"Notebook"));
		produtos.add(new ProdutoBean(9, "Notebool Sony", 1999, 150, "Notebook"));
		produtos.add(new ProdutoBean(10, "Notebool Positivo", 1599, 110,
				"Notebook"));

		listaCategorias = new SelectItem[4];

		listaCategorias[0] = new SelectItem("", "Selecione");
		listaCategorias[1] = new SelectItem("Console", "Console");
		listaCategorias[2] = new SelectItem("Mobile/Tablet", "Mobile/Tablet");
		listaCategorias[3] = new SelectItem("Notebook", "Notebook");
	}

	public void onRowSelect(SelectEvent event) {
		FacesMessage mensagem = new FacesMessage("Produto Selecionado", 
				((ProdutoBean)event.getObject()).getNome());
		FacesContext.getCurrentInstance().addMessage(null, mensagem);
	}
	
	public void onRowUnselect(UnselectEvent event) {
		FacesMessage mensagem = new FacesMessage("Seleção removida", 
				((ProdutoBean)event.getObject()).getNome());
		FacesContext.getCurrentInstance().addMessage(null, mensagem);
	}

}
