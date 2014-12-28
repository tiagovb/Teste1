package bean;

public class Carro {
	public Carro(String nome, int ano, String caracteristicas) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.caracteristicas = caracteristicas;
	}
	private String nome;	
	private int ano;
	private String caracteristicas;
	public String getCaracteristicas() {
		return caracteristicas;
	}
     
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}



	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
