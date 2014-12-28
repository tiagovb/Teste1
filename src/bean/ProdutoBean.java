package bean;

public class ProdutoBean {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String nome;

	public ProdutoBean(int id,String nome, float valor, int totalVendas, String categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.totalVendas = totalVendas;
		this.categoria = categoria;
	}

	public ProdutoBean() {

	}

	private String descricao;
	
	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private float valor;
	private int totalVendas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
}
