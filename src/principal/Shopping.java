package principal;

public class Shopping {
	private String nome;
	private Endereco endereco;
	private Loja[] lojas;
	
	public Shopping (String nome, Endereco endereco, int numeroDeLojas) {
		this.nome = nome;
		this.endereco = endereco;
		this.lojas = new Loja[numeroDeLojas];
	}
	
	public String toString() {
		return "Shopping\nNome: " + this.nome + "\nEndereco: " + this.endereco + "\nLojas: " + lojas;
	}
	
	public boolean insereLoja (Loja loja) {
		boolean lojaInserida = false;
		
		for (int i = 0; i < lojas.length; i++) {
			if (lojas[i] == null) {
				lojas[i] = loja;
				lojaInserida = true;
				System.out.println("Loja inserida com sucesso");
				break;
			}
		}
		if (!lojaInserida) {
			System.out.println("Erro: Lojas cheias. Não foi possível inserir.");
		}
		
		return lojaInserida;
	}
	
	public boolean removeLoja (String nomeLoja) {
		boolean lojaRemovida = false;
		
		for (int i = 0; i < lojas.length; i++) {
			if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
				lojas[i] = null;
				lojaRemovida = true;
				System.out.println("Loja removida com sucesso.");
				break;
			}
		}
		if (!lojaRemovida) {
			System.out.println("Erro: Loja não encontrada");
		}
		
		return lojaRemovida;
	}
	
	public int quantidadeLojasPorTipo(String tipoDeLoja) {
	    int quantidade = 0;
	    for (Loja loja : lojas) {
	        if (loja != null) {
	            switch (tipoDeLoja.toLowerCase()) {
	                case "bijuteria":
	                    if (loja instanceof Bijuteria) quantidade++;
	                    break;
	                case "alimentacao":
	                    if (loja instanceof Alimentacao) quantidade++;
	                    break;
	                case "informatica":
	                case "informática":
	                    if (loja instanceof Informatica) quantidade++;
	                    break;
	                case "cosmetico":
	                    if (loja instanceof Cosmetico) quantidade++;
	                    break;
	                case "vestuario":
	                    if (loja instanceof Vestuario) quantidade++;
	                    break;
	                default:
	                    break;
	            }
	        }
	    }
	    return quantidade;
	}
	
	public Informatica lojaSeguroMaisCaro() {
	    Informatica lojaComSeguroMaisCaro = null;
	    double maxSeguro = 0;

	    for (Loja loja : lojas) {
	        if (loja instanceof Informatica) {
	            Informatica informatica = (Informatica) loja;
	            if (informatica.getSeguroEletronicos() > maxSeguro) {
	                maxSeguro = informatica.getSeguroEletronicos();
	                lojaComSeguroMaisCaro = informatica;
	            }
	        }
	    }
	    return lojaComSeguroMaisCaro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Loja[] getLojas() {
		return lojas;
	}

	public void setLojas(Loja[] lojas) {
		this.lojas = lojas;
	}
}
