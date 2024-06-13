package principal;

public class Informatica extends Loja {
	private double seguroEletronicos;
	
	public Informatica(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double seguroEletronicos
		) {
		// Construtor necessário para ValidadorEtapa3
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.seguroEletronicos = seguroEletronicos;
	}
	
	public Informatica(
			String nome,
			int quantidadeDeFuncionarios,
			double salarioBaseFuncionario,
			Endereco endereco,
			Data dataFundacao,
			double seguroEletronicos,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
		this.seguroEletronicos = seguroEletronicos;
	}

	public Informatica(
			String nome,
			int quantidadeDeFuncionarios,
			Endereco endereco,
			Data dataFundacao,
			double seguroEletronicos,
			int capacidadeEstoque
		) {
		super(nome, quantidadeDeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
		this.seguroEletronicos = seguroEletronicos;
	}
	
	@Override
	public String toString() {
		String lojaString = super.toString();
		
		return lojaString + "Seguro Eletrônicos: " + this.seguroEletronicos;
	}

	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}

	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}
}
