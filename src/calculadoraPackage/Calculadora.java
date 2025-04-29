package calculadoraPackage;

import java.util.Scanner;

public class Calculadora {

	int opcao;
	static double a, b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual operacao deseja fazer?\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao");
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1: {
			
			System.out.println("Digite o primeiro valor: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			b = scanner.nextDouble();
			
			System.out.println(a + " + " + b + " = " + soma(a,b));
			
			break;
			
		}
		case 2:{
			
			System.out.println("Digite o primeiro valor: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			b = scanner.nextDouble();
			
			System.out.println(a + " - " + b + " = " + sub(a,b));
			
			break;
			
		}case 3:{
			
			System.out.println("Digite o primeiro valor: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			b = scanner.nextDouble();
			
			System.out.println(a + " * " + b + " = " + multiplicacao(a,b));
			
			break;
			
		}case 4:{
			
			System.out.println("Digite o primeiro valor: ");
			a = scanner.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			b = scanner.nextDouble();
			
			System.out.println(a + " / " + b + " = " + divisao(a,b));
			
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
