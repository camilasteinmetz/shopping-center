package principal;

public class Loja {
	private String nome;
	private int quantidadeFuncionarios;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataFundacao;
	private Produto[] estoqueProdutos;
	
	public Loja(String nome, int quantidadeFuncionarios) {
		// Constructor para ValidadorEtapa1
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
	}
	
	public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
		// Constructor para ValidadorEtapa1
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}
	
	public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
		// Constructor para ValidadorEtapa2
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	public Loja(
			String nome,
			int quantidadeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao
		) {
		// Constructor para ValidadorEtapa2
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	public Loja(
			String nome,
			int quantidadeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			int capacidadeEstoque
		) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		this.estoqueProdutos = new Produto[capacidadeEstoque];
	}
	
	public Loja(
			String nome,
			int quantidaDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			int capacidadeEstoque
		) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidaDeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		this.estoqueProdutos = new Produto[capacidadeEstoque];
	}

	public double gastosComSalario() {
		if (this.salarioBaseFuncionario >= 0) {
			return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
		} else {
			return 0;
		}
	}
	
	public char tamanhoDaLoja() {
		if (this.quantidadeFuncionarios <= 10) {
			return 'P';
		} else if (this.quantidadeFuncionarios <= 30) {
			return 'M';
		} else {
			return 'G';
		}
	}
	
	public String toString() {
		return "Nome da loja: " + this.nome +
				"\nQuantidade de funcionários: " + this.quantidadeFuncionarios +
				"\nSalário base do funcionário: " + this.salarioBaseFuncionario +
				"\nEndereço: " + this.endereco +
				"\nData de Fundação: " + this.dataFundacao +
				"\nEstoque de Produtos: " + this.estoqueProdutos;
	}
	
	public void imprimeProdutos() {
		for(Produto produto: estoqueProdutos) {
			System.out.println("Produto: " + produto);
		}
	}
	
	public boolean insereProduto(Produto produto) {
		boolean produtoInserido = false;
		
		for (int i = 0; i < estoqueProdutos.length; i++) {
			if (estoqueProdutos[i] == null) {
				estoqueProdutos[i] = produto;
				produtoInserido = true;
				System.out.println("Produto inserido com sucesso.");
				break;
			}
		}
		if (!produtoInserido) {
			System.out.println("Erro: Estoque cheio. Não foi possível inserir o produto");
		}
		
		return produtoInserido;
	}
	
	public boolean removeProduto(String nomeProduto) {
		boolean produtoRemovido = false;
		
		for (int i = 0; i < estoqueProdutos.length; i++) {
			if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
				estoqueProdutos[i] = null;
				produtoRemovido = true;
				System.out.println("Produto removido com sucesso.");
				break;
			}
		}
		if (!produtoRemovido) {
			System.out.println("Erro: Produto não encontrado. Não foi possível remover.");
		}
		
		return produtoRemovido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}

	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Data dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public Produto[] getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(Produto[] estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
}
	

