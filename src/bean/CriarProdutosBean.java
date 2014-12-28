package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="criarProdutosBean")
@SessionScoped
public class CriarProdutosBean {
	
	private ProdutoBean produto;
	
	public ProdutoBean getProduto() {
		return produto;
	}
	
	public String Reiniciar(){
		
		produto = new ProdutoBean();
		
		return null;
	}
	

	public void setProduto(ProdutoBean produto) {
		this.produto = produto;
	}

	public List<ProdutoBean> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoBean> produtos) {
		this.produtos = produtos;
	}

	private List<ProdutoBean> produtos;
	
	public CriarProdutosBean(){
		produto = new ProdutoBean();
		produtos = new ArrayList<ProdutoBean>();
	}
	
	
}
