package calculadoraPackage;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		int opcaoDeOperacao; //variavale para escolher qual unfcao de operacao sera usada
		Scanner scanner = new Scanner(System.in); //declara o scanner para ler os valores int
		
		do {
			System.out.println("Qual operacao deseja fazer?\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - sair");
			opcaoDeOperacao = scanner.nextInt(); 
			
			switch (opcaoDeOperacao) {
			
			//operacao de somar
			case 1: {
				
				executarSoma(scanner);
				break;
				
			}
			
			//operacao de subtrair
			case 2:{
				
				executarSubtracao(scanner);
				break;
				
			//operacao de multiplicar
			}case 3:{
				
				executarMultiplicacao(scanner);
				break;
				
			//operacao de dividir
			}case 4:{
				
				executarDivisao(scanner);
				break;
				
			}
			case 5: {
				break;
			}
			default:
				//printa caso a opcao n seja uma das acimas, pra ssim o usuario n ter erro
				System.out.println("\nOpcao invalida tente novamente\n");
			}
			
		}while(opcaoDeOperacao != 5);
		
		System.out.println("\nSaindo...");
		scanner.close();
		
	}

	public static void executarSoma(Scanner scanner) {
		
		//devolve os valores selecionados pelo usuario num array
		double[] valoresEscolhidos = lerDoisValoresParaCalcular(scanner);
		
		//resultado
		System.out.println("\n" + valoresEscolhidos[0] + " + " + valoresEscolhidos[1] + " = " + (valoresEscolhidos[0] + valoresEscolhidos[1])+"\n");
	}
	
	public static void executarSubtracao(Scanner scanner) {
		
		//devolve os valores selecionados pelo usuario num array
		double[] valoresEscolhidos = lerDoisValoresParaCalcular(scanner);
		
		System.out.println("\n" + valoresEscolhidos[0] + " - " + valoresEscolhidos[1] + " = " + (valoresEscolhidos[0] - valoresEscolhidos[1])+"\n");
	}
	
	public static void executarMultiplicacao(Scanner scanner) {
		
		//devolve os valores selecionados pelo usuario num array
		double[] valoresEscolhidos = lerDoisValoresParaCalcular(scanner);
		
		//resultado
		System.out.println("\n" + valoresEscolhidos[0] + " * " + valoresEscolhidos[1] + " = " + (valoresEscolhidos[0] * valoresEscolhidos[1])+"\n");
	}
	
	public static void executarDivisao(Scanner scanner) {
		
		//devolve os valores selecionados pelo usuario num array
		double[] valoresEscolhidos = lerDoisValoresParaCalcular(scanner);
		
		//resultado
		System.out.println("\n" + valoresEscolhidos[0] + " / " + valoresEscolhidos[1] + " = " + (valoresEscolhidos[0] / valoresEscolhidos[1])+"\n");
	}
	
	public static double[] lerDoisValoresParaCalcular(Scanner scanner) {
		
		// pede pro usuario informar os dois valores para informar depois
		System.out.println("Digite o primeiro valor: ");
		double primeiroValorDaConta = scanner.nextDouble();

		System.out.println("Digite o segundo valor: ");
		double segundoValorDaConta = scanner.nextDouble(); 
		
		return new double[] {primeiroValorDaConta, segundoValorDaConta};
	}
}
