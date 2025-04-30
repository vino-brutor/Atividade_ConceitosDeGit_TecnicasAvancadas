package calculadoraPackage;

import java.util.Scanner;

public class Calculadora {

	//--declaracao das variaveis--
	int opcaoDeOperacao; //variavale para escolher qual unfcao de operacao sera usada
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //declara o scanner para ler os valores int
		
		System.out.println("Qual operacao deseja fazer?\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao");
		int opcaoDeOperacao = scanner.nextInt(); 
		
		switch (opcaoDeOperacao) {
		
		//operacao de somar
		case 1: {
			
			somarValores(scanner);
			break;
			
		}
		
		//operacao de subtrair
		case 2:{
			
			subtrairValores(scanner);
			break;
			
		//operacao de multiplicar
		}case 3:{
			
			multiplicarValores(scanner);
			break;
			
		//operacao de dividir
		}case 4:{
			
			dividirValores(scanner);
			break;
			
		}
		
		default:
			//lanca um erro caso a opcao n seja uma das acimas
			throw new IllegalArgumentException("Unexpected value: " + opcaoDeOperacao);
		}
		
	}

	public static void somarValores(Scanner scanner) {
		
		//pede pro usuario informar os dois valores para informar depois
		System.out.println("Digite o primeiro valor: ");
		double primeiroValorDaConta = scanner.nextDouble(); 
		
		System.out.println("Digite o segundo valor: ");
		double segundoValorDaConta = scanner.nextDouble(); 
		
		scanner.close();
		
		//da print no resultado aplicando a funcao dentro do print para poupar liinhas
		System.out.println(primeiroValorDaConta + " + " + segundoValorDaConta + " = " + (primeiroValorDaConta + segundoValorDaConta));
	}
	
	public static void subtrairValores(Scanner scanner) {
		//pede pro usuario informar os dois valores para informar depois
		System.out.println("Digite o primeiro valor: ");
		double primeiroValorDaConta = scanner.nextDouble(); 
		
		System.out.println("Digite o segundo valor: ");
		double segundoValorDaConta = scanner.nextDouble();
		
		scanner.close();
		
		//da print no resultado junto com a chamada da funcao 
		System.out.println(primeiroValorDaConta + " - " + segundoValorDaConta + " = " + (primeiroValorDaConta - segundoValorDaConta));
	}
	
	public static void multiplicarValores(Scanner scanner) {
		//pede pro usuario informar os dois valores para informar depois
		System.out.println("Digite o primeiro valor: ");
		double primeiroValorDaConta = scanner.nextDouble(); 
		
		System.out.println("Digite o segundo valor: ");
		double segundoValorDaConta = scanner.nextDouble();
		
		scanner.close();
		
		//da print no resultado junto da chamada da funcao pra poupar linhas
		System.out.println(primeiroValorDaConta + " * " + segundoValorDaConta + " = " + (primeiroValorDaConta * segundoValorDaConta));
	}
	
	public static void dividirValores(Scanner scanner) {
		//pede pro usuario informar os dois valores para informar depois
		System.out.println("Digite o primeiro valor: ");
		double primeiroValorDaConta = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double segundoValorDaConta = scanner.nextDouble(); 
		
		//da print no resultado junto da chamada da funcao pra poupar as linhas
		System.out.println(primeiroValorDaConta + " / " + segundoValorDaConta + " = " + (primeiroValorDaConta / segundoValorDaConta));
	}
}
