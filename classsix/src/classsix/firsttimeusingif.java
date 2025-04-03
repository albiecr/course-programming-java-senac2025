package classsix;

import java.util.Scanner;

public class firsttimeusingif {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float valor1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		float valor2 = scanner.nextFloat();;
		
		System.out.println("Escolha um número de acordo com a operaçãop desejada: 1 - Adiçao | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
		int operador = scanner.nextInt();
		
		scanner.close();
		
		if(operador >=1 && operador <=4) {
			if (operador == 1) {
				System.out.println("Resultado da soma dos valores é: " + (valor1 + valor2));
			}else if (operador == 2) {
				System.out.println("Resultado da subtração dos valores é: " + (valor1 - valor2));
			}else if (operador == 3) {
				System.out.println("Resultado da multiplicação dos valores é: " + (valor1 * valor2));
			}else {
				if (valor2 == 0) {
					System.err.println("Ops! Número inválido!");
				} else if(operador == 4) {
					System.out.println("Resultado da divisão dos valores é: " + (valor1 / valor2));
				}
			}
		}else {
			System.out.println("Operador Inválido");
			}
	}
}