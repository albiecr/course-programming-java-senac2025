package exemplo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor entre 2 e 6: ");
		int dia = scanner.nextInt();

		if (dia < 2 || dia > 6) {
			System.err.println("Valor Inválido!");
			return;
		}
		
		switch (dia) {
		case 2: 
			System.out.println("Hoje é segunda-feira.");
			break;
		case 3: 
			System.out.println("Hoje é terça-feira.");
			break;
		case 4: 
			System.out.println("Hoje é quarta-feira.");
			break;
		case 5: 
			System.out.println("Hoje é quinta-feira.");
			break;
		case 6: 
			System.out.println("Hoje é sexta-feira.");
			break;
		}
		scanner.close();
	}

}
