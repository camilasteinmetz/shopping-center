package principal;

public class Cosmetico extends Loja {
	private double taxaComercializacao;

	public Cosmetico(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double taxaComercializacao
		) {
		// Construtor para ValidadorEtapa3
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.taxaComercializacao = taxaComercializacao;
	}
	
	public Cosmetico(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double taxaComercializacao,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
		this.taxaComercializacao = taxaComercializacao;
	}

	public Cosmetico(
			String nome,
			int quantidadeDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			double taxaComercializacao,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
		this.taxaComercializacao = taxaComercializacao;
	}
	
	@Override
	public String toString() {
		String lojaString = super.toString();
		
		return lojaString + "\nTaxa de Comercialização: " + this.taxaComercializacao;
	}

	public double getTaxaComercializacao() {
		return this.taxaComercializacao;
	}

	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}
}
