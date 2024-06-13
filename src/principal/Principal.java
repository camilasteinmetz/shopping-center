package principal;

import java.util.Scanner;

public class Principal {
	public static void mostrarMenu() {
		System.out.println("\n--------------------------");
		System.out.println("(1) criar uma loja");
		System.out.println("(2) criar um produto");
		System.out.println("(3) sair");
	}
	
	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		boolean programaRodando = true;
		boolean opcaoValida = false;
		boolean criarLojaSelecionado = false;
		boolean criarProdutoSelecionado = false;
		
		int opcaoSelecionada = 0;
		while (programaRodando) {
			do {
				mostrarMenu();
				System.out.print("Opção selecionada: ");
				opcaoSelecionada = Integer.parseInt(inputUsuario.nextLine());
				
				if (opcaoSelecionada == 3) {
					opcaoValida = true;
					programaRodando = false;
				} else if (opcaoSelecionada != 1 && opcaoSelecionada != 2) {
					System.out.println("Opção inválida");
				} else if (opcaoSelecionada == 1){
					opcaoValida = true;
					criarLojaSelecionado = true;
				} else {
					opcaoValida = true;
					criarProdutoSelecionado = true;
				}
			} while (!opcaoValida);
			
			if (criarLojaSelecionado) {
				// Dados da Loja
				System.out.println("\n--------------------------");
				System.out.print("Digite o nome da Loja: ");
				String nomeLoja = inputUsuario.nextLine();
				System.out.print("Digite a quantidade de funcionários da Loja: ");
				int quantidadeDeFuncionarios = Integer.parseInt(inputUsuario.nextLine());
				System.out.print("Digite o salário base dos funcionários: ");
				String salarioBase = inputUsuario.nextLine();
				Double salarioBaseFuncionario = null;
				if (!salarioBase.isEmpty()) {
					salarioBaseFuncionario = Double.parseDouble(salarioBase);
				}
				// Endereço
				System.out.println("Informações de endereço da loja");
				System.out.print("Digite a rua: ");
				String rua = inputUsuario.nextLine();
				System.out.print("Digite a cidade: ");
				String cidade = inputUsuario.nextLine();
				System.out.print("Digite o estado: ");
				String estado = inputUsuario.nextLine();
				System.out.print("Digite o país: ");
				String pais = inputUsuario.nextLine();
				System.out.print("Digite o CEP: ");
				String cep = inputUsuario.nextLine();
				System.out.print("Digite o número: ");
				String numero = inputUsuario.nextLine();
				System.out.print("Digite o complemento: ");
				String complemento = inputUsuario.nextLine();
				
				Endereco enderecoLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
				// Data de fundacao
				System.out.println("Data de fundação da loja");
				System.out.print("Digite o dia: ");
				int dia = Integer.parseInt(inputUsuario.nextLine());
				System.out.print("Digite o mes: ");
				int mes = Integer.parseInt(inputUsuario.nextLine());
				System.out.print("Digite o ano: ");
				int ano = Integer.parseInt(inputUsuario.nextLine());
				
				Data dataDeFundacao = new Data(dia, mes, ano);
				
				System.out.print("Digite o número de produtos máximo no estoque: ");
				int estoqueProdutos = Integer.parseInt(inputUsuario.nextLine());
				
				Loja lojaCriada = null;
				if (salarioBaseFuncionario != null) {
					lojaCriada = new Loja(nomeLoja, quantidadeDeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataDeFundacao, estoqueProdutos);
				} else {
					lojaCriada = new Loja(nomeLoja, quantidadeDeFuncionarios, enderecoLoja, dataDeFundacao, estoqueProdutos);
				}
				System.out.println("Loja criada com sucesso!\n");
				System.out.println(lojaCriada);
			} else if (criarProdutoSelecionado){
				System.out.println("\n--------------------------");
				System.out.print("Digite o nome do produto: ");
				String nomeProduto = inputUsuario.nextLine();
				System.out.print("Digite o preço do produto: ");
				Double preco = Double.parseDouble(inputUsuario.nextLine());
				// Data de Validade
				System.out.println("Informações da validade do produto");
				System.out.print("Digite o dia: ");
				int dia = Integer.parseInt(inputUsuario.nextLine());
				System.out.print("Digite o mes: ");
				int mes = Integer.parseInt(inputUsuario.nextLine());
				System.out.print("Digite o ano: ");
				int ano = Integer.parseInt(inputUsuario.nextLine());
				
				Data dataDeValidade = new Data(dia, mes, ano);
				
				Produto produtoCriado = new Produto(nomeProduto, preco, dataDeValidade);
				System.out.println("Produto criado com sucesso!\n");
				System.out.println(produtoCriado);
			}
			criarLojaSelecionado = false;
			criarProdutoSelecionado = false;
			opcaoSelecionada = 0;
		}

		System.out.println("\n--------------------------");
		System.out.println("Programa encerrado.");
		System.out.println("\n--------------------------");
		inputUsuario.close();
	}

}
