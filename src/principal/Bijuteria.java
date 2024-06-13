package principal;

public class Bijuteria extends Loja {
	private double metaVendas;
	
	public Bijuteria(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double metaVendas
		) {
		// Construtor necessário para ValidadorEtapa3
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.metaVendas = metaVendas;
	}
	
	public Bijuteria(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double metaVendas,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
		this.metaVendas = metaVendas;
	}

	public Bijuteria(
			String nome,
			int quantidadeDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			double metaVendas,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
		this.metaVendas = metaVendas;
	}
	
	@Override
	public String toString() {
		String lojaString = super.toString();
		
		return lojaString + "\nMeta Vendas: " + this.metaVendas;
	}

	public double getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
	}
}
