package exemplo;

import java.util.Scanner;

public class SwitchComString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno (0 a 10): ");
		double nota = scanner.nextDouble();
		
		if (nota < 0 || nota > 10) {
			System.err.println("Nota é inválida! Digite valores entre 0 e 10.");
			return;
		}
		
		String conceito = "";
		
		if (nota > 9) {
			conceito = "A";
		} else if (nota >=7) {
			conceito = "B";
		} else if (nota >=5) {
			conceito = "C";
		}else {
			conceito = "D";
		}
		System.out.println("Seu conceito é: " + conceito);
		
		switch(conceito.toUpperCase()) {
			case "A":
				System.out.println("Excelente!");
				break;
			case "B":
				System.out.println("Bom!");
				break;
			case "C":
				System.out.println("Bom mas pode melhorar!");
				break;
			case "D":
				System.out.println("Precisa se esforçar mais!");
				break;
			default:
				System.out.println("COnceito inválido! Digite apenas A, B, C ou D.");
		}
		scanner.close();
	}

}
