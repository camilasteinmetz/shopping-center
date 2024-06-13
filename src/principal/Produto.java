package principal;

public class Produto {
	private String nome;
	private double preco;
	private Data dataValidade;
	
	public Produto (String nome, double preco) {
		// Constructor para ValidadorEtapa1
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto (String nome, double preco, Data dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}
	
	@Override
	public String toString() {
		return "Nome = " + this.nome + "\nPreço = " + this.preco + "\nValidade: " + dataValidade;
	}
	
	public boolean estaVencido(Data data) {
		boolean vencido = false;
		
		if (this.dataValidade.getAno() < data.getAno() ) {
			vencido = true;
		} else if (this.dataValidade.getMes() < data.getMes()) {
			vencido = true;
		} else if (this.dataValidade.getDia() < data.getDia()) {
			vencido = true;
		}
		
		return vencido;
	}


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
}
