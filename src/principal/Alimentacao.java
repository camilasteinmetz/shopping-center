package principal;

public class Alimentacao extends Loja {
	private Data dataAlvara;

	public Alimentacao(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			Data dataAlvara
		) {
		// Construtor necessário para ValidadorEtapa3
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.dataAlvara = dataAlvara;
	}
	
	public Alimentacao(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			Data dataAlvara,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
		this.dataAlvara = dataAlvara;
	}

	public Alimentacao(
			String nome,
			int quantidadeDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			Data dataAlvara,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
		this.dataAlvara = dataAlvara;
	}

	@Override
	public String toString() {
		String lojaString = super.toString();
		
		return lojaString + "Data Alvará: " + dataAlvara;
	}
	
	public Data getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
	}
}
