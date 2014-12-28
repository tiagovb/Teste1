package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="tableContextBean")
@SessionScoped
public class TableContextBean {

	private List<ProdutoBean> produtos;
	
	public List<ProdutoBean> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoBean> produtos) {
		this.produtos = produtos;
	}

	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(ProdutoBean produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	private ProdutoBean produtoSelecionado;
	
	public TableContextBean(){
		produtos = new ArrayList<ProdutoBean>();		
		produtos.add(new ProdutoBean(1,"Laranja",2.5f,30, "Fruta"));
		produtos.add(new ProdutoBean(2,"Maça",1.8f,15, "Fruta"));
		produtos.add(new ProdutoBean(3,"Uva",1.5f,25, "Fruta"));
		produtos.add(new ProdutoBean(4,"Melão",3.7f,10, "Fruta"));
		produtos.add(new ProdutoBean(5,"Banana",1.8f,32, "Fruta"));		
	}
	
	public void removerProduto(){
		produtos.remove(produtoSelecionado);
	}
	
	
}
