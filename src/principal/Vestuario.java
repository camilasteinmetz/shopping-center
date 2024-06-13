package principal;

public class Vestuario extends Loja {
	private boolean produtosImportados;
	
	public Vestuario(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			boolean produtosImportados
		) {
		// Construtor necessario para ValidadorEtapa3
			super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
			this.produtosImportados = produtosImportados;
		}

	
	public Vestuario(
		String nome,
		int quantidadeDeFuncionarios,
		double salarioBaseFuncionario,
		Endereco endereco,
		Data dataFundacao,
		boolean produtosImportados,
		int capacidadeEstoque
	) {
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao,capacidadeEstoque);
		this.produtosImportados = produtosImportados;
	}

	public Vestuario(
			String nome,
			int quantidadeDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			boolean produtosImportados,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
		this.produtosImportados = produtosImportados;
	}
	
	@Override
	public String toString() {
		String lojaString = super.toString();
		
		return lojaString + "\nProdutos Importados: " + this.produtosImportados;
	}

	public boolean getProdutosImportados() {
		return produtosImportados;
	}

	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}
}
