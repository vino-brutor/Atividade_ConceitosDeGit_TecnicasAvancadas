package calculadoraPackage;

import java.util.Scanner;

public class Calculadora {

	int opcaoDeOperacao;
	static double primeiroValorDaConta, segundoValorDaConta;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual operacao deseja fazer?\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao");
		int opcaoDeOperacao = scanner.nextInt();
		
		switch (opcaoDeOperacao) {
		case 1: {
			
			System.out.println("Digite o primeiro valor: ");
			primeiroValorDaConta = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			segundoValorDaConta = scanner.nextDouble();
			
			System.out.println(primeiroValorDaConta + " + " + segundoValorDaConta + " = " + soma(primeiroValorDaConta,segundoValorDaConta));
			
			break;
			
		}
		case 2:{
			
			System.out.println("Digite o primeiro valor: ");
			primeiroValorDaConta = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			segundoValorDaConta = scanner.nextDouble();
			
			System.out.println(primeiroValorDaConta + " - " + segundoValorDaConta + " = " + sub(primeiroValorDaConta,segundoValorDaConta));
			
			break;
			
		}case 3:{
			
			System.out.println("Digite o primeiro valor: ");
			primeiroValorDaConta = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			segundoValorDaConta = scanner.nextDouble();
			
			System.out.println(primeiroValorDaConta + " * " + segundoValorDaConta + " = " + multiplicacao(primeiroValorDaConta,segundoValorDaConta));
			
			break;
			
		}case 4:{
			
			System.out.println("Digite o primeiro valor: ");
			primeiroValorDaConta = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			segundoValorDaConta = scanner.nextDouble();
			
			System.out.println(primeiroValorDaConta + " / " + segundoValorDaConta + " = " + divisao(primeiroValorDaConta,segundoValorDaConta));
			
			break;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double sub(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
}
