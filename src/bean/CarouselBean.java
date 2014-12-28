package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="carouselBean")
@SessionScoped
public class CarouselBean {
	List<ProdutoBean> produtos;
	
	ProdutoBean produtoSelecionado;
	
	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(ProdutoBean produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public List<ProdutoBean> getProdutos() {
		return produtos;
	}

	public CarouselBean(){
		produtos = new ArrayList<ProdutoBean>();
		
		produtos.add(new ProdutoBean(1,"PS3", 999, 250, "Console"));
		produtos.add(new ProdutoBean(2,"XBOX", 799, 190, "Console"));
		produtos.add(new ProdutoBean(3,"WII", 699, 150, "Console"));
		produtos.add(new ProdutoBean(4,"iPhone 4S", 1699, 350, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(5,"Galaxy S3", 2199, 262, "Mobile/Tablet"));
		produtos.add(new ProdutoBean(6,"iPad 3", 1799, 290, "Mobile/Tablet"));
		
	}

	
}
