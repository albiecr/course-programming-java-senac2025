package myactivities;

import java.util.Scanner;

public class SwitchCaseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		float valor1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		float valor2 = scanner.nextFloat();
		
		System.out.println("Digite o número correspondente à operação desejada: | 1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão |");
		int operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("A adição dos dois valores é igual a " + (valor1+valor2));
			break;
		case 2:
			System.out.println("A subtração dos dois valores é igual a " + (valor1-valor2));
			break;
		case 3:
			System.out.println("A multiplicação dos dois valores é igual a " + (valor1*valor2));
			break;
		case 4:
			if (valor2 == 0) {
				System.out.println("Não é possível fazer divisão por 0");
			}else
			System.out.println("A divisão de " + valor1 + " por " + valor2 + " é igual a "  + (valor1/valor2) + ".");
			break;
		default:
			System.out.println("Número inválido! Escolha apenas entre 1, 2, 3 e 4");
		}
		
		
	}

}
